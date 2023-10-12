package generics;

import java.util.ArrayList;
public class GenericRule1 {
    //Rule1 .There is no inheritance for what is inside the diamond even if the class types in the diamond
    //is a super getting a sub. Number(sub), Integer(sub).
    public static void f1(ArrayList<Number> list){
    }
    public static void main(String[] args) {
       //f1(new ArrayList<Integer>());
    }
    
}
