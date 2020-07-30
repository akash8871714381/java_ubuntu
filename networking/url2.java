// https://www.google.co.in/blog
// https://www.w3schools.com/css/default.asp
import java.net.*;
import java.util.*;
public class url2{
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter url");
            String str = sc.nextLine();
            URL url = new URL(str);
            System.out.println("port:"+url.getFile());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}