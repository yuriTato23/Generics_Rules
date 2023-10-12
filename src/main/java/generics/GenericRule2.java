package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericRule2 {
    /*
    There IS inheritance for what is outside the diamond when the classes outside the diamond are super sub.
    List ArrayList
    */
    public static void f2(List<Number> list){}
    public static void main(String[] args) {
        f2( new ArrayList<Number>());
    }
}
