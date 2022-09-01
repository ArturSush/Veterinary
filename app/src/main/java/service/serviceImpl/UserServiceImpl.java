package service.serviceImpl;

import dto.UserBeanResponse;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.UserService;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User getUserById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public User getUserByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<User> getAllUser() {
        return repository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User user1 = repository.findById(user.getId()).orElse(null);
        if (Objects.nonNull(user)) {
            user1.setName(user.getName());
            user1.setAge(user.getAge());
            user1.setEmail(user.getEmail());
            repository.save(user1);
        }
        return user1;
    }

    @Override
    public UserBeanResponse reg(User userToReg) {
        UserBeanResponse response = new UserBeanResponse();
        User userInDB = repository.findByEmail(userToReg.getEmail());
        User savedUser = null;
        if(userInDB==null){
            if(userToReg.getPass()==userToReg.getConfPass()){
                savedUser.setEmail(userToReg.getEmail());
                savedUser.setPass(userToReg.getPass());
                savedUser.setConfPass(userToReg.getConfPass());
                repository.save(savedUser);
                response = new UserBeanResponse(savedUser,"U successfully registred");
            }
            else {
                response = new UserBeanResponse(userToReg,"Passwords don't match");
            }
        }else {
            response = new UserBeanResponse(userToReg,"User already exist");
        }
        return response;
    }

    @Override
    public UserBeanResponse login(User userToLogin) {
        UserBeanResponse response = new UserBeanResponse();
        User userInDB = repository.findByEmail(userToLogin.getEmail());
        if(userInDB.getEmail()!=null){
            if(userInDB.getPass()==userToLogin.getPass()){
                response= new UserBeanResponse(userToLogin,"U successfully log in");
            }else{
                response= new UserBeanResponse(userToLogin,"Passwords don't match");
            }

        }else {
            response= new UserBeanResponse(null,"User don't exist");
        }
        return response;
    }
}
