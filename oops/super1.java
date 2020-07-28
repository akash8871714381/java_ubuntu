class a{
    public void prints(){
        System.out.println("base class");
    }
}
class b extends a{
    public void prints(){
        super.prints();
        System.out.println("derived class");
    }
}
public class super1{
    public static void main(String args[]){
        b obj = new b();
        obj.prints();
    }
}