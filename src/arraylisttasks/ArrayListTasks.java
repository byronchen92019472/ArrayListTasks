/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

/**
 *
 * @author 92019472
 */
public class ArrayListTasks {

    public static ArrayList personArrayList = new ArrayList();
    
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
        
        
        obtainRecords("C:\\Users\\92019472\\OneDrive - Computer Power Plus\\Data Structure and Algorithm\\Activities\\ArrayListTasks\\src\\arraylisttasks\\PersonList.csv");
        printArrayList(personArrayList);
    }
    
    public static void printArrayList(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
    
    public static void obtainRecords(String path){
        LineNumberReader lr = null;    
        String[] oneRecord = new String[3];      
        Person person;
        
        try {
            FileReader inputStream = new FileReader(path);
            
            lr = new LineNumberReader(inputStream);
            String str;
            
            while((str = lr.readLine()) != null){
                oneRecord = str.split(",");
                
                person = new Person(oneRecord[0], oneRecord[1], oneRecord[2]);
                personArrayList.add(person);
            }
            
        }
        catch(IOException ioe){
            System.out.println("IOException occured");
        }
    }
    
}
