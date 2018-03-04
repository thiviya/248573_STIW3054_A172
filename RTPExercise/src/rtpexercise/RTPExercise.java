/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtpexercise;

/**
 *
 * @author thiviya
 */
public class RTPExercise extends Thread{
    
public static void main(String[] args) {
    RTPExercise E1 = new RTPExercise();
        E1.start();
    }

    @Override
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