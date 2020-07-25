import java.util.*;
import java.io.*; 
public class exceptions{
    public static void main(String args[]){
        try{
            //code
            int a = 0;
            int b = a/a;
        }catch(Exception e){
            System.out.print(e);
        }
    }
}