import edu.fcps.karel2.Display;

public class Racer extends Athelete {

    public Racer(int y){
        super(1, y, Display.EAST, Display.INFINITY);
    }

    public void jumpRight(){
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
    }

    public void jumpLeft(){
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnRight();
    }

    public void sprint(int n){
        for(int i = 1; i <= n; i++){
            move();
        }
    }

    public void put(int n){
        for(int i = 1; i <= n; i++){
            putBeeper();
        }
    }

    public void pick(int n){
        for(int i = 1; i <= n; i++){
            pickBeeper();
        }
    }

    public void shuttle(int spaces, int beepers){
        for(int i = 1; i <= spaces; i++){
            move();
        }
        for(int i = 1; i <= beepers; i++){
            pickBeeper();
        }
    }

}
