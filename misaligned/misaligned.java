import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Misaligned {
    static String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
    static String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
    static String colorPairEntry(int majorColorIndex , int minorColorIndex ){
        String index = String.valueOf(majorColorIndex*5 + minorColorIndex +1);
        String str = new String(index+" | "+majorColors[majorColorIndex]+" | "+ minorColors[minorColorIndex]);
        print(str);
        return str;
    }
    
    static void  print(String colorPairEntryWithIndex){
        System.out.println(colorPairEntryWithIndex);
    }
    
    static String[] printColorMap() {
        String[] colorPairWithIndex = new String[25];
        int i = 0, j = 0;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                colorPairWithIndex[i*5 +j]= colorPairEntry(i,j);
            }
        }
        return colorPairWithIndex;
    }
         
    public static void main(String[] args) { 
       String[] result = printColorMap();
	    assert(result.length == 25);
	    assert(result[0].equals("1 | White | Blue"));
	    assert(colorPairEntry(1,2).equals("7 | Red | Orange"));
	    assert(colorPairEntry(1,2).equals("8  | Red | Green"));
        System.out.println("All is well (maybe!)");
    }
}
