
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class EventThree extends Frame implements MouseMotionListener {

    Button b1,b2;
    
    public EventThree(){
        initComponents();
    }
    public void initComponents(){
        b1=new Button("Click");
        b1.setBounds(50, 50, 60, 30);
        setLayout(null);
        add(b1);
        addMouseMotionListener(this);
    }
    
    
    
    
    public static void main(String[] args) {
        EventThree ob=new EventThree();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        setTitle("Dragging @ : "+x+","+y);
        b1.setLocation(x, y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        setTitle("Moving @ : "+x+","+y);
        
    }
}
/*
    1) extends your class by java.awt.Frame
    2) declares all the references in the class
    3) to create the GUI generates initComponents method
    4) generate a constructor and calls initComponent()
*/
