import java.util.Random;

public class Queen {
    public Position pos = null;
    public static Random r = new Random();

    Queen() {
        this.pos = (Main.table.size()>1)? new Position(Main.table.get(Math.abs(r.nextInt(Main.table.size())))) : new Position(Main.table.get(0));
//        Main.table.remove(0);
    }

}
