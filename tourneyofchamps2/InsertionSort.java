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
public class InsertionSort extends StopWatch implements Sorter {

    public InsertionSort() {
    }

    @Override
    public long sort(int[] list) {
        
        //Start the clock
        start();
        for (int i = 1; i < list.length; i++) {
            int current = list[1];
            int j;
            for (j = i - 1; j >= 0 && list[j] > current; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = current;
        }
        
        //Stop the clock and return the elapsedTime
        stop();
        return getElapsedTime();
    }

}
