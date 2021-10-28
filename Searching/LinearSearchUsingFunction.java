import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.*;
public class MyClass {
    
    public static BiFunction<List<Integer>,Integer,List<Integer>> linearSearch = (al,x) -> al.stream().filter((i)->i==x).collect(Collectors.toList());
    public static void main(String args[]) {
     List<Integer> l1 = new ArrayList<>(Arrays.asList(2,12,54,32,65,78,66,55,98,55,27));
     List<Integer> l2 = new ArrayList<>(Arrays.asList(32,88,75,45,31,30,98,98,75,55,75,22,75,88));
     System.out.println(linearSearch.apply(l1,55));
     System.out.println(linearSearch.apply(l2,75));
    }
}
//OUTPUT IS
// [55, 55]
// [75, 75, 75, 75]
