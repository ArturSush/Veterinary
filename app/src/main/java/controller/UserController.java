package controller;
import dto.UserBeanResponse;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import service.UserService;
@Controller
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/reg")
    public String signInUser(@Validated User userToCreate,
                             BindingResult result,
                             Model model) {
        UserBeanResponse response = service.reg(userToCreate);
        String message = response.getMessage();
        if (message != null) {
            model.addAttribute("message", message);
        }
        return "regResponse";
    }

    @GetMapping("/logInUser")
    public String logInUserPage(User userToLogIn) {
        return "login";
    }

    @PostMapping("/login")
    public String enterUser(@Validated User enteredUser,
                            BindingResult result,
                            Model model) {
        UserBeanResponse response = service.login(enteredUser);
        String message = response.getMessage();
        if (message != null) {
            model.addAttribute("errorMessage", message);
            return "login";
        }
        model.addAttribute("user", service.getUserByEmail(response.getUser().getEmail()));
        return "mainPage";
    }



}
