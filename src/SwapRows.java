/*
Assignment Lab 8
Description: This program is intended to show user the original 2D array and then ask the user to enter the row numbers
for swapping if the user enters within the range of index then swap the two rows and then show the array after swap is
done else ask the user until they enter a valid index address as long as he/she want to continue.
Name Tewodros Damitie
Id 918377205
class csc 211
semester spring 2020
 */
import java.util.Scanner;
public class SwapRows {
    //creating 2d array and initializing it.
    static int [][] array = {{10, 5, 0, 10},
            {23, 33, 5, 8},
            {9, 34, 4, 32},
            {73, 67, 43, 8}
    };
     public static void main(String[] args){
         //for printing the 2D array before swap is done.
         System.out.println("The original array is:");
         for(int i = 0; i< array.length;i++){
            for(int j = 0; j< array[0].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println("Please input the index number of the two rows you want to swap:");
         //To create Scanner object
         Scanner input = new Scanner(System.in);
         int index1 = input.nextInt();
         int index2 = input.nextInt();
         //infinite loop until the user enters a valid index
         while(true) {
             //to check if the user inputs a valid index if so to call swap method and to break out of the loop.
             if ((index1 >= 0 && index1 < array.length) && (index2 >= 0 && index2 < array.length)) {
                 swapRows(array, index1, index2);
                 break;
             }
             //to ask the user to input a valid index number and if so to call swap method and break out of the loop.
             else {
                 System.out.println("Please input a valid row number");
                 index1 = input.nextInt();
                 index2 = input.nextInt();
                 if ((index1 >= 0 && index1 < array.length) && (index2 >= 0 && index2 < array.length)) {
                     swapRows(array, index1, index2);
                     break;
                 }
             }

         }
         // for printing the array after swap is done.
         System.out.println("The array after row " + index1 + " and " + index2 + " are Swapped:");
         for(int i = 0; i< array.length;i++){
             for(int j = 0; j< array[0].length;j++){
                 System.out.print(array[i][j] + " ");
             }
             System.out.println();
         }

     }
    public static void swapRows(int[][] arr, int x,  int y){
         //Creating 1D array for storing the elements at index x from the 2D array.
         int[] temp = new int[array[0].length];
         //using for loop to swap row x and y.
             for(int j = 0; j < array[0].length;j++){
                 temp[j] = array[x][j];
                 array[x][j]= array[y][j];
                 array[y][j]=temp[j];
             }
    }
}
