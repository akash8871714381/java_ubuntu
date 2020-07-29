import java.io.*;  
import java.net.*; 
import java.util.*; 
public class client{
    public static void main(String args[]){
        try{
            Socket s = new Socket("localhost",1234);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your msg");
            String str = sc.nextLine();
            dout.writeUTF(str);
            // while(str != "#"){
            //      str = (String) dis.readUTF();
            //      System.out.println("MSG:"+str);
            //      str=sc.nextLine();
            //      dout.writeUTF(str);
            //      System.out.print(str);
            //      if(str=="#"){
            //         System.out.print("i am hear");
            //          break;
            //      }
            // }
            
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}