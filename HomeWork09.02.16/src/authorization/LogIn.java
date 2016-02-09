package authorization;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        LogIn logInObject = new LogIn();
        String user = "";

        System.out.println("Введите логин: ");

        Scanner login = new Scanner(System.in);
        String loginInfo = login.next().toLowerCase();

        assert loginInfo.length() > 2 : "Зайдите как Guest";

        System.out.println("Введите пароль: ");
        String passwordInfo = login.next();


        try {

          user =  logInObject.getInfo(loginInfo,passwordInfo);

        } catch (LogInExeption logInExeption) {
            logInExeption.printStackTrace();
            System.out.println("Вы вошли как гость");
        }

        UsersList usersList = UsersList.findUser(user);
        System.out.println(usersList);
    }


    public String getInfo(String loginInfo, String passwordInfo) throws LogInExeption {
        String choiceOfUser;

        if (loginInfo.equals("admin") && passwordInfo.equals("ADMIN")){
            choiceOfUser = "ADMIN";
        }else if (loginInfo.equals("moder") && passwordInfo.equals("MODER")){
            choiceOfUser = "MODER";
        }else if (loginInfo.equals("user") && passwordInfo.equals("USER")){
            choiceOfUser = "USER";
        }else if (loginInfo.equals("guest") && passwordInfo.equals("0")){
            choiceOfUser = "GUEST";
        }else {
            throw new LogInExeption();
        }

        return choiceOfUser;
    }

}
