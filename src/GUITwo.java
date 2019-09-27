
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class GUITwo {
    public static void main(String args[]){
      
        Frame f=new Frame();
        f.setSize(400, 400);
        f.setVisible(true);
      
        Label l1=new Label("Name");
        Label l2=new Label("Age");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b1=new Button("save");
        
        f.setLayout(null);  //disabled the default layout
        
        l1.setSize(60, 30); //w,h
        l1.setLocation(50, 100);//x,y
        t1.setSize(100,30); //w,h
        t1.setLocation(130, 100);
        
        l2.setBounds(50, 150, 60, 30);//x,y,w,h
        t2.setBounds(130, 150, 100, 30);
        
        
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        
    }
}
