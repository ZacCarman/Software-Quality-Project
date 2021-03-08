import java.util.*;
import java.lang.Math;
public class main {
    /**
     * Creating a update for JDK
     *
     * Author: Zachary Carman
     * ID: 100697844
     * Author: Alexander Papachristu
     * ID:
     * Author: Scott Garland
     * ID:
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

}
