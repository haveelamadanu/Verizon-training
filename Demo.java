import java.awt.*;

class  Demo 
{
    public static void main(String args[])
    {
     Frame f=new Frame("Notepad");
     f.setVisible(true);
     TextArea t=new TextArea();
     f.setSize(500,500);
     f.setBackgroundColor(Color: red);
     MenuBar mb=new MenuBar();
     f.setMenuBar(mb);
     f.add(t);
     Menu m1=new Menu("File");
     Menu m2=new Menu("Edit");
     Menu m3=new Menu("View");
     Menu m4=new Menu("Search");
     Menu m5=new Menu("Help");
    mb.add(m1);
    mb.add(m2);
    mb.add(m3);
    mb.add(m4);
    mb.add(m5);
    
     MenuItem mi1=new MenuItem("New");
     MenuItem mi2=new MenuItem("Open");
     MenuItem mi3=new MenuItem("Save");
     MenuItem mi4=new MenuItem("Save As");
     MenuItem mi5=new MenuItem("Exit");
    m1.add(mi1);
    m1.add(mi2);
    m1.add(mi3);
    m1.add(mi4);
    m1.add(mi5);
    }
}