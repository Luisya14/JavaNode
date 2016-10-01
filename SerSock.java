import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.ServerSocket;
import javax.xml.bind.DatatypeConverter;
import Socket.SocketNode;
import Socket.Estructura;


public class SerSock{
  public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
    ServerSocket serverSocket = new ServerSocket(4444);
    Socket socket;

    ServerSocket server;
    Socket connection;
    while(true){
        socket = serverSocket.accept();
        PrintWriter out = new PrintWriter(socket.getOutputStream(),
        true);
        BufferedReader in = new BufferedReader(
          new InputStreamReader(socket.getInputStream()));

        String inputLine,outputLine;
        while((inputLine = in.readLine()) != null) {
           System.out.println(inputLine);

         }
    }
}
}
