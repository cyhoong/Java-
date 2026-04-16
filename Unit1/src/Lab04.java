import edu.fcps.karel2.Display;

public class Lab04 {
    public static void takeTheField(Athelete arg){
        arg.move();
        arg.move();
        arg.move();
        arg.move();
        arg.turnRight();
        arg.move();
        arg.move();
    }

    public static void main(String[] args) {
        Display.openWorld("maps/arena.map");

        Athelete tom = new Athelete();
        takeTheField(tom);
        tom.move();
        tom.move();
        tom.move();
        tom.turnLeft();
        tom.move();
        tom.move();
        tom.turnAround();

        Athelete jerry = new Athelete();
        takeTheField(jerry);
        jerry.move();
        jerry.move();
        jerry.move();
        jerry.move();
        jerry.move();
        jerry.turnLeft();
        jerry.move();
        jerry.turnAround();

        Athelete spike = new Athelete();
        takeTheField(spike);
        spike.move();
        spike.turnLeft();
        spike.move();
        spike.turnAround();

        Athelete tyke = new Athelete();
        takeTheField(tyke);
        tyke.move();
        tyke.move();
        tyke.move();
        tyke.move();
        tyke.turnRight();

        Athelete butch = new Athelete();
        takeTheField(butch);
        butch.move();
        butch.move();
        butch.move();
        butch.turnRight();

        Athelete maria = new Athelete();
        takeTheField(maria);
        maria.move();
        maria.move();
        maria.turnRight();

        Athelete gary = new Athelete();
        gary.move();
        gary.move();
        gary.move();
        gary.move();
        gary.move();
        gary.move();
        gary.turnRight();
        gary.move();

    }

}
