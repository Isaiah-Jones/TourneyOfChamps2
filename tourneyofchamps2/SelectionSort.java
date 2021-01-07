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
public class SelectionSort extends StopWatch implements Sorter {

    public SelectionSort() {
    }

    @Override
    public long sort(int[] list) {

        //Start the clock
        start();
        // Adjiust the boundary of the array
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum number unsorted array
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }

            // Swap the found minimum number with the first number
            int temp = list[min];
            list[min] = list[i];
            list[i] = temp;
        }
        //Stop the clock and return the elaspedTime
        stop();
        return getElapsedTime();
    }
}
