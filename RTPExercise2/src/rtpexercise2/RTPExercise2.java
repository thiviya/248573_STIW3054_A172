/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtpexercise2;

/**
 *
 * @author thiviya
 */
public class RTPExercise2 extends Thread{

    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().getName());
        MyThread E1 = new MyThread();
        E1.start();
        MyThreadThread E2= new MyThreadThread();
        E2.start();
    }
    
}
