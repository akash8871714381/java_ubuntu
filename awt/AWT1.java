import java.awt.*;
class AWT1 extends Frame{
    AWT1(){
        Button b = new Button("login");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        AWT1 obj = new AWT1();
    }
}