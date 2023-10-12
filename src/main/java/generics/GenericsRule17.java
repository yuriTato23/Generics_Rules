/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * When the return type of a method contain wildcard we can assign the return
 * type to a var that has either wilds card ( line 15 and line 18), or no type
 * lines(27,2*) f(or older Java,versions backward compatibly)
 */
public class GenericsRule17 {

    public static <E extends CharSequence> //type declaration
            List<? super E> //return type
            doIt(List<E> numbers) {
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<String> n1 = null;
        ArrayList<CharSequence> in6 = null;
        
        List<CharSequence> out1;
        List<?> out11;
        doIt(in6);
//        doIt(in1);/
    }
}
