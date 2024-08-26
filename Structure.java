    public class Structure extends Location {
        int hitPoints = 0;

        public Structure(String name, int xPos, int yPos, int hitPoints, MyPanel panel){
            super(name, xPos, yPos, panel);
            this.hitPoints = hitPoints;
        }
        public void TakeDamage(int damage){
            this.hitPoints -= damage;
        }
        public int DisplayHP(){
            return hitPoints;
        }
    } 