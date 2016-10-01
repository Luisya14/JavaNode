import Socket.SocketNode;
import Socket.Estructura;
import java.net.UnknownHostException;
import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
import java.nio.*;
import java.util.Scanner;


class main{
  public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
  // class instance
  SocketNode client = new SocketNode();
  Estructura person = new Estructura();
  BufferedInputStream bis;
  BufferedOutputStream bos;
  byte[] buf= new byte[400];
  byte[] byteArray;
  int in;
  person.nombre="Luis";
  person.id="990";
  person.balance=100;
  // socket tcp connection
  String ip = "localhost";
  int port = 8080;
  String filename="MyObject.ser";
  //try{
  // Serializar un objeto de datos a un archivo
  /*  ObjectOutputStream out = new ObjectOutputStream(new
    FileOutputStream("MyObject.ser"));
    out.writeObject(person);
    out.close();
    filename = "MyObject.ser";*/


    /*// Serializar un objeto de datos a un arreglo de bytes
    ByteArrayOutputStream bos = new ByteArrayOutputStream() ;
    out = new ObjectOutputStream(bos) ;
    out.writeObject(person);
    out.close();
    // Obtener los bytes del objeto serializado
    buf = bos.toByteArray();
    } catch (IOException e) {
  }*/

  String content = new Scanner(new File("./MyObject.ser")).useDelimiter("\\Z").next();


    client.socketConnect(ip, port);
    // writes and receives the message
    //String message = "Number"+i;

    System.out.println("Sending: " + content);
    String returnStr = client.echo(content);
    System.out.println("Receiving: " + content);

}
}
