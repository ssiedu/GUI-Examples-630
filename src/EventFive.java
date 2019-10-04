
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class EventFive extends Frame {

    TextField t1,t2;
    Button b1,b2;
    
    public EventFive(){
        initComponents();
    }
    public void initComponents(){
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        setLayout(new FlowLayout());
        add(t1); add(t2); add(b1); add(b2);
        t1.addKeyListener(new MyKeyHandler());
        addWindowListener(new MyWindowHandler());
    }
    public static void main(String[] args) {
        EventFive ob=new EventFive();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }
    
    class MyWindowHandler extends WindowAdapter {
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
    
    class MyKeyHandler extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            
            int code=e.getKeyCode();
            setTitle("CODE : "+code);
            if(code==27){
                t1.setText("abcd");
                t1.setText("");
                System.out.println("Its Esacape Key");
            }
        }
    }
    
}
/*
    1) extends your class by java.awt.Frame
    2) declares all the references in the class
    3) to create the GUI generates initComponents method
    4) generate a constructor and calls initComponent()
*/
