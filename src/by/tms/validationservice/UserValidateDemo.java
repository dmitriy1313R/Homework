package by.tms.validationservice;

public class UserValidateDemo {
    public static void main(String[] args) {
        User validUser = new User("Dimon","Dimonius",18);
        User invalidUser2 = new User("Li","Hu",40);
        User invalidUser16 = new User("NameMoreThanFifteen", "LastNameMoreThanFifteen", 153);

        UserValidationalService validationalService = new UserValidationalService();
        System.out.println("Validation 1");
        System.out.println("----------------------------------------------------------");
        validationalService.validate(validUser);
        System.out.println("\nValidation 2");
        System.out.println("----------------------------------------------------------");
        validationalService.validate(invalidUser2);
        System.out.println("\nValidation 3");
        System.out.println("----------------------------------------------------------");
        validationalService.validate(invalidUser16);

    }
}
