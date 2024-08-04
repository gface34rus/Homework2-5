package validations;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class DataValidator {
    public static void validateData(String login, String password, String confirmPassword) {
        if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongLoginException("Неверный формат логина! Используйте латинские буквы цифры 0-9 и/или символ _");
        }
        if (!password.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongPasswordException("Неверный формат пароля! Используйте латинские буквы цифры 0-9 и/или символ _");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }
}
