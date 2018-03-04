/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtpexercise2;

import static java.lang.Thread.sleep;

/**
 *
 * @author thiviya
 */
public class MyThread extends Thread{
    

public void run() {
        try {
            for (int x = 5; x <= 100; x+=5) {
                if((x%2)==0){
                    System.out.println(x + "A");
                }
                else{
                    System.out.println(x);
                }
;
                sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
