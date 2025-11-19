import java.util.List;
public class NumericSum {
    public static double sumNumbers(List<? extends Number> list){
        double s = 0.0;
        for(Number n : list) s += n.doubleValue();
        return s;
    }
    public static void main(String[] args){
        System.out.println(sumNumbers(java.util.Arrays.asList(1,2,3,4))); // integers
        System.out.println(sumNumbers(java.util.Arrays.asList(2.5, 3.5))); // doubles
    }
}
