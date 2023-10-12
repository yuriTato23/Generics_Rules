package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRule6 {
    /*Bounded Inheritance for what is inside the diamond with <? extends Type>.
    The TYPE (A) is the UPPER BOUND of the ?. The method f6() says that the list
    can have in the diamond anything that extends type A. A is the super. 
    Upper bound means superclass.
    Lower bound means subclass.*/
    public static void f6(List<? extends A> list){
        System.out.println(list.size());
        //list.add(new C());
    }
    public static void main(String[] args) {
        List<A> list1 = new ArrayList();
        list1.add(new C());
        list1.add(new B());
        f6(list1);
        
        ArrayList<B> list2 = new ArrayList();
        list1.add(new A());
        f6(list2);
    }
}
class A{}
class B extends A{}
class C extends B{}
