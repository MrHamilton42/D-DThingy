import java.util.ArrayList;

public class Location {
    int xPos = 0;
    int yPos = 0;
    ArrayList<Location> connections = new ArrayList<>();
    MyPanel panel = null;
    String name = null;
 
    public Location(String name, int xPos, int yPos,  MyPanel panel){
        this.xPos = xPos;
        this.yPos = yPos;
        this.panel = panel;
        this.name = name;
        MyLabel label = new MyLabel (name, xPos, yPos, panel);
        panel.addToPanel(label);
    }
    public void addNode(Location node){
        this.connections.add(node);
    }
    public int[] getPosition(){
        int[] myPosition = new int[]{xPos, yPos};
        return myPosition;
    }
    public Location getRandomConnection(){
        int randIndex = (int)(Math.random() * this.connections.size());
        return this.connections.get(randIndex);
    }
    public MyPanel getPanel(){
        return panel;
    }
    public String getName(){
        return name;
    }
}
