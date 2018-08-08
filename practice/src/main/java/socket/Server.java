package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author bce1100
 * @date 2018/8/8.
 */
public class Server {
    public static void main(String[] args) {
        System.out.println("server已经启动，等待client……");
        ServerSocket server = null;
        Socket socket = null;
        BufferedReader br = null;
        try {
             server= new ServerSocket(19715);
             socket = server.accept();
             br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = br.readLine();
            System.out.println("client说："+line);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                socket.close();
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
