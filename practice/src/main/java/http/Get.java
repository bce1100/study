package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author bce1100
 * @date 2018/8/8.
 */
public class Get {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://qt.gtimg.cn/q=s_sz300170");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Charset", "UTF-8");
        connection.setUseCaches(false);
        connection.setInstanceFollowRedirects(true);
        connection.setRequestProperty("Content-Type",
                "application/json");
        connection.connect();
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
    }
}
