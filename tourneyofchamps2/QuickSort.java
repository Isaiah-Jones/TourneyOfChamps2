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
public class QuickSort extends StopWatch implements Sorter {

    public QuickSort() {
    }

    @Override
    public long sort(int[] list) {

        //Start the clock
        start();
        quickSort(list, 0, list.length - 1);
        
        //stop the clock and return the elapsedTime
        stop();
        return getElapsedTime();
    }

    //Partition the array 
    public static int partition(int[] list, int first, int last) {
        
        //Choose the first element as the pivot, and set indexes for forward and backwards in the search
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {
            //Search from the left
            while (low <= high && list[high] <= pivot) {
                low++;
            }

            //Search from the right
            while (low <= high && list[high] > pivot) {
                high--;
            }
            
            //swap the elements in the list if necessary
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot) {
            high--;
        }

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;

        }
    }

    
public void quickSort(int[] array, int p, int r){
    while (r - p >= 1){
        int q = partition(array, p, r);

        if ((q - 1) - p <= r - (q + 1)){
            quickSort(array, p, q - 1);

            // Prepare for tail recursion
            p = q + 1;
        }
        else {
            quickSort(array, q + 1, r);

            // Prepare for tail recursion
            r = q - 1;
       }
    }
}
}
