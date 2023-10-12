package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRule5 {
    /*When we have a wildcard on the LHS of assignment then on the RHS of the assignment, wat is outside the diamond must be sub (or same class)
    of LHS and what is inside the diamond can be any type. W still cannot modify the variable as in Rule 4.
    */
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<Integer>();
        ArrayList<?> list2 = new ArrayList<Double>();
        ArrayList<?> list3 = new ArrayList<String>();
        
        //list3.add("abc");
        list3.size();
    }
}
