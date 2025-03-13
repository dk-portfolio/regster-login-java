package User_Dashboard.login.Controller;

import User_Dashboard.login.services.Userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Logcontroller {
    @Autowired
    Userservices userservices;
    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Returns login.html (if using Thymeleaf)
    }
}
