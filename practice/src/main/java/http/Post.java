package http;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author bce1100
 * @date 2018/8/8.
 */
public class Post {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://qt.gtimg.cn");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Charset", "UTF-8");
        connection.setUseCaches(false);
        connection.setInstanceFollowRedirects(true);
        connection.setRequestProperty("Content-Type",
                "application/json");
        connection.connect();
        PrintWriter out = new PrintWriter(connection.getOutputStream());
        out.print("q=s_sz300170");
        out.flush();
        InputStream is = connection.getInputStream();
        InputStreamReader isr = new InputStreamReader(is,"GBK");
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        if(line!=null){
            System.out.println(line);
        }
        br.close();
        isr.close();
        is.close();
        out.close();
    }
}
