package com;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler extends Thread {
    private Socket socket;
    private  int port;

    public ClientHandler(Socket socket, int port) {
        this.socket = socket;
        this.port = port;
    }



    @Override
    public void run() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            while (true){
                String msgFromClient = bufferedReader.readLine();
                System.out.println("Handler -> get msg from client " + msgFromClient);
                printWriter.println(msgFromClient.toUpperCase());
                printWriter.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
