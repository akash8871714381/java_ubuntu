import java.io.*;
import java.net.*;
import java.util.*;
public class server {
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            ServerSocket s = new ServerSocket(1234);
            Socket sock = s.accept();
            DataInputStream dis = new DataInputStream(sock.getInputStream());
            DataOutputStream dout = new DataOutputStream(sock.getOutputStream());
            String str = (String) dis.readUTF();
            // while(str != "#"){
            //     System.out.println("Msg:"+str);
            //     System.out.println("Enter Your msg");
            //     dout.writeUTF(sc.nextLine());
            //     str = (String) dis.readUTF();
            //     System.out.print("fu");
            //     if(str=="#"){
            //         System.out.print("i am hear");
            //         break;
            //     }
            // // }
            // dout.flush();
            // dout.close();
            s.close();
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}