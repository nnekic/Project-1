import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppZaProjekat {
    public static void main(String[] Args) throws IOException { 
        ServerSocket serverSocket = new ServerSocket(8081);
        Socket clientSocket = serverSocket.accept();
        OutputStream outputStream = clientSocket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
        outputStream.write("Content-Type: text/plain\r\n".getBytes());
        outputStream.write("\r\n".getBytes());
        outputStream.write("This is simple java app".getBytes());
        outputStream.flush();
        clientSocket.close();




    };

}



