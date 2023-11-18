package product;

public class User {
    String userID;
    String password;
    String userName;
    String mail;
    int phoneNumber;
    String type;

    public User(String userID, String password, String userName, String mail, int phoneNumber, String type) {
        this.userID = userID;
        this.password = password;
        this.userName = userName;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

}
