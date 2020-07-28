import java.io.File;
import java.util.Scanner;
import java.io.*;
public class file1{
    public static void main(String args[]){
        File obj = new File("demo.txt");
        try{
            Scanner r = new Scanner(obj);
            while(r.hasNextLine()){
                String b = r.nextLine();
                System.out.print(b);
            }
        }catch (FileNotFoundException e ){

        }
       
    }
}
