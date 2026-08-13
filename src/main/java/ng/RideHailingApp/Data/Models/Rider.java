package ng.RideHailingApp.Data.Models;

import lombok.Data;

@Data
public class Rider {
    private String userName;
    private String fullName;
    private int id;
    private long contact;
    private String password;
    private String vehicleBrand;
    private String paymentMethod;
    private boolean isLoggedIn = false;
}

