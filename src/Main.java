import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import validations.DataValidator;

import static validations.DataValidator.validateData;

public class Main {
    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";
        try {
            validateData(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }
}