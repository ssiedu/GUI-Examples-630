
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;


public class GUIFour extends Frame {

    TextField t1,t2;
    Button b1,b2;
    
    public GUIFour(){
        initComponents();
    }
    public void initComponents(){
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        setLayout(new FlowLayout());
        add(t1); add(t2); add(b1); add(b2);
    }
    
    
    
    
    public static void main(String[] args) {
        GUIFour ob=new GUIFour();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }
}
/*
    1) extends your class by java.awt.Frame
    2) declares all the references in the class
    3) to create the GUI generates initComponents method
    4) generate a constructor and calls initComponent()
*/
