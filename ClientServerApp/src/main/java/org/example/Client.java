package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.IOException;
import java.io.PrintWriter;


public class Client {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("Localhost", Server.Port);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            writer.println("Vasiliy");
            System.out.println(reader.readLine());
        }
    }
}
