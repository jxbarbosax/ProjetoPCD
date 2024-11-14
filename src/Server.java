import java.io.*;
import java.net.*;

public class Server {
    private ServerSocket serverSocket;

    public Server(int port) throws java.io.IOException {
        this.serverSocket = new ServerSocket(port);
    }

    public void start() {
        try {
            while (true) { // Permite aceitar múltiplas conexões
                System.out.println("Aguarda conexão do cliente...");
                Socket socket = serverSocket.accept();
                System.out.println("Cliente conectado!");

                // Cria uma nova thread para cada conexão de cliente
                new ClientHandler(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                // Cria os fluxos de entrada e saída
                out = new PrintWriter(socket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Mensagem do cliente: " + message);
                    out.println("Mensagem recebida: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    in.close();
                    out.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
