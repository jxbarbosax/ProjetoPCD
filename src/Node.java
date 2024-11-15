import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Node {
    private int port;
    private String pastaDiretorio;



    public Node (int port, String pastaDiretorio) {
       this.port = port;
       this.pastaDiretorio = pastaDiretorio;
    }

    public void startServing () throws IOException {
        ServerSocket ss = new ServerSocket ( port );
        try {
            while ( true ){
                Socket socket = ss . accept ();
                handleCliente(socket);
            }
        } finally {
            ss . close ();
        }
    }

    private void handleCliente(Socket socket){

    }

    public void ligarNode(Socket socket){

    }
}
