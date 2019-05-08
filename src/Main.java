import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<String> table = new ArrayList();
    public static int count = 0;
    public static int first = -1;
    public static int numRes = 0;
    public static List<String> result = new ArrayList<>();

    public static void main(String[] args){

        while(first<64){
            table.clear();
            result.clear();
            setTable();
            count = 0;
            first++;
            placeQueen(Main.table.toArray(new String[0]));
            System.out.println("SOLUTION N."+ ++numRes);
            for(String pos : result){
                System.out.println(pos);
            }
        }

    }

    public static void setTable(){
        int i=0;
        for(String x : Position.xAxis){
            for(String y : Position.yAxis){
                table.add(new Position(x,y).toString());
                i++;
            }
        }
    }

    public static void placeQueen(String[] board){
        if(board.length < 1){
            if(count<8){
                table.clear();
                result.clear();
                setTable();
                board = Main.table.toArray(new String[0]);
                count = 0;
                first++;
//                placeQueen(Main.table.toArray(new String[0]));
            }else{ return ;}
        }
        if(first >63)return;

        List<Integer> toDelete = new ArrayList<>();
        int nbOfConflicts = 64;
        StringBuilder positionFound = new StringBuilder();
        if(count==0){
            positionFound.replace(0,positionFound.length(),board[first]);
            toDelete = conflicts(board[first],board);
        }else {
            for (String square : board) {
                List<Integer> conf = conflicts(square, board);
                if (conf.size() < nbOfConflicts) {
                    positionFound.replace(0, positionFound.length(), square);
                    nbOfConflicts = conf.size();
                    toDelete = conf;
                }
            }
        }
        for(int sq : toDelete){
            int ind = Arrays.binarySearch(Main.table.toArray(new String[0]),new Position(board[sq]).toString());
            if(ind >= 0){
                Main.table.remove(ind);
            }
        }
        result.add(positionFound.toString());
        count++;
        Main.placeQueen(Main.table.toArray(new String[0]));
    }

    public static List<Integer> conflicts(String square, String[] board){
        int indexX = Arrays.binarySearch(Position.xAxis,new Position(square).getxPos());
        int indexY = Arrays.binarySearch(Position.yAxis,new Position(square).getyPos());
        List<Integer> ret = new ArrayList<>();

        for(int i=0; i<8 ; i++){
            int testIndex1 = Arrays.binarySearch(Main.table.toArray(new String[0]),new Position(Position.xAxis[i],Position.yAxis[indexY]).toString());
            if(testIndex1 >= 0){
//                Main.table.remove(testIndex1);
                ret.add(testIndex1);
            }
            int testIndex2 = Arrays.binarySearch(Main.table.toArray(new String[0]),new Position(Position.xAxis[indexX],Position.yAxis[i]).toString());
            if(testIndex2 >= 0){
//                Main.table.remove(testIndex2);
                ret.add(testIndex2);
            }

            if((indexX-i) >= 0 && (indexY-i >= 0)){
                int testIndex3 = Arrays.binarySearch(Main.table.toArray(new String[0]),new Position(Position.xAxis[indexX-i],Position.yAxis[indexY-i]).toString());
                if(testIndex3 >=0 ){
//                    Main.table.remove(testIndex3);
                    ret.add(testIndex3);
                }
            }
            if((indexX+i) < 8 && (indexY+i < 8)){
                int testIndex4 = Arrays.binarySearch(Main.table.toArray(new String[0]),new Position(Position.xAxis[indexX+i],Position.yAxis[indexY+i]).toString());
                if(testIndex4 >= 0){
//                    Main.table.remove(testIndex4);
                    ret.add(testIndex4);
                }
            }
            if((indexX-i) >= 0 && (indexY+i < 8)){
                int testIndex5 = Arrays.binarySearch(Main.table.toArray(new String[0]),new Position(Position.xAxis[indexX-i],Position.yAxis[indexY+i]).toString());
                if(testIndex5 >=0 ){
//                    Main.table.remove(testIndex5);
                    ret.add(testIndex5);
                }
            }
            if((indexX+i) < 8 && (indexY-i >= 0)){
                int testIndex6 = Arrays.binarySearch(Main.table.toArray(new String[0]),new Position(Position.xAxis[indexX+i],Position.yAxis[indexY-i]).toString());
                if(testIndex6 >= 0){
//                    Main.table.remove(testIndex6);
                    ret.add(testIndex6);
                }
            }
        }
        return ret;
    }
}
