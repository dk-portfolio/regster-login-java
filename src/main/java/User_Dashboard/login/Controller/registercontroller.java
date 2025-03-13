package User_Dashboard.login.Controller;

import User_Dashboard.login.Entity.Dashboard;
import User_Dashboard.login.dto.Userdto;
import User_Dashboard.login.services.Userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
@Controller
public class registercontroller {
        @Autowired
        Userservices userservices;

        @GetMapping()
        public String showRegistrationForm() {
          //  model.addAttribute("user", new Userdto());
            return "registration.html";
        }

//        @PostMapping("/change-register")
//        public String register(@ModelAttribute("user") Dashboard user, Model model) {
//            userservices.register(user);
//            return " redirect:login.html";         }

        @GetMapping("/login")
        public String showLoginForm() {
            return "login";
        }
    }

