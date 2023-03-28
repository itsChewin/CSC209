/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortinglab;

/**
 *
 * @author chewi
 */
public class SortingLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data d1 = new Data(100);
        d1.addNewInfo(50); d1.addNewInfo(100);
        d1.addNewInfo(25); d1.addNewInfo(9);
        d1.addNewInfo(40); d1.addNewInfo(1200);
        d1.addNewInfo(21); d1.addNewInfo(60);
        d1.addNewInfo(8); d1.addNewInfo(25);
        d1.addNewInfo(12); d1.addNewInfo(30);
        Data d2 = new Data(100);
        d2.clone(d1);
        d2.printAll();
        d2.selectionSort();
        d2.printAll();
        Data d3 = new Data(100); d3.clone(d1);
        d3.printAll();
        System.out.print("Insertion Sort:");
        d3.insertionSort();
        d3.printAll();
        
        Data d4 = new Data(100); d4.clone(d1);
        d4.printAll();
        System.out.print("Bubble Sort:");
        d4.bubbleSort();
        d4.printAll();
        
        Data d5 = new Data(100); d5.clone(d1);
        d5.printAll();
        System.out.print("Quick Sort:");
        d5.quickSort(0, d5.size-1);
        d5.printAll();
    }
    
}
