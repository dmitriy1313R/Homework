package by.tms.loginservice.user;


/*
 dao - data access object - development pattern
 */
public class UserData {

    private static final User[] userData = {
            new User("Dimon",  "qwerty"),
            new User("TMS", "pass"),
            new User("Rita","12345"),
            new User("Semen","nemeS")};

    public static User[] get() {
        return userData;
    }

    }
