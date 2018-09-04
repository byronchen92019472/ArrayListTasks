/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttasks;

import java.util.ArrayList;

/**
 *
 * @author 92019472
 */
public class ArrayListTasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList shoppingList = new ArrayList();
        shoppingList.add("juice");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("cheese");
        
        printArrayList(shoppingList);
        
        shoppingList.add("egg");
        shoppingList.add("cheese");
        shoppingList.add("bread");
        shoppingList.add("quiche");
        
    }
    
    public static void printArrayList(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
    
}
