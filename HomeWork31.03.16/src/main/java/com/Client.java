package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Thread {
    private Socket socket;
    private int port;

    public Client(Socket socket, int port) {
        this.socket = socket;
        this.port = port;
    }

    @Override
    public void run() {
        try{
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String message = reader.readLine();
                printWriter.println(message);
                printWriter.flush();

                String messageFromServer = bufferedReader.readLine();
                System.out.println("Client -> massege from Handler " + messageFromServer);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        Socket socket = new Socket(inetAddress, 6009);
        new Client(socket, 6009).start();
    }
}
