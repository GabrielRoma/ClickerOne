package server;

import java.net.*;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author gabri_000
 */
public class ClickerOne_Server implements Runnable {

    private boolean conexao;
    
    public void setConexao(){
        conexao = true;
    }
    
    @Override
    public void run() {
        
        ArrayList<PrintStream> clientes = new ArrayList<>();
        
        try {
            ServerSocket server = new ServerSocket(5000);
            Socket socket;
            while (conexao) {
                socket = server.accept();
                System.out.println("Conectou");
                //guarda o endereço do cliente
                clientes.add(new PrintStream(socket.getOutputStream()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
