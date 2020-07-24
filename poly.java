public class poly{
    public void check(){
        System.out.println("hello i am check 1");
    }
    public void check(int a){
        System.out.println("hello i am check 2 with value:"+a);
    }
    public String check(String a){
        System.out.println("hello i am check 3 with String:"+a);
        return a ;
    }
    public static void main(String args[]){
        poly obj = new poly();
        obj.check();
        obj.check(1);
        String a = obj.check("Akash");
        System.out.println(a);
    }
}