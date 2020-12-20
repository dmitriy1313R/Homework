package by.tms.validationservice;

public class UserValidationalService {

    public void validate(User user) {
        String firstName = user.getFirstName();
        int firstNameLength = firstName.length();
        String lastName = user.getLastName();
        int lastNameLength = lastName.length();
        Integer ageOfName = user.getAgeOfName();
        //int ageOfNameLength = ageOfName.length();

        if (firstNameLength > 3 && firstNameLength < 15){
            System.out.println("Имя пользователя соответствует");
        }else {
            System.out.println(UserValidationalExeption.INVALID_FIRST_NAME_ERROR);
        }
        if (lastNameLength > 3 && lastNameLength < 15){
            System.out.println("Фамилия пользователя соответствует");
        }else {
            System.out.println(UserValidationalExeption.INVALID_LAST_NAME_ERROR);
        }
        if (ageOfName <= 120 && ageOfName >= 0){
            System.out.println("Возраст пользователя соответствует");
        }else {
            System.out.println(UserValidationalExeption.INVALID_AGE_ERROR);
        }
    }
}
