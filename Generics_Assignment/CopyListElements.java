import java.util.List;
import java.util.ArrayList;
public class CopyListElements {
    public static void copyList(List<? super Number> dest, List<? extends Number> src){
        for(Number n : src) dest.add(n);
    }
    public static void main(String[] args){
        List<Number> dest = new ArrayList<>();
        List<Integer> src = java.util.Arrays.asList(1,2,3);
        copyList(dest, src);
        System.out.println("Dest after copy: " + dest);

        List<Object> objDest = new ArrayList<>();
        copyList(objDest, java.util.Arrays.asList(4.5, 6.7));
        System.out.println("ObjDest after copy: " + objDest);
    }
}
