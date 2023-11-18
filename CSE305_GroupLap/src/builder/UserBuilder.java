package builder;

import product.User;

public abstract class UserBuilder {
    protected String userID;
    protected String password;
    protected String userName;
    protected String mail;
    protected int phoneNumber;
    protected String type;

    public UserBuilder(String userID, String type) {
        this.userID = userID;
        this.type = type;
    }
    public abstract UserBuilder setUserID(String userID);
    
    public abstract UserBuilder setUserName(String username);

     public abstract UserBuilder setPassword(String password);

    public abstract UserBuilder setMail(String mail);

    public abstract UserBuilder setPhoneNumber(int phoneNumber);

    public abstract UserBuilder setType(String type);

    public abstract User build();
}
