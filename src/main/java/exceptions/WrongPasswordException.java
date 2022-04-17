package exceptions;

import java.io.IOException;

public class WrongPasswordException extends IOException {
    private String passwordExceptionTitle;

    public WrongPasswordException(String message, String passwordExceptionTitle) {
        super(message);
        this.passwordExceptionTitle = passwordExceptionTitle;
    }

    public String getPasswordExceptionTitle() {
        return passwordExceptionTitle;
    }
}
