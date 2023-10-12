package generics;
import java.util.ArrayList;
import java.util.List;

public class GenericsRule9 
{
    public static void f9(List<? super C> list){
            System.out.println(list.size());
            //list.add(new A());
    }
    public static void main(String[] args) {
        ArrayList<A> list1 = new ArrayList<A>();
        list1.add(new A());
        f9(list1);
        System.out.println(list1.get(0));
        
        ArrayList<Object> list2 = new ArrayList();
        f9(list2);
        
        ArrayList<Integer> list3 = new ArrayList();
        //f9(list3);
    }
    /*Wildcards with a
    lower bound have the syntax ? super T denotes an unknown type
    that is a supertype of T. In line 8, type class C is the lower bound of type class B, type class A ( line
    17) and type class Object ( line 20). Type class Integer is NOT a super of type class C, and line 24 won't
    compile*/
}
