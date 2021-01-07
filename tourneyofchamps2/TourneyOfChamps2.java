/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourneyofchamps2;

/**
 *CSC 255
 * Mr.Osborne
 * @author Isaiah Jones
 * 11-12-17
 */
public class TourneyOfChamps2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//Declare arrays of integers sizes: 1000, 5000, 10000, 50000, 100000, 500000, and 1000000
        int[] list1 = new int[1000];
        int[] list5 = new int[5000];

        int[] list10 = new int[10000];
        int[] list50 = new int[50000];

        int[] list100 = new int[100000];
        int[] list500 = new int[500000];
        int[] listMill = new int[1000000];

        //declare new instances of the sorting java classes
        BubbleSort bubble = new BubbleSort();
        InsertionSort insert = new InsertionSort();
        MergeSort merge = new MergeSort();
        SelectionSort select = new SelectionSort();
        QuickSort quick = new QuickSort();
        
        //Print out table
        System.out.println("1000" + "\t" + "5000"+ "\t" + "10000"+ "\t" + "50000"+ "\t" + "100000"+ "\t" + "500000"+ "\t" + "1000000");
        tableHelp();

        //Print out time results
        System.out.println(bubble.sort(loader(list1)) + "\t" + bubble.sort(loader(list5)) + "\t" + bubble.sort(loader(list10)) + "\t"
                + bubble.sort(loader(list50)) + "\t" + bubble.sort(loader(list100)) + "\t" + bubble.sort(loader(list500)) + "\t" + bubble.sort(loader(listMill)));
        System.out.println(insert.sort(loader(list1)) + "\t" + insert.sort(loader(list5)) + "\t" + insert.sort(loader(list10)) + "\t"
                + insert.sort(loader(list50)) + "\t" + insert.sort(loader(list100)) + "\t" + insert.sort(loader(list500)) + "\t" + insert.sort(loader(listMill)));
        System.out.println(merge.sort(loader(list1)) + "\t" + merge.sort(loader(list5)) + "\t" + merge.sort(loader(list10)) + "\t"
                + merge.sort(loader(list50)) + "\t" + merge.sort(loader(list100)) + "\t" + merge.sort(loader(list500)) + "\t" + merge.sort(loader(listMill)));
        System.out.println(select.sort(loader(list1)) + "\t" + select.sort(loader(list5)) + "\t" + select.sort(loader(list10)) + "\t"
                + select.sort(loader(list50)) + "\t" + select.sort(loader(list100)) + "\t" + select.sort(loader(list500)) + "\t" + select.sort(loader(listMill)));
        System.out.println(quick.sort(loader(list1)) + "\t" + quick.sort(loader(list5)) + "\t" + quick.sort(loader(list10)) + "\t"
                + quick.sort(loader(list50)) + "\t" + quick.sort(loader(list100)) + "\t" + quick.sort(loader(list500)) + "\t" + quick.sort(loader(listMill)));

    }

    private static int[] loader(int[] list) {

        //load array with random integers from 1-1000
        for (int i = 0; i < list.length; i++) {
            list[i] = ((int) Math.random() * 1000);
        }
        
        //create clone array to fill with random integers from 1- 1000
        int clone[] = new int[list.length];

        //copy integers from the list into the clone
        for (int i = 0; i < list.length; i++) {
            clone[i] = list[i];
        }

        return clone;
    }
    
        private static void tableHelp() {
            
       //print out 60 "_" to build the table     
        for (int i = 0; i <= 60; i++) {
            if (i < 60) {
                System.out.print("_");
            } else {
                System.out.println("_");
            }
        }
        
    }
}


