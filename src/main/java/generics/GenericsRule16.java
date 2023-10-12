/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

import java.util.ArrayList;
import java.util.List;

/**
When a parameter of a constructor or method has
wildcard in the diamond and
extends
a generic type (such as T1), line9, then it means anything that extends “Object” which
implies that it cannot be overloaded with same signatures( line 21 uses <? super>, line
29 uses <?> BECUASE they would have the same type erasure after compilation ( same
signatures). However, we can overload by using something different OUTISDE the out
side the diamond ( constructor overloading line 13, has different signatures than line 9 )
 */
public class GenericsRule16<T1> {

    List<? extends T1> list;

    public GenericsRule16(ArrayList<? extends T1> list) {
        this.list = list;
    }
    public GenericsRule16(List<? extends T1> list) {
        this.list = list;
    }
    /* This constructor is Illegal because of the existing constructor at line 11
    IT WONT COMPILE, IT HAS THE SAME TYPE
    
        public GenericsRule16(ArrayList<? super T1> list)
            {this.list = list;}
 
   */
   /*This constructor is illegal because of the existing constructor 
    IT WONT COMPILE, IT HAD THE SAME TYPE ERASURE as constructor at line ...
    
        public GenericsRule16(ArrayList<? super T1> list)
            {this.list = list;}
    */

    public static void main(String[] args) {
        GenericsRule16<String> gr14_1 = new GenericsRule16<String>(new ArrayList<String>());
        GenericsRule16<Integer> gr14_2 = new GenericsRule16<Integer>(new ArrayList<Integer>());
        GenericsRule16<AAAA> gr14_3 = new GenericsRule16<AAAA>(new ArrayList<AAAA>());
    }
}
class AAAA{}