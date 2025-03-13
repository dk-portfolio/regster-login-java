package User_Dashboard.login.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Userdto {
    private String userName;
    private String password;
    private  String email;
    private  String role;
}
