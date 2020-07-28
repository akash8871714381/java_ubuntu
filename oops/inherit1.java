class detail{
    protected String name = "Akash";
    protected void print(){
        System.out.print("hello");
    }
}
class address extends detail {
    protected int age = 21;
}
public class inherit1 extends address{
    public static void main(String args[]){
        // detail obj = new detail();
        // System.out.print(obj.name);
        inherit1 obj = new inherit1();
        System.out.println(obj.name);
        System.out.println(obj.age);
        obj.print();
    }
}