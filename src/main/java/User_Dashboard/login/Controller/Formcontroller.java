package User_Dashboard.login.Controller;


import User_Dashboard.login.Entity.Dashboard;
import User_Dashboard.login.dto.Userdto;
import User_Dashboard.login.services.Userservices;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@CrossOrigin(origins ="http://127.0.0.1:5500")
@RestController
public class Formcontroller {
    @Autowired
    Userservices userservices;
    @PostMapping("/register")
    public String register( Userdto userdto) {
        Dashboard dashboard = new Dashboard();
        dashboard.setUserName(userdto.getUserName());
        dashboard.setPassword(userdto.getPassword());
        dashboard.setEmail(userdto.getEmail());
        dashboard.setRole(userdto.getRole());
        userservices.register(dashboard);
        return "finish";
    }
}
