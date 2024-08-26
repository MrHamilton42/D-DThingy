
public class Camp extends Location{
    boolean spawned = false;
    double respawnTime = 0.0;
    double respawnTimer = 0.0;

    public Camp(String name, int xPos, int yPos, double respawnTime, MyPanel panel){
        super(name, xPos, yPos, panel);
        this.respawnTime = respawnTime;
        this.respawnTimer = respawnTime;
        MyButton button = new MyButton(name+respawnTime, xPos, yPos, panel);
        panel.addToPanel(button);
    }
    public void Clicked(){
        if (this.spawned == true){
            this.spawned = false;
            this.respawnTimer = this.respawnTime;
        }
    }
    public void Update(String duration){
        if (duration.equals("travel")){
            this.respawnTimer -= .5;
        }
        if (duration.equals("shortRest")) {
            this.respawnTimer -= 2.0;
        }
        if (duration.equals("longRest")) {
            this.respawnTimer -= 8.0;
        }
        if (this.respawnTime < 0){
            this.respawnTimer = 0;
            this.spawned = true;
        }
    }
    public double getRespawnTime(){
        return respawnTimer;
    }
}
