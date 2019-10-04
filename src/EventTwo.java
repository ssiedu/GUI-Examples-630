
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Point;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class EventTwo extends Frame implements MouseListener {

    TextField t1,t2;
    Button b1,b2;
    
    public EventTwo(){
        initComponents();
    }
    public void initComponents(){
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        setLayout(new FlowLayout());
        add(t1); add(t2); add(b1); add(b2);
        t1.addMouseListener(this);
    }
    
    
    
    
    public static void main(String[] args) {
        EventTwo ob=new EventTwo();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      int n=e.getClickCount();
      if(n==3){
          System.exit(0);
      }
    }

    @Override
    public void mousePressed(MouseEvent e) {
      //Point pt=e.getLocationOnScreen();
      int x=e.getX();
      int y=e.getY();
      int b=e.getButton();
      setTitle(x+","+y+","+b);
      if(b==1)
        t1.setText("EnterName");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      t1.setText("");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      t1.setBackground(Color.yellow);
    }

    @Override
    public void mouseExited(MouseEvent e) {
      t1.setBackground(Color.white);
    }
}
/*
   
*/
