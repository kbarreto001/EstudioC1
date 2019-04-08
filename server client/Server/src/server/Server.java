
package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class Server {

    public static void main(String[] args) {
        System.out.println("Soy el servidor");
        ServerSocket server;
        Socket connection;

        DataOutputStream output;
        DataInputStream input;  
        
        int counter = 1, SIZE=100;
        
        try {
            //Step 1 crear un serversocket
            server = new ServerSocket(5000,100);
            while (true){
                
                //Step 2 esperar solicitud conexion
                connection = server.accept();
                System.out.println("concexion: " + counter + " received from: " + connection.getInetAddress().getHostName());
                
                //step 3 abrir canales e/s
                input = new DataInputStream(connection.getInputStream());
                output = new DataOutputStream(connection.getOutputStream());
                
                //step 4 metodos de manejo de strems de entrada y salida
                output.writeUTF("Conexion succesful");
                System.out.println("Client message: " + input.readUTF());
                
                //step 5 cerrar conexion
                connection.close();
                ++counter;
            }  
        } catch (IOException e) {
            System.out.println(e);
        }
    }   
}
