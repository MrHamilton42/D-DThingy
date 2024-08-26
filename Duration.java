public class Duration {
        double currentTime = 0.0;

        public Duration(){
            this.currentTime = 0.0;
        }
        public void travel(){
            this.currentTime += 0.5;
        }
        public void shortRest(){
            this.currentTime += 2.0;
        }
        public void longRest(){
            this.currentTime += 8.0;
        }
        public double getTime(){
            return currentTime;
        }
    }

