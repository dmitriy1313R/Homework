package by.tms.loginservice.user;


import by.tms.loginservice.user.User;

public class UserLoginService {

    public static boolean validatePassword(User user, String inputPassword) {
        return user.getPassword().equals(inputPassword);
    }

    public static User getUser(User[] userData, String inputLogin) {
        for (int i = 0; i < userData.length; i++) {
            if (userData[i].getName().equals(inputLogin)) {
                return userData[i];
            }
        }
        return null;
    }

    /**
     * Authenticate method by the following parameters
     * @param inputLogin    provided
     * @param inputPassword provided
     * @return -1 if account is blocked, 1 if inputLogin is ok, 0 if inputLogin failed
     */
    public static int authenticateUser(User[] userData, String inputLogin, String inputPassword) {
        User user = getUser(userData, inputLogin);
        if (user == null) {
            return 0;
        }
        int counter = user.getTries();
        if (counter > 0) {
            boolean isPasswordValid = validatePassword(user, inputPassword);
            if (!isPasswordValid) {
                user.reduceTries();
            }

            return isPasswordValid ? 1 : 0;
        } else {
            return -1;
        }
    }

    public static void authenticateUserWithStatus(User[] userData, String inputLogin, String inputPassword) {
        int status = authenticateUser(userData, inputLogin, inputPassword);
        getAuthenticateStatus(status);
    }

    public static void getAuthenticateStatus(int authenticateStatus) {
        if (authenticateStatus == 1) {
            System.out.println("Login is successful");
        } else if (authenticateStatus == 0) {
            System.out.println("Your login or password are not valid");
        } else {
            System.out.println("This account is blocked");
        }
    }


}
