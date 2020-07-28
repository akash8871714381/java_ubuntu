import java.io.*;
import java.net.*;
public class server {
    public static void main(String args[]){
        try{
            ServerSocket s = new ServerSocket(1234);
            Socket sock = s.accept();
            DataInputStream dis = new DataInputStream(sock.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            String str = (String) dis.readUTF();
            while(str == '#'){
                System.out.println("Msg:"+str);
                System.out.println("Enter Your msg");
                dout.writeUTF(sc.nextLine());
                str = (String) dis.readUTF();
            }
            
            s.close();
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}