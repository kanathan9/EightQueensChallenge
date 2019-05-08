
public class Position implements java.lang.Comparable<Position> {
    public static String[] xAxis = {"A","B","C","D","E","F","G","H"};
    public static String[] yAxis = {"1","2","3","4","5","6","7","8"};

    private String xPos = null;
    private String yPos = null;

    Position(String x, String y){
        this.xPos = x;
        this.yPos = y;
    }
    Position(String s){
        this.xPos = s.substring(0,1);
        this.yPos = s.substring(1);
    }

    public String getxPos(){
        return this.xPos;
    }

    public String getyPos(){
        return this.yPos;
    }

    public int compareTo(Position newPos){
        if((this.xPos.compareTo(newPos.xPos)) == 0 && (this.yPos.compareTo(newPos.yPos)) == 0){
            return 0;
        }
        return -1;
    }

    public String toString(){
        return this.xPos+this.yPos;
    }

}
