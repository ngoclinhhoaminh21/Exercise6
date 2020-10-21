/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Exercise6 {

    public static ArrayList<String> replaceRepetitive(String input) {
        
        String [] arr = input.split("\\s");
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
        for (int i = 0; i < al.size() - 1; i++){
            if(al.size() > 1){
            int j = i +1;
            String a="";           
            while(j<al.size() && al.get(i).equals(al.get(j))){
                a = al.get(j);                
                al.remove(j);                
            }
            
            if (a != "") {                
                al.set(i, "REPEAT");                
            }
            }            
        }
        return al;
    }
    public static void test(String input, String expect, int numberOfCase){
        ArrayList<String> rs = replaceRepetitive(input);
        System.out.println("Case "+numberOfCase+": "+input);
        System.out.println("Expect output: "+expect);
        System.out.print("Real output: ");
        for (String str:rs){
            System.out.print(str+" ");
        }
        System.out.println("");
        System.out.println("---------------------------------");
    }
    public static void main(String[] args) {
        test("I want to to go to the the the zoo ","I want REPEAT go to REPEAT zoo",1);
        test("i go go go the the the ","i REPEAT REPEAT  ",2);
        test("i i ii go go goo goo ","REPEAT ii REPEAT REPEAT  ",3);
    }
    
}
