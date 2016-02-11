package employeer;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EmployeerAndBoss {


    static Logger logger = Logger.getLogger(EmployeerAndBoss.class.getName());

    public  void loggerMethod(String info) throws IOException {
        Handler handler = new FileHandler("./logsOfEmployeer",1024,5);
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);
        logger.info(info);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("This is list of Employeers\n");
        getInfoOfFirstEmployeer("");

    }

    public static void getInfoOfFourthEmployeer(String name, String role) throws IOException {
        EmployeerAndBoss logs = new EmployeerAndBoss();
        String loggin =name.concat(role);
        logs.loggerMethod(loggin);
        System.out.println(name);
        System.out.println(role);
        getInfoOfFirstEmployeer("end");
    }

    public static void getInfoOfThirdEmployeer(String name, String role) throws IOException {
        System.out.println(name);
        System.out.println(role);
        getInfoOfFourthEmployeer("\nBilli","He is a friend of Billi, and he know who noname guy is!");
    }

    public static void getInfoOfSecondEmployeer(String name, String role) throws IOException {
        System.out.println(name);
        System.out.println(role);
        getInfoOfThirdEmployeer("\nNoname guy","Nobody knows who is he, but everybody knows that he is a boss, and his boss is -");

    }

    public static void getInfoOfFirstEmployeer(String end) throws IOException {
        if (end.equals("")) {
            System.out.println(" This is Billi");
            System.out.println(" His role - man at the reception, but his boss  is -");
            getInfoOfSecondEmployeer("\nRon","He is manager, and his boss is -" );
        }
        System.out.println("This is the nice story of Billi's job!\n");
    }
}
