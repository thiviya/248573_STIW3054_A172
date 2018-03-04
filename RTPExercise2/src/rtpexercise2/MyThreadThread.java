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
public class MyThreadThread extends Thread{
    

public void run() {
        try {
            for (int x = 10; x <= 20; x++) {
                    System.out.println(x);
;
                sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
