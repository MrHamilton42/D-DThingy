public class OtherParty{
    int[] currentPosition = new int[2];
    Location currentLocation = null;
    double awakeTime = 0.0;

    public OtherParty(Location currentLocation){
        this.currentLocation = currentLocation;
        this.currentPosition = currentLocation.getPosition();
    }

    public void Update(String duration){
        int timer = 0;
        if (duration.equals("travel")){
            timer = 1;
        }
        if (duration.equals("shortRest")){
            timer = 4;
        }
        if (duration.equals("longRest")){
            timer = 16;
        }
        while (timer > 0){
            awakeTime += 0.5;
            timer -= 1;
            this.currentLocation = currentLocation.getRandomConnection();
            this.currentPosition = currentLocation.getPosition();
        }
        //if awake time gets above a certain value, the Team will TP home to rest, otherwise, update the graphic for the team for the new location
    }
    public int[] getCurrentPosition(){
        return currentPosition;
    }
    public double getAwakeTime(){
        return awakeTime;
    }

}