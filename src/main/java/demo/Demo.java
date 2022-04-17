package demo;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

    public static void main(String[] args){

        loginForm("Login_%", "Parol!", "Parol!");
    }

    public static boolean loginForm(String login, String password, String confirmPswd){
        try {
        Pattern pattern2 = Pattern.compile("^\\w+(?=.*!)|(?=!.*){1,20}$");
        Matcher matcherPassword = pattern2.matcher(password);
            Pattern pattern1 = Pattern.compile("^\\w{1,20}$");
            Matcher matcherLogin = pattern1.matcher(login);
            if (matcherLogin.find()){
                if (matcherPassword.find()) {
                    if (confirmPswd.equals(password)) {
                        return true;
                    }else{
                    throw new WrongPasswordException("Invalid Password", "Password Error");
                }
                } else {
                    throw new WrongPasswordException("Invalid Password", "Password Error");
                }
            } else {throw new WrongLoginException("Invalid Login", "Invalid Password", "Login Error");
        }
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
        return true;
    }
}


