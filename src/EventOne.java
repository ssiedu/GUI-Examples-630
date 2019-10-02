
import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;


public class EventOne extends Frame implements ActionListener, TextListener, ItemListener, FocusListener, KeyListener {

    TextField t1,t2;
    Button b1,b2,b3;
    Choice ch;
    
    public EventOne(){
        initComponents();
    }
    public void initComponents(){
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        b3=new Button("Close");
        ch=new Choice();
        ch.add("MP");
        ch.add("MH");
        ch.add("RJ");
        setLayout(new FlowLayout());
        add(ch);add(t1); add(t2); add(b1); add(b2);add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        t1.addTextListener(this);
        ch.addItemListener(this);
        b2.addFocusListener(this);
        b3.setEnabled(false);
        t1.addKeyListener(this);
    }
    
    
    
    
    public static void main(String[] args) {
        EventOne ob=new EventOne();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //identify the event source
        //event-source (component which generates event)
        
        if(e.getSource()==b1){
            String s1=t1.getText();//reading text of t1
            t2.setText(s1); //changing text of t2
        }else if(e.getSource()==b2){
            t1.setText(""); t2.setText("");
            t1.requestFocus();
        }else if(e.getSource()==b3){
            System.exit(0);
        }
        
    }

    @Override
    public void textValueChanged(TextEvent e) {
        String s=t1.getText();
        t2.setText(s);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        int idx=ch.getSelectedIndex();
        switch(idx){
            case 0:
                setTitle("Bhopal");
            break;
            case 1:
                setTitle("Mumbai");
            break;
            case 2:
                setTitle("Jaipur");
            break;
        }
        
    }

    @Override
    public void focusGained(FocusEvent e) {
        b3.setEnabled(true);
    }

    @Override
    public void focusLost(FocusEvent e) {
        b2.setEnabled(false);
    }

    @Override
    public void keyTyped(KeyEvent e) {     
        char ch=e.getKeyChar();
        if(ch=='x'){
            System.exit(0);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int code=e.getKeyCode();
        setTitle("Code  : "+code);
        if(code==KeyEvent.VK_F1){
            String s1=t1.getText();
            String s2=s1.toUpperCase();
            t1.setText(s2);
        }else if(code==KeyEvent.VK_F2){
            String s1=t1.getText();
            String s2=s1.toLowerCase();
            t1.setText(s2);
        }else if(code==KeyEvent.VK_ESCAPE){
            t1.setText("");
        }
        
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
/*

*/
