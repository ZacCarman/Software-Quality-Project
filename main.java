import java.util.*;
import java.lang.Math;
public class main {
    /**
     * Creating a update for JDK
     *
     * Author: Zachary Carman
     * ID: 100697844
     * Author: Alexander Papachristu
     * ID: 100693745
     * Author: Scott Garland
     * ID: 100723360
     * Author: Iliya Karac
     * ID:
     *
     * Date: 04/09/2021
     *
     *
     */


    //ZAC
    //Function to find Euclidean Distance by passing
    // four double values and returning a single
    //double distance
    public static double EuclideanDistance(double x1, double y1, double x2, double y2){
        //Initializing Variables
        double distance,A,B,C,D;
        //Getting Absolute value of the differences
        A=Math.abs(x1-x2);
        B=Math.abs(y1-y2);
        //Interior Powers
        C=Math.pow(A,2);
        D=Math.pow(B,2);
        //Calculating distance
        distance = Math.pow(C+D,0.5);
        //Return Value
        return distance;
    }
    //ZAC
    //Function to sort using the bubble sort method in Ascending order
    //which takes in an array and returns a
    //sorted array
    public static int[] BubbleSortASC(int[] Bubble){
        //Creating variable to hold array length
        int size=Bubble.length,temp;
        //creating array to hold if index has been changed
        boolean change;
        //loop for size of array
        for (int x=0; x<size-1;x++){
            //Set change to be false
            change=false;
            //Loop again for how deep we are in the array
            for (int y=0;y<size-x-1;y++){
                //if Bubble at y is larger then Bubble at y+1 SWAP
                if(Bubble[y]>Bubble[y+1]){
                    temp=Bubble[y];
                    Bubble[y]=Bubble[y+1];
                    Bubble[y+1]=temp;
                    change=true;
                }
            }
            //If no swap break
            if(change== false){
                break;
            }
        }
        //Return sorted array
        return Bubble;
    }
    //ZAC
    //Function to sort using the bubble sort method in descending order
    //which takes in an array and returns a
    //sorted array
    public static int[] BubbleSortDES(int[] Bubble){
        //Creating variable to hold array length
        int size=Bubble.length,temp;
        //creating array to hold if index has been changed
        boolean change;
        //loop for size of array
        for (int x=0; x<size-1;x++){
            //Set change to be false
            change=false;
            //Loop again for how deep we are in the array
            for (int y=0;y<size-x-1;y++){
                //if Bubble at y is smaller then Bubble at y+1 SWAP
                if(Bubble[y]<Bubble[y+1]){
                    temp=Bubble[y];
                    Bubble[y]=Bubble[y+1];
                    Bubble[y+1]=temp;
                    change=true;
                }
            }
            //If no swap break
            if(change== false){
                break;
            }
        }
        //Return sorted array
        return Bubble;
    }
    //ZAC
    //function to sort array of integers using insertion
    //sort in ascending order
    public static int[] InsertionSortASC(int sort[]){
        //get size of array
        int size =sort.length;
        //loop for size of array
        for (int x =1; x<size;x++){
            //key equals next element
            int key = sort[x];
            //i holds current index
            int i = x-1;
            //while i is greater then key more it forward in the array
            while(i>0 && sort[i]>key){
                sort[i+1]=sort[i];
                i=i-1;

            }
            sort[i+1]=key;
        }
        //return array
        return sort;
    }
    //ZAC
    //function to sort array of integers using insertion
    //sort in descending order
    public static int[] InsertionSortDES(int sort[]){
        //get size of array
        int size =sort.length;
        //loop for size of array
        for (int x =1; x<size;x++){
            //key equals next element
            int key = sort[x];
            //i holds current index
            int i = x;
            //while i is greater then key more it forward in the array
            while(i>0 && sort[i-1]<key){
                sort[i]=sort[i-1];
                i=i-1;

            }
            sort[i]=key;
        }
        //return array
        return sort;
    }


    /* TEMPORARY TO FIX FUNCTION RETURNS

    /*Alexander Papachristu
	 * sort function that builds a heap from an inputted array
	 * that is sent to the heapify function
	 */
    /*
    public void sort(int arr[])
    {
        int arrLength = arr.length;

        //Build heap
        for (int i = arrLength / 2 - 1; i >= 0; i--)
            heapify(arr, arrLength, i);

        //Remove an element from the heap
        for (int i = arrLength - 1; i > 0; i--) {
            // Move current root to the last value of the array
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            heapify(arr, i, 0);
        }

    }
    
    /*Alexander Papachristu
     * recursive function that uses heapsort to 
     * sort an inputted array 
     */
    /*
    private void heapify(int arr[], int arrLength, int x)
    {
        int largest = x; //get index of the largest element
        int left = 2 * x+1; //get index of the left child from tree
        int right = 2 * x + 2; //get index of the right child from tree

        //check if left child is larger than the largest
        if(left < arrLength && arr[left] > arr[largest])
            largest = left;

        //check if right child is larger than the largest
        if(right < arrLength && arr[right] > arr[largest])
            largest = right;

        //check if largest is no longer the root
        if(largest != x)
        {
        	//change largest value to the largest of the child values
            int temp = arr[x];
            arr[x] = arr[largest];
            arr[largest] = temp;

            heapify(arr,arrLength, largest); //recursively call heapify function
        }
    }
	
	 /*Alexander Papachristu
     *print the inputted array
     */
    /*
    public void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	 /*
     * Alexander Papachristu
     * take an input of an array and use a loop to reverse an array
     * in idea to take an array that sorts from least to greatest
     * to make it sorted greatest to least.
     */
    /*
    public int[] reverseArray(int arr[])
    {
    	int arrLen = arr.length;
    	int revArr[] = new int [arrLen]; //make a parallel array
    	int count = 0;
    	
    	for(int i = arrLen-1; i>=0; i--) //count down from the highest index of original array to the lowest index
    	{
    		revArr[count] = arr[i]; //flip positions
    		count++; //keep track of the position of the reversed array
    	}
    	return revArr; //return the reversed array
    }
    */

}
