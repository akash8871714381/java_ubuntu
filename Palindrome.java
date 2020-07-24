import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number");
        n = scn.nextInt();
        int temp = n;
        int rev=0,rem;
        while(temp!=0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;

        }
        if(n==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("non palindrome");
        }
    }
    
    
}