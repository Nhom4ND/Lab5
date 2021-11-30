/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5bai1;

import static java.lang.Thread.sleep;

/**
 *
 * @author Cao Trinh
 */
public class MyThread2 implements Runnable{
     public static void main(String[] args){         
         MyThread2 myRunnable = new MyThread2();         
         Thread thread = new Thread(myRunnable);         
         thread.start();         
         System.out.println("This is the main thread");     
     }        
     public void run(){            
         while (true){                        
             try{                
                 System.out.println("This is the child Thread");                 
                 sleep(1000);                
             } catch (InterruptedException ex){                
                 ex.printStackTrace();            
             }         
         }     
     }
}
