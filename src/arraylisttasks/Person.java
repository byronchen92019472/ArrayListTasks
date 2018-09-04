/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylisttasks;

/**
 * @name Byron Chen
 * @id 92019472
 */
public class Person {
    
        private String id;
        private String name;
        private String weight;
        
        
        public Person(String id, String name, String weight){
            this.id = id;
            this.name = name;
            this.weight = weight;
        }
        
        
        @Override
        public String toString(){
            return this.id + " " + this.name + " " + this.weight + "kg";
        }
}
