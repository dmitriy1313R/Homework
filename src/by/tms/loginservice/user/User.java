package by.tms.loginservice.user;

public class User {

    private String name;
    private String password;
    private int tries = 3;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String login) {
        this.name = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTries() {
        return tries;
    }

    public void reduceTries() {
        this.tries--;
    }

}
