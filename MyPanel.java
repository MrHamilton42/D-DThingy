import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class MyPanel extends JPanel{
    //Holds other components in the Frame
    public MyPanel(String color, String position, MyFrame frame){
        switch (color) {
            case "White":
                this.setBackground(Color.white);
                break;
            case "Red":
                this.setBackground(Color.red);
                break;
            case "Grey":
                this.setBackground(Color.gray);
                break;
            default:
                break;
        }
        this.setPreferredSize(new Dimension(100,100));
        this.addToFrame(position, frame);
    }
    public void addToFrame(String position, MyFrame frame){
        switch (position) {
            case "NORTH":
                frame.add(this, BorderLayout.NORTH);
                break;
            case "SOUTH":
                frame.add(this, BorderLayout.SOUTH);
                break;
            case "EAST":
                frame.add(this, BorderLayout.EAST);
                break;
            case "WEST":
                frame.add(this, BorderLayout.WEST);
                break;
            case "CENTER":
                frame.add(this, BorderLayout.CENTER);
                break;
            default:
                break;
        }
    }
    public void addToPanel(JComponent comp){
        this.add(comp);
    }
}
