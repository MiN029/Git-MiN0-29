package Controller;

import Mode.User;
import Repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {


    UserRepository userRepository;

    @GetMapping("/signup")
    public String showSignUpForm(User user){
        return "adduser";
    }

    @PostMapping("/adduser")
    public String addUser(@Validated User user , BindingResult result , Model model){

        if(result.hasErrors()){
            return "adduser";
        }

        userRepository.save(user);
        return "redirect:/idex";
    }

    @GetMapping("/index")
    public String showAllUserList(Model model){
        model.addAttribute("user" , userRepository.findAll());
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id , Model model){
        User user = userRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("Invalid user id: " + id));
        model.addAttribute("user" , user);
        return "updateuser";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id , @Validated User user , BindingResult result , Model model) {
        if(result.hasErrors()){
            user.setId(id);
            return "updateuser";
        }
        userRepository.save(user);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable long id , Model model){
        User user = userRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("Invalid user ID : " + id));
        userRepository.delete(user);
        return "redirect:/index";
    }

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("test" , "text");
        return "text";
    }
}
