
import javax.swing.*;

public class GUI {
   
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("Map.png");
        MyFrame map = new MyFrame();

        MyPanel paneltop = new MyPanel("White", "NORTH", map);
        MyPanel panelbottom = new MyPanel("Red", "SOUTH", map);
        MyPanel panelleft = new MyPanel("Grey", "WEST", map);
        MyPanel panelright = new MyPanel("Grey", "EAST", map);
        MyPanel panelcenter = new MyPanel("White", "CENTER", map);
        MyLabel text = new MyLabel("Summoner's Rift", JLabel.CENTER, JLabel.CENTER, paneltop);
        MyLabel backgroundMap = new MyLabel("Map", JLabel.TOP, JLabel.LEFT, panelcenter);
        backgroundMap.addImage(image);
        MyButton travel = new MyButton("travel", 50, 50, panelbottom);
        MyButton shortRest = new MyButton("shortRest", 50, 150, panelbottom);
        MyButton longRest = new MyButton("longRest", 50, 250, panelbottom);
        //my components
        Location test = new Location("Nexus", 100, 100, panelleft);
        Camp creep = new Camp("wolves", 500, 500, 2.0, panelright);


        //add things to the window
        map.setVisible(true);
        map.pack();
        
    }
}
    