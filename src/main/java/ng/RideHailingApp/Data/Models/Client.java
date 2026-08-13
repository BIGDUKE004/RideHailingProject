package ng.RideHailingApp.Data.Models;

import lombok.Data;

@Data
public class Client {
    private String userName;
    private String fullName;
    private int id;
    private long contact;
    private String password;
    private boolean isLoggedIn = false;
}
