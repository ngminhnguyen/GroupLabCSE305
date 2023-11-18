package director;

import builder.UserBuilder;

public class UserDirector {

    private UserBuilder userBuilder;

    public UserDirector(UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }

    public product.User constructUser(String userID, String password, String userName, String mail, int phoneNumber, String type) {

        return userBuilder
                .setUserID(userID)
                .setPassword(password)
                .setUserName(userName)
                .setMail(mail)
                .setPhoneNumber(phoneNumber)
                .setType(type)
                .build();
    }
}
