import java.io.*;  
import java.net.*; 
import java.util.*; 
public class client{
    public static void main(String args[]){
        try{
            Socket s = new Socket("localhost",1234);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(sock.getInputStream());
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your msg");
            String str = sc.nextLine()
            dout.writeUTF(str);
            while(str == "#")
            
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}