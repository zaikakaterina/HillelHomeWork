package exceptions;

public class WrongLoginException extends WrongPasswordException {
    private String loginExceptionTitle;

    public WrongLoginException(String message, String passwordExceptionTitle, String loginExceptionTitle) {
        super(message, passwordExceptionTitle);
        this.loginExceptionTitle = loginExceptionTitle;
    }

    public String getLoginExceptionTitle() {
        return loginExceptionTitle;
    }
}
