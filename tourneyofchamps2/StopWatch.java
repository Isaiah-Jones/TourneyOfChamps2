/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourneyofchamps2;

/**
 *
 * @author Isaiah
 */
import java.util.Date;

public class StopWatch {

    private long startTime;
    private long endTime;

    java.util.Date time = new java.util.Date();

    //Get the startTime
    public long getStartTime() {
        return startTime;
    }

    //Get the endTime
    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    //Set startTime to the current time
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    //set endTime to the current time
    public void stop() {
       this.endTime = System.currentTimeMillis();;
    }

    //subtract startTime from endTime to get the elapsed time.
    public long getElapsedTime() {
        return (endTime - startTime);
    }

}
