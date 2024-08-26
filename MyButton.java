import java.awt.Font;
import javax.swing.*;

public class MyButton extends JButton{
    String text = null;
    
    public MyButton(String text, int xpos, int ypos, MyPanel panel){
        this.setBounds(xpos, ypos, 150, 50);
        this.text = text;
        this.addActionListener(e -> System.out.println(text));
        this.setText(text);
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.BOTTOM);
        this.setFont(new Font("Lancelot", Font.BOLD, 42));
        this.setBorder(BorderFactory.createEtchedBorder());
        panel.addToPanel(this);
    }
    @Override
    public String getText(){
        return this.text;
    }
}
