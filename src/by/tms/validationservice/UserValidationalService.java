package by.tms.validationservice;

public class UserValidationalService {

    public void validate(User user) {
        String firstName = user.getFirstName();
        int nameLength = firstName.length();
        if (nameLength > 3 && nameLength < 15){
            System.out.println("Имя пользователя соответствует");
        }else {
            System.out.println(UserValidationalExeption.INVALID_NAME_ERROR);
        }

    }
}
