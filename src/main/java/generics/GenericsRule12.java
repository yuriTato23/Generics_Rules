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
public class GenericsRule12 {

    //The same as rule 11 but for assignment 
    public static void main(String[] args) {
        List<List<Integer>> table = new ArrayList<List<Integer>>();
//        List<List<Integer>> table = new List<ArrayList<Integer>>(); //will not compile
//        List<List<Integer>> table = new ArrayList<ArrayList<Integer>>(); //will not compile
//        List<List<Integer>> table = new ArrayList<List<Integer>>(); //wont compile
        for (int i = 0; i < 2; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < 3; j++) {
                row.add(i + j);
            }
            table.add(row);
        }
        for (List<Integer> row : table) {

            System.out.println(row);
        }
    }
}
