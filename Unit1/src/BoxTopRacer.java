public class BoxTopRacer extends Racer {

    public BoxTopRacer(int y){
        super(y);
    }

    public void jumpRight(){
        int n = 0;
        turnLeft();
        while (!rightIsClear()){
            move();
            n = n + 1;
        }
        turnRight();
        move();
        while (!rightIsClear()) {
            move();
        }
        turnRight();
        for(int i = 1; i <= n; i++){
            move();
        }
        turnLeft();

    }

    public void jumpLeft(){
        int n = 0;
        turnRight();
        while (!leftIsClear()){
            move();
            n = n + 1;
        }
        turnLeft();
        move();
        while (!leftIsClear()) {
            move();
        }
        turnLeft();
        for(int i = 1; i <= n; i++){
            move();
        }
        turnRight();
    }

}
