class classout{
    String a = "something out";
    class classin{
        String b = "something in";
    }
}
public class inner{
    public static void main(String args[]){
        classout objout = new classout();
        classout.classin objin = objout.new classin();
        System.out.println(objout.a);
        System.out.println(objin.b);
    }
}