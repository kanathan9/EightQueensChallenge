import java.util.*;

public class Main2 {
//    public static List<String> table = new ArrayList();
//    static int count = 0;
////    static Comparator<Position> posComp = Comparator.comparing();
////    String[] result = null;
//
//    public static void main(String[] args){
//        setTable();
//        System.out.println("Starting size: "+Main.table.size());
//        Queen q = new Queen();
//        boolean test = false;
//        while(!test){
//            test = clearDanger(q);
//        }
////        System.out.println(Main.table.get(0).substring(0,1)+" et "+Main.table.get(0).substring(1));
////        for(Position p : table){
////            System.out.println(p.getxPos()+" "+p.getyPos());
////        }
////        System.out.println(Main.table.get(Arrays.binarySearch(Main.table.toArray(new String[0]),"A1")));
//        System.out.println(count+" reine placee");
//    }
//
//    public static void setTable(){
//        int i=0;
//        for(String x : Position.xAxis){
//            for(String y : Position.yAxis){
//                table.add(new Position(x,y).toString());
//                i++;
//            }
//        }
//    }
//
//    public static boolean clearDanger (Queen queen){
//        if(Main.count>6){
//            return true;
//        }
//        int indexX = Arrays.binarySearch(Position.xAxis,queen.pos.getxPos());
//        int indexY = Arrays.binarySearch(Position.yAxis,queen.pos.getyPos());
////        System.out.println("Reine N."+(count+1)+" en position "+Position.xAxis[indexX]+" "+Position.yAxis[indexY]);
////        Position[] p = ;
//
//        for(int i=0; i<8 ; i++){
//            int testIndex1 = Arrays.binarySearch(Main.table.toArray(new String[0]),new Position(Position.xAxis[i],Position.yAxis[indexY]).toString());
//            if(testIndex1 >= 0){Main.table.remove(testIndex1);
////                System.out.println("Position "+Position.xAxis[i]+" "+Position.yAxis[indexY]+" removed "+testIndex1);
//            }
//            int testIndex2 = Arrays.binarySearch(Main.table.toArray(new String[0]),new Position(Position.xAxis[indexX],Position.yAxis[i]).toString());
//            if(testIndex2 >= 0){Main.table.remove(testIndex2);
////                System.out.println("Position "+Position.xAxis[indexY]+" "+Position.yAxis[i]+" removed");
//            }
//
//            if((indexX-i) >= 0 && (indexY-i >= 0)){
//                int testIndex3 = Arrays.binarySearch(Main.table.toArray(new String[0]),new Position(Position.xAxis[indexX-i],Position.yAxis[indexY-i]).toString());
//                if(testIndex3 >=0 ){Main.table.remove(testIndex3);
////                    System.out.println("Position "+Position.xAxis[indexX-i]+" "+Position.yAxis[indexY-i]+" removed");
//                }
//            }
//            if((indexX+i) < 8 && (indexY+i < 8)){
//                int testIndex4 = Arrays.binarySearch(Main.table.toArray(new String[0]),new Position(Position.xAxis[indexX+i],Position.yAxis[indexY+i]).toString());
//                if(testIndex4 >= 0){Main.table.remove(testIndex4);
////                    System.out.println("Position "+Position.xAxis[indexX+i]+" "+Position.yAxis[indexY+i]+" removed");
//                }
//            }
//            if((indexX-i) >= 0 && (indexY+i < 8)){
//                int testIndex5 = Arrays.binarySearch(Main.table.toArray(new String[0]),new Position(Position.xAxis[indexX-i],Position.yAxis[indexY+i]).toString());
//                if(testIndex5 >=0 ){Main.table.remove(testIndex5);
////                    System.out.println("Position "+Position.xAxis[indexX-i]+" "+Position.yAxis[indexY+i]+" removed");
//                }
//            }
//            if((indexX+i) < 8 && (indexY-i >= 0)){
//                int testIndex6 = Arrays.binarySearch(Main.table.toArray(new String[0]),new Position(Position.xAxis[indexX+i],Position.yAxis[indexY-i]).toString());
//                if(testIndex6 >= 0){Main.table.remove(testIndex6);
////                    System.out.println("Position "+Position.xAxis[indexX+i]+" "+Position.yAxis[indexY-i]+" removed");
//                }
//            }
//        }
//        Main.count++;
//        if(Main.table.size()>0) {
//            Main.clearDanger(new Queen());
//        }else{
//            table.clear();
//            setTable();
//            count=0;
//            return false;
//        }
//        return false;
//    }
}
