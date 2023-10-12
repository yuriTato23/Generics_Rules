/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

import java.util.ArrayList;
import java.util.List;
/**
 * To allow inheritance in inner diamonds we use wild card ? in inner diamonds, as upper
bound(? extends), lower bound ( ? super ) or just ?. The example shows the upper bound
fix of inner diamond inheritance. You can see that line 24 compiles as ArrayList<Integer>
of line 24 is a subtype of parameter List<Integer> of line 6. Still we cannot modify the
parameter (line 13).
 * @author lisset
 */
public class GenericsRule14 {
   
    
    //The same as rule 11 but for assignment 
    public static void main(String[] args) {
        List<List<Integer>> table1 = new ArrayList<List<Integer>>() ;
//        f( new List<ArrayList<Integer>>() ); wont compile
        System.out.println("--------");
        List<? extends List<Integer>> table2 = new ArrayList<ArrayList<Integer>>();
//        f(new List<ArrayList<Integer>>()); wont compile
    
        for (int i = 0; i < 2; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < 3; j++) 
                row.add(i + j); 
                table1.add(row);
//              table2.add(row); wont compile becsaue it is wild card(unknown type)
            
        }
        for (List<Integer> row: table1) {
            System.out.println(row);
        }
    }
}
