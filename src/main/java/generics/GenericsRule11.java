/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lisset
 */
public class GenericsRule11 {
    /*
    There is not inheritance in the diamond when we use nested diamond 
    */
    public static void f(List<List<Integer>> table){
        for (int i = 0; i < 2; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < 3; j++) {
                row.add(i+j);
                table.add(row);
            }
        }for (List<Integer> row: table) {
                System.out.println(row);
            }
    }
    public static void main(String[] args) {
        f( new ArrayList<List<Integer>>());
//      f( new List<ArrayList<Integer>>() );
//       f( new List<List<Integer>>() ); //this would work but cannot say new list
    }
}
