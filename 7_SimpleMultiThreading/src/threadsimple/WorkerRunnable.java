package threadsimple;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bodyflicker
 */
public class WorkerRunnable implements Runnable {
    public String nama;
    public int distance;
    public Thread thread;
    public int prioritas;

    public WorkerRunnable(String nama, int prioritas) {
        this.nama = nama;
        this.prioritas = prioritas;
        this.distance = 0;
        System.out.println("Worker " + nama + " bergabung!");
    }
    
    @Override
    public void run() {
        while(this.distance < 100)
        {
            this.distance +=  (10 * Math.random()); // 0 - 9.999999
            System.out.println("Worker bernama " + this.nama + " telah bekerja " + this.distance + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(WorkerRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void start() {
        System.out.println("Worker bernama " + this.nama + " start!");
        if (thread == null) {
            thread = new Thread(this, this.nama);
            thread.setPriority(prioritas);
            thread.start();
        }
    }

}
