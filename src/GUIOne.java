import java.awt.*;


public class GUIOne {
    public static void main(String[] args) {

        //step-1 (create container)
        Frame f=new Frame();
        f.setSize(400, 300);//w,h
        f.setVisible(true);
        //step-2 (create the components)
        Label l1=new Label("Name");
        Label l2=new Label("Age");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b1=new Button("save");
        //step-3 (add the components on container)
        
        GridLayout gL=new GridLayout(3,2);
        f.setLayout(gL);
        
        //FlowLayout fL=new FlowLayout();
        //f.setLayout(fL);
        //f.add("North",l1); 
        //f.add("South",t1);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        
        
        
        
        
        
    }
}
