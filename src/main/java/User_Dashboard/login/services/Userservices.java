package User_Dashboard.login.services;

import User_Dashboard.login.Entity.Dashboard;
import User_Dashboard.login.Repository.Dashrepo;
import User_Dashboard.login.dto.Userdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservices {
    @Autowired
    Dashrepo dashrepo;
    public void register(Dashboard dashboard) {
        dashrepo.save(dashboard);
    }
    public List<Dashboard> getAllUsers() {
        return dashrepo.findAll();
    }
}
