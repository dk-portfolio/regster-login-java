package User_Dashboard.login.Controller;
import User_Dashboard.login.Entity.Dashboard;
import User_Dashboard.login.dto.Userdto;
import User_Dashboard.login.services.Userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@CrossOrigin(origins ="http://127.0.0.1:5500")
@RestController
public class Logincontroler {

        @Autowired
        Userservices userservices;

        @PostMapping("/login")
        public String login(@RequestBody Userdto login) {
            List<Dashboard> allUsers = userservices.getAllUsers();
            for (Dashboard user : allUsers) {
                if (user.getUserName().equals(login.getUserName())) {
                    System.out.println("User found: " + login.getUserName());
                    return "logged";
                }
            }
            return "not logged"; // Fixed typo
        }
    }

