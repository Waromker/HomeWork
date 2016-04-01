package com;





import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6009);
        List<Thread> threads = new ArrayList<Thread>();
        ExecutorService service = Executors.newFixedThreadPool(2);
        while (true){
            if(threads.size() > 2) {
                System.out.println("wait a minute");

            } else {
                ClientHandler clientHandler = new ClientHandler(serverSocket.accept(), 6009);
                threads.add(clientHandler);

                service.execute(clientHandler);
            }

           }
        }
    }

