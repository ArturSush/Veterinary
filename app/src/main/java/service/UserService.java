package service;

import dto.UserBeanResponse;
import model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    User getUserById (Integer id);
    User getUserByEmail (String email);
    void deleteUser (Integer id);
    List<User> getAllUser();
    User updateUser (User user);
    UserBeanResponse reg(User userToReg);
    UserBeanResponse login(User userToLogin);
}
