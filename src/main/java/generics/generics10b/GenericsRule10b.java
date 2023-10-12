/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package generics.generics10b;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lisset
 */
public class GenericsRule10b {

    public static <T> T f10b(A<? extends T>[] ar){
       //Swap entries at 0,1
       A<? extends T> temp = ar[0];
       ar[0] = ar[1];
       ar[1] = temp;
       //generic parameter annot be modified
       //RULE 10B: YOU CANNOT PASS GENERIC ARGUMENT (T t) TO A PARAMETE OF an INSTANCE METHOD
       //THAT TAKES AS AN ARGUNMENT A GENERIC TYPE (T t) which WAS DECLARED AT className<T>
       //cannot call this method from outside only within the method because the array cannot be modified 
       
        for (int i = 0; i < ar.length; i++) 
            System.out.println(ar[i]);
        return ar[0].getT();
//        ar[0].setT(ar[1].getT()); // compiling error //Generic parameter cannot be bound at runtime
          //the method would have to take a concrete type to work for this integer in one of the methods in class A
          //i.e notGenericMethod(Integer i); would work
//        ar[0].methodThatTakesParameter(ar[1].getT()); //compiling error
           
    }
    public static void main(String[] args) {
       A <Integer>[] ar  = new A[3];
       ar[0] = new A(1);
       ar[1] = new A(2);
       ar[2] = new A(3);
       Integer i = f10b(ar);
       
        System.out.println(i);
        System.out.println("--------------");
        B<String> [] ar1 = new B[2];
        ar1[0] = new B("john", 45.6); ar1[1] = new B("mary", new A<Integer>(888)); 
        Object o = f10b(ar1); System.out.println(o);
        System.out.println("--------------");
        
//         String s = (String) f10b(ar1); System.out.println(s);
    }
}
class A<T>{
    
    private T t;

    /**
     * Get the value of t
     *
     * @return the value of t
     */
    public T getT() {
        return t;
    }

    /**
     * Set the value of t
     *
     * @param t new value of t
     */
    public void setT(T t) {this.t = t;}

    public A(T t) {this.t = t;}

    @Override
    public String toString() {return "A{" + "t=" + t + '}';}
    
public void methodThatTakesParameterT(T t){ System.out.println("method parm T called");}
}

class B<E> extends A
{
    
     private E e;

    public B(E e, Object t) {
        super(t);
        this.e = e;
    }

    /**
     * Get the value of e
     *
     * @return the value of e
     */
    public E getE() {
        return e;
    }

    /**
     * Set the value of e
     *
     * @param e new value of e
     */
    public void setE(E e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "B{" + "e=" + e + '}';
    }

    
} 

