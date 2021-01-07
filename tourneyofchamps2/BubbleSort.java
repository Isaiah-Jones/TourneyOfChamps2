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
public class BubbleSort extends StopWatch implements Sorter {

    public BubbleSort() {
    }

    @Override
    public long sort(int[] list) {
        boolean nextPass = true;

        //Start the clock
        start();
        for (int x = 1; x < list.length && nextPass; x++) {
            nextPass = false;
            for (int i = 0; i < list.length - x; i++) {

                //Swap list[i] with list[i+1]
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    nextPass = true;
                }
            }
        }
        //Stop the clock and return the elapsedTime
        stop();
        return getElapsedTime();
    }
}
