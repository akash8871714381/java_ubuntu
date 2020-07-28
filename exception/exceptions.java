import java.util.*;
import java.io.*; 
class demo{
    void a() throws IOException{
        throw new IOException("error");
    }
    void b(){
        try{
            a();
        }catch(Exception e){
            System.out.println(e);
        }

       
    }
}
public class exceptions{
    public static void main(String args[]){
        try{
            demo obj = new demo();
            obj.b();
            int[] ar = {1,2,3,4,5};
            System.out.println(ar[5]);

        }
        catch(ArithmeticException e){
            System.out.println("1");
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally");
        }
    }
    
}