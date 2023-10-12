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
public class GenericsRule13 {
   
    public static void f(List<? extends List<Integer>> table)
    {
        for (int i = 0; i < 2; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < 3; j++) {
                row.add(i + j); System.out.println(row);
            }
//            table.add(row); wont compile, we cannot modify the List of wildcard
        }
        for (List<Integer> row : table) {

            System.out.println(row);
        }
    }
    //The same as rule 11 but for assignment 
    public static void main(String[] args) {
        f( new ArrayList<List<Integer>>() );
//        f( new List<ArrayList<Integer>>() ); wont compile
        System.out.println("--------");
        f(new ArrayList<ArrayList<Integer>>());
//        f(new List<ArrayList<Integer>>()); wont compile
    }
}
