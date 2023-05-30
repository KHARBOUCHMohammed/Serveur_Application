
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TP13{

    public static void main(String[] args) {
      //  String host = "http://10.104.27.102:8080/tp1/tp1";
        String host = "http://desktop-u53qfcm:8080/TP1/Question1";
        
        URL url = null;
            try {
                url= new URL(host);
                URLConnection con = url.openConnection();
                BufferedReader in = new BufferedReader(
                new InputStreamReader(
                con.getInputStream(),"UTF-8"));
                String inputline;
                while((inputline = in.readLine())!=null){
                    System.out.println(inputline);
                }
            }
            catch (IOException e1) {
            e1.printStackTrace();
            
            }
        }
    
}