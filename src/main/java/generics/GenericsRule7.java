package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRule7 {
    //The same as rule 6 with the difference that we do the assignment
    //List<? extends A> list = list1; line 15 and line 20.
    public static void main(String[] args) {
        List<A> list1 = new ArrayList();
        list1.add(new C());
        list1.add(new B());
        
        List<? extends A> list = list1;
        
        ArrayList<B> list2 = new ArrayList();
        list1.add(new A());
        list = list2;
    }
}
