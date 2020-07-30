import java.io.*;
import java.net.*;
// https://www.w3schools.com/css/default.asp
public class findip{
    public static void main(String args[]){
        try{
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("Ip :"+ip.getHostAddress());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
