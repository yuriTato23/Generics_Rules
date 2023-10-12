package generics;
import java.util.ArrayList;
public class GenericsRule4 {
    //The wildcard ?, fixes the inheritance problem inside the diamonds. However, we cannot modify the Arraylist<?> (line 8)
    //because we (the compiler), do not know what the exact tpe of the wild card is.
    public static void f1(ArrayList<?> list)
    {
        System.out.println(list.size());
        //list.add(new Integer(5));
    }
    public static void main(String[] args) 
    {
        f1(new ArrayList<Integer>());
        f1(new ArrayList<Double>());
    }
}
