
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class EventFour extends Frame implements WindowListener {

    TextField t1,t2;
    Button b1,b2;
    
    public EventFour(){
        initComponents();
    }
    public void initComponents(){
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        setLayout(new FlowLayout());
        add(t1); add(t2); add(b1); add(b2);
        addWindowListener(this);
    }
    
    
    
    
    public static void main(String[] args) {
        EventFour ob=new EventFour();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        setTitle("Welcome");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    
    }

    @Override
    public void windowIconified(WindowEvent e) {
        setTitle("STOP");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        setTitle("START");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        setBackground(Color.white);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        setBackground(Color.green);
    }
}
/*
    1) extends your class by java.awt.Frame
    2) declares all the references in the class
    3) to create the GUI generates initComponents method
    4) generate a constructor and calls initComponent()
*/
