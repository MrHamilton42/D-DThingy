import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;


public class MyFrame extends JFrame{
    MyFrame(){
        //Frame Stuff
        ImageIcon image = new ImageIcon("logo.png");
        
        //Our Frame stuff
        this.setTitle("Summoner's Rift"); //sets window title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //lets the app actually close.
        //this.setResizable(false); //user can't resize frame
        this.setLayout(new BorderLayout(10,10));
        this.setSize(1280,1014); //sets size
        this.setIconImage(image.getImage());  //take imported image and replaces the icon with it
        this.getContentPane().setBackground(new Color(42,42,42));  //set background color
    }
    public void addToFrame(JComponent comp){
        this.add(comp);
    }
}