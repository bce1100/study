package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author bce1100
 * @date 2018/8/8.
 */
public class Client {
    public static void main(String[] args) {
        Socket client = null;
        PrintWriter pw = null;
        try {
            client= new Socket("localhost",19715);
            pw = new PrintWriter(client.getOutputStream());
            pw.write("socket超简单例子");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            pw.flush();
            pw.close();
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
