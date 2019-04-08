
package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        System.out.println("Soy el cliente");
        Socket client;
        
        DataOutputStream output;
        DataInputStream input;                       
        
        try {
            //Step 1 creamos el socket para establecer la concexion
            client = new Socket(InetAddress.getLocalHost(),5000);
            System.out.println("client port: " + client.getLocalPort());
            System.out.println("Server (host): " + InetAddress.getLocalHost());
            System.out.println("remote port: " + client.getPort());
            
            //Step 2 abrir canales E/S
            input = new DataInputStream(client.getInputStream());
            output = new DataOutputStream(client.getOutputStream());
            
            //Step 3 metodos de manejo de estreams de entrada y salida
            System.out.println("Server Message: " + input.readUTF());
            output.writeUTF("Thank you");
            
            //Step 4 cerrar conexion
            client.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
