/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1;
import java.util.*;

/**
 *
 * @author Mark
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 1: Using Java, simulate a line at a store or bank using a queue. .
        //The program should allow the customer to join the line and wait for service, 
        //and should serve customers in the order they joined the line.
        
        //Create a Queue
        Queue<String> queue = new LinkedList<>();
        
        //Add persons on the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Debbie");
        
        
        System.out.println("Initial queue: " + queue);
        
        queue.remove(); 
        
        System.out.println("Updated queue: " + queue);
        
        System.out.println("Is Queue Empty?: " + queue.isEmpty());
        

        
        
        
    }
    
}
