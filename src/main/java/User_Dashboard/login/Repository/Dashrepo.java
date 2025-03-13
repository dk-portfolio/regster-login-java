package User_Dashboard.login.Repository;

import User_Dashboard.login.Entity.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dashrepo extends JpaRepository<Dashboard,Integer> {
}
