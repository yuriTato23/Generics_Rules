package generics;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class TestIterator<E> 
{
    E [] list = (E[])new Object[3];
    int i;
    public void add(E e){
        //If its an object you have to type cast
        list[i++] = e;
    }
    public ListIterator<E> listIterator(){
        ListIterator<E> lit = new ListIterator<E>(){
            int index;
            @Override
            public boolean hasNext() {
                if (index == TestIterator.this.list.length) {
                    return false;
                }
                return true;
            }
            @Override
            public E next() {
                return TestIterator.this.list[index++];
            }
            @Override
            public boolean hasPrevious() {
                //Check if there is more
                if (index == 0) {
                    return false;
                }
                return true;
            }
            @Override
            public E previous() {
                //Previous decrease the index
                return TestIterator.this.list[--index];
            }
            @Override
            public int nextIndex() {
                return index+1;
            }
            @Override
            public int previousIndex() {
                return index-1;
            }
            @Override
            public void forEachRemaining(Consumer<? super E> action) {
                ListIterator.super.forEachRemaining(action); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void set(E e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void add(E e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        return lit;
    }
    //Iterator to traverse array
    public Iterator<E> iterator(){
        //Always with an anonymous class
        //No lambda expression because iterator has more than one method.
        Iterator<E> it = new Iterator<E>()
        {
            //Always declare a local variable to iterate an array
            //Declare a variable index assign to 0. Variable use to iterate the array
            int index = 0;
            @Override
            public boolean hasNext() {
                //To acces the list, call the name of the class first
                if (index == TestIterator.this.list.length) {
                     return false;
                }
                else
                    return true;
            }

            @Override
            public E next() {
                return TestIterator.this.list[index++];
            }

            @Override
            public void forEachRemaining(Consumer<? super E> action) {
                
                Iterator.super.forEachRemaining(action); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
        };
        return it;
    }
    public static void testLI(){
        TestIterator<Integer> ti = new TestIterator<Integer>();
        ti.add(10);
        ti.add(20);
        ti.add(30);
        ListIterator<Integer> lit = ti.listIterator();
        while(lit.hasNext()){
            System.out.println("Previous index: " + lit.previousIndex() + 
                             "\tNext Index: " + lit.nextIndex() +
                               "\tHas previous: " + lit.hasPrevious() +
                               "\tHas next: " + lit.hasNext() +
                               "\tNext: " + lit.next());
        }
        System.out.println("---------------------");
        while(lit.hasNext()){
            System.out.println("Previous index: " + lit.previousIndex() + 
                             "\tNext Index: " + lit.nextIndex() +
                               "\tHas previous: " + lit.hasPrevious() +
                               "\tHas next: " + lit.hasNext() +
                               "\tPrevious: " + lit.previous());
        }
    }
    public static void main(String[] args) {
        TestIterator<Integer> ti = new TestIterator<Integer>();
        ti.add(1);
        ti.add(2);
        ti.add(3);
        
        Iterator<Integer> it = ti.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next()); 
        }
        //Testing for Each
        System.out.println("----------------");
        System.out.println("\tTesting for Each");
        Consumer<Integer> consumer = new Consumer<Integer> (){
            @Override
            public void accept(Integer t) 
            {
                System.out.println(t * 10);
            }
        };
        Iterator<Integer> it1 = ti.iterator();
        it1.forEachRemaining(consumer);
        System.out.println("---------------");
        System.out.println("List Iterator");
        testLI();
    }
}
