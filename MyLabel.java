import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.Border;

public class MyLabel extends JLabel{
    public MyLabel(String text, int xPos, int yPos, MyPanel panel){
        Border border = BorderFactory.createLineBorder(Color.white);
        this.setForeground(Color.green);
        this.setText(text);
        this.setFont(new Font("Lancelot", Font.PLAIN, 42));
        this.setBorder(border);
        this.setBounds(xPos, yPos, 100, 50);
        panel.addToPanel(this);
    }
    public void changeBounds(int x,int y,int width,int height){
        this.setBounds(x,y,width,height);
    }
    public void moveCenter(){
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.CENTER);
    }
    public void addImage(ImageIcon image){
        this.setIcon(image);
    }
}