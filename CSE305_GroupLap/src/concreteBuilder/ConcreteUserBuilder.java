package concreteBuilder;

import builder.UserBuilder;
import product.User;

public class ConcreteUserBuilder extends UserBuilder {

    public ConcreteUserBuilder(String userID, String type) {
        super(userID, type);
    }

    @Override
    public UserBuilder setUserName(String username) {
        this.userName = username;
        return this;
    }

    @Override
    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public UserBuilder setMail(String mail) {
        this.mail = mail;
        return this;
    }

    @Override
    public UserBuilder setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public UserBuilder setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public User build() {
        return new User(userID, password, userName, mail, phoneNumber, type);
    }

}
