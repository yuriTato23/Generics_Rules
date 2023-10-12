package generics;
import java.util.ArrayList;
import java.util.List;

public class GenericsRule8<T1> 
{
    //List<? extends T1> lista = new ArrayList<String>();
    
    public static <T2> void f8(List<? extends T2> list){
        System.out.println(list.size());
        //list.add(new C());
    }
    public static void main(String[] args) {
        List<A> list1 = new ArrayList();
        list1.add(new C());
        list1.add(new B());
        f8(list1);
        
        ArrayList<B> list2 = new ArrayList();
        list1.add(new A());
        f8(list2);
        
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("abc");
        f8(list3);
    }
    /*Upper bounded inheritance that is appplicable in Rule 6 and Rule 7 does not work when it is an
    instance variable with an upper bound. Line 7 below. So line 9 (parameter is good).
    Line 7 is no good*/
}
