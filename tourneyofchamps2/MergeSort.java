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
public class MergeSort extends StopWatch implements Sorter {

    public MergeSort() {
    }

    @Override
    public long sort(int[] list) {
        
        //Start the clock
        start();
        
        
        if (list.length > 1) {
            
            //Sort the first half
            int[] half_1 = new int[list.length / 2];
            System.arraycopy(list, 0, half_1, 0, list.length / 2);
            sort(half_1);
            
            //Sort the second half
            int half_2_length = list.length - list.length / 2;
            int[] half_2 = new int[half_2_length];
            System.arraycopy(list, list.length / 2, half_2, 0, half_2_length);
            sort(half_2);

            //Merge the first half ans the second half into the list
            merge(half_1, half_2, list);
        }
        
        //Stop the clock and return the elapsedTime
        stop();
        return getElapsedTime();
    }

    private void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2]) {
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }
        }

        while (current1 < list1.length) {
            temp[current3++] = list2[current1++];
        }
        while (current2 < list2.length) {
            temp[current3++] = list2[current2++];
        }
    }
}
