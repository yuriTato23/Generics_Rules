/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * When a parameter has wildcard in the diamond and extends a generic type (such
 * as T2), then it means anything that extends “Object” which implies that we
 * can pass as argument ANY TYPE ( lines 17, 8, 19).
 */
public class GenericsRule15<T1> {

    List<? extends T1> list;

    public GenericsRule15(ArrayList<? extends T1> list) {
        this.list = list;
    }

    //ArrayList<? extends T2> list; will not compile
    public static <T2> void f(ArrayList<? extends T2> list1) //? extends T2?
    {
        //MEANS  anything that extends object 
        //so you can pass ANYTHING in the diamond
        System.out.println(list1.size());
//        list1.add(new Integer());//will not compile
    }

    public static void main(String[] args) {
        f(new ArrayList<Integer>());
        f(new ArrayList<Object>());
        f(new ArrayList<AAA>());
    }
}

class AAA {
}
