/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsimple;

/**
 *
 * @author bodyflicker
 */
public class Threadsimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WorkerRunnable w1 = new WorkerRunnable("X", 10);
        WorkerRunnable w2 = new WorkerRunnable("Y", 10);
        WorkerRunnable w3 = new WorkerRunnable("Z", 10);
        
//        WorkerThread w4 = new WorkerThread("A", 10);
//        WorkerThread w5 = new WorkerThread("B", 10);
//        WorkerThread w6 = new WorkerThread("C", 10);
        
        w1.start();
        w2.start();
        w3.start();
        
//        w4.start();
//        w5.start();
//        w6.start();
    }
    
}
