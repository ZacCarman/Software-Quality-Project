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
     * ID: 100703933
     *
     * Date: 04/09/2021
     *
     *
     */
    //ZAC
    //Function to return every index a value is at
    public static ArrayList<Integer> IndexCollect(int[] array,int value){
        //creating arraylist
        ArrayList<Integer> indexes =new ArrayList<Integer>();
        //loop for length of array
        for (int x=0; x<array.length;x++){
            //if array equals value append index to list
            if(array[x]==value){
                indexes.add(x);
            }
        }
        //return list
        return indexes;
    }
    //ZAC
    //Function to return min value of integer array
    public static int MIN(int[] array){
        //Set min to maximum possible value
        int min= Integer.MAX_VALUE;
        //loop for all array values
        for (int x=0; x<array.length;x++){
            //if value is less then min set min to value
            if(array[x]<min){
                min=array[x];
            }
        }
        //return min
        return min;
    }

    //ZAC
    //Function to return max value of integer array
    public static int MAX(int[] array){
        //Set max to minimum possible value
        int max= Integer.MIN_VALUE;
        //loop for all array values
        for (int x=0; x<array.length;x++){
            //if value is greater then max set max to value
            if(array[x]>max){
                max=array[x];
            }
        }
        //return max
        return max;
    }

    //ZAC
    //Function to shuffle and return any int array
    public static int[] shuffle(int[] shuffle){
        //getting length
        int length=shuffle.length;
        //loop for length in reverse
        for(int x=length-1; x>0;x--){
            //generate random indexes
            int index =(int)NewRandom(x+1);
            //Swap
            int hold = shuffle[index];
            shuffle[index]=shuffle[x];
            shuffle[x]=hold;
        }

        return shuffle;
    }

    //ZAC
    //Function to generate sudo random value from 0-range
    //Creating value to hold seed
    private static long seed=0;
    //Creating value to make adjustments for the potential of quick consecutive calls.
    private static int adjust=0;
    public static long NewRandom(int range){
        //Creating calendar object
        Calendar calendar =Calendar.getInstance();
        //Generate initial value by getting time
        long Value = calendar.getTimeInMillis() +calendar.get(Calendar.SECOND)
                +(60* calendar.get(Calendar.MINUTE))
                +(3600* calendar.get(Calendar.HOUR));
        //making adjustments to value in case of quick calls
        switch(adjust){
            case(0):
                Value=Value/800;
                adjust++;
                break;
            case(1):
                Value=Value/1000212;
                adjust++;
                break;
            case(2):
                Value=Value/1333350222;
                adjust++;
                break;
            case(3):
                Value=Value/355036892;
                adjust++;
                break;
            case(4):
                Value=Value/758016781;
                adjust++;
                break;
            case(5):
                Value=Value/567;
                adjust++;
                break;
            case(6):
                Value=Value/23412412;
                adjust++;
                break;
            case(7):
                Value=Value/120975;
                adjust++;
                break;
            default:
                adjust=0;
        }
        //Set seed
        if(seed ==0){
            seed= Value;
        }
        //Return value modulo by the range
        return ((Value+seed)%range);
    }


    //ZAC
    //Function to a simple game of rock paper scissors
    //Code adapted from Assignment 1
    public static boolean RPSresult(int user, int computer){

        if (user==computer) {
            //print tie
            System.out.println("It's a tie");
            return false;


        } else {
            //if user picks Rock and the computer picks paper computer wins
            if (user == 1) {
                if (computer == 2) {
                    //print computer wins
                    System.out.println("Computer Wins; Paper covers Rock");
                    return false;
                } else {
                    //if user picks Rock and computer picks Scissors
                    //print user wins
                    System.out.println("You Win; Rock crushes Scissors");
                    return true;
                }

            } else {
                //if user picks Paper and computer pick Rock user wins
                if (user == 2) {
                    if (computer == 1) {
                        //print user wins
                        System.out.println("You Win; Paper covers Rock");
                        return true;
                    } else {
                        //if user pick Paper and the computer picks Scissors computer wins
                        //print user wins
                        System.out.println("Computer Wins; Scissors cuts Paper");
                        return false;
                    }
                } else {
                    //User picks Scissors and computer picks rock Computer wins
                    if (computer == 1) {
                        System.out.println("Computer Wins; Rock crushes Scissors");
                        return false;
                    } else {
                        //If user picks Scissors and computer picks Rock
                        //Print user wins
                        System.out.println("You Win; Scissors cuts Paper");
                        return true;
                    }
                }
            }

        }

    }
    //ZAC
    //Function to a simple game of rock paper scissors
    //Code adapted from Assignment 1
    public static boolean RockPaperScissors(String input){
        //making input all lower case
        input = input.toLowerCase();
        //initialize Random
        System.out.println(input);
        Random random =new Random();
        //Initialisze user integer
        int user=0;
        //Switch statement to set user value
        switch(input){
            case("rock"):
                user=1;
                break;
            case("paper"):
                user=2;
                break;
            case("scissors"):
                user=3;
                break;
            default:
                System.out.println("Incorrect Input Returning False");
                return false;
        }
        //Setting computer value
        int computer = random.nextInt(3) + 1;
        switch (computer) {
            case (1):
                System.out.println("Computer picked Rock");
                break;
            case (2):
                System.out.println("Computer picked Paper");
                break;
            case (3):
                System.out.println("Computer picked Scissors");
                break;
        }
        boolean Win;
        //finding who won
        Win=RPSresult(user,computer);
        //returning results
        return Win;

    }

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

    /*******************************************************************************************
     * SCOTT
     * Function to sort array of integers using
     * Merge Sort in ascending and descending order.
     ********************************************************************************************/

    public static int[] merge(int arr[], int left, int mid, int right) {

        int sizeL=  mid - left + 1; // size of left sub-array

        int sizeR = right - mid; // size of right sub-array

        //temporary sub-arrays for left and right
        int leftArr[] = new int[sizeL];
        int rightArr[] = new int[sizeR];

        for (int i = 0; i < sizeL; ++i)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < sizeR; ++j)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0;
        int j = 0;
        int k = left;

        // Merging the 2 sub-arrays
        while (i < sizeL && j < sizeR) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            }
            else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // see if there are remaining elements left in the sub-arrays to copy over
        while (i < sizeL) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (i < sizeR) {
            arr[k] = rightArr[i];
            j++;
            k++;
        }

        return arr;
    }

    public static int[] msort(int[] arr, int left, int right) {
        // arr is the input array, left is left most index, and right is right most. mid is middle

        if (right > left) {
            // the middle point of the array
            int mid = (left + right) / 2;

            // recursively sort the first and second sub-arrays
            msort(arr, left, mid);
            msort(arr, mid + 1, right);

            // merge the 2 sub-arrays
            merge(arr, left, mid, right);
        }

        return arr;
    }

    /*******************************************************************************************
     * END SCOTT
     ********************************************************************************************/

    /*Alexander Papachristu
     * sort function that builds a heap from an inputted array
     * that is sent to the heapify function
     */
    public static int[] sort(int arr[])
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

        return arr;
    }

    /*Alexander Papachristu
     * recursive function that uses heapsort to
     * sort an inputted array
     */
    public static void heapify(int arr[], int arrLength, int x)
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
    public static int[] reverseArray(int arr[])
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



    //Iliya Karac
    //Function sorts using the selection sort method in Ascending order
    //it will sort the given int array and return an instance of that array for ease of testing

    public static int[] select_sort(int[] list) {

        //initial variables length is use for forloop limit and index will hold the index of smallest item
        int length = list.length;
        int index = 0;

        //we go through the array every time initializing the current item as the smallest
        for(int x = 0; x < length - 1; x++) {
            int min =list[x];

            // we start looping through the list again starting at the index right after current x
            for (int i = x + 1; i <length; i++) {
                // we find the smallest item and save its  value and index
                if(list[i]<min) {
                    min = list[i];
                    index = i;

                }
            }

            //we swap the current value at index x with the smallest value and the value at x goes to index of the samllest value
            int swap_val = list[x];
            list[x] = min;
            list[index] = swap_val;

        }



        // return a list for ease of testing
        return list;
    }



    //Iliya Karac
    //Function sorts using the quick sort method in Ascending order
    //it will sort the given int array and return an instance of that array for ease of testing
    //in this version of the quick sort we set the pivot as the highest index

    public static int[] quick_sort(int[] arr, int low, int high){
        //this if statement checks if the lower index is less than the higher it not it is considered a base case and ends a branch of recursion
        if(low < high)
        {
            // the function is called to find a pivot and rearrange the array
            int index = split(arr, low, high);

            // recursively sort the list bellow the pivot and above the pivot including the pivot
            quick_sort(arr, low, index-1);
            quick_sort(arr, index+1, high);
        }
        return arr;
    }

    // splits the array based on the pivot, all smaller or equal pivot index and all greater are placed after
    public static int split(int[]arr, int low, int high)
    {
        //initial values are set
        int pivot = arr[high];
        int i = low-1;
        int temp = 0;

        // run through the array starting from low index ending before high (the pivot)
        for(int x = low; x<high; x++){
            //when item at x is less than the pivot we push it behind the current x this ensures that the small values stay bellow the index of pivot
            if(arr[x] < pivot)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
            }
        }

        //we must now put the pivot in the correct location and return the index of pivot
        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        //we know that index i will end at the last value that is smaller than pivot so we place it right after i and put the value at i+1 at the end

        return (i+1);
    }
    //function to check if a value is prime or not
    public static boolean isPrime(int input)
    {
    	boolean prime = true;
    	for(int i = 2; i <= input/2; i++)
    	{
    		if(input % i == 0)
    		{
    			prime = false;
    			break;
    		}
    	}
    	return prime;
    }

}
