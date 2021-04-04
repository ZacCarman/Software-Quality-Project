import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static java.time.Duration.ofSeconds;
import java.util.*;
import java.util.ArrayList;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class Testing {
    @BeforeEach
    public void setup(){
        main main = new main();

    }
    @Test
    public void indexcollect(){
        Random ran =new Random();
        //Testing indexcollect
        System.out.println("Testing Index collector");
        int[] Test1 = new int[]{ 1,4,3,1};
        ArrayList<Integer> index1=new ArrayList<Integer>();
        index1.add(0);
        index1.add(3);


        assertTrue(index1.equals(main.IndexCollect(Test1,1)));
        assertTimeout(ofSeconds(1), () -> main.IndexCollect(Test1,1));
        //Creating test array 2 and filling with random variables
        int[] Test2= new int[100];
        for(int i=0;i<Test2.length;i++)
        {
            Test2[i] = ran.nextInt();
        }
        //testing array 2
        assertTimeout(ofSeconds(1), () -> main.IndexCollect(Test2,0));
        //Creating test array 3 and filling with random variables
        int[] Test3= new int[1000];
        for(int i=0;i<Test3.length;i++)
        {
            Test3[i] = ran.nextInt();
        }
        //testing array 3
        assertTimeout(ofSeconds(1), () -> main.IndexCollect(Test3,0));
    }
    @Test
    public void MIN(){
        //Testing min
        System.out.println("Testing Min");

        int[] Test1 = new int[]{ 1,4,3};
        assertEquals(1,main.MIN(Test1));
        assertTimeout(ofSeconds(1), () -> main.MIN(Test1));
        int[] Test2 = new int[]{ 2,-100,10000,232423,566,11,-10023,343};
        assertEquals(-10023,main.MIN(Test2));
        assertTimeout(ofSeconds(1), () -> main.MIN(Test2));
    }
    @Test
    public void MAX(){
        //Testing max
        System.out.println("Testing Max");

        int[] Test1 = new int[]{ 1,4,3};
        assertEquals(4,main.MAX(Test1));
        assertTimeout(ofSeconds(1), () -> main.MAX(Test1));
        int[] Test2 = new int[]{ 2,-100,10000,232423,566,11,-10023,343};
        assertEquals(232423,main.MAX(Test2));
        assertTimeout(ofSeconds(1), () -> main.MAX(Test2));
    }

    @Test
    public void shuffle(){
        //testing shuffle
        System.out.println("Testing Shuffle function");

        //creating random generator to be used later
        Random ran =new Random();
        //Creating arrays to hold unsorted and sorted results
        int[] Test1 = new int[]{ 1,4,3,3,4,1,2};
        int[] Shuffle1=new int[]{ 1,4,3,3,4,1,2};
        //Testing Test array 1
        main.shuffle(Test1);
        assertFalse(Arrays.equals(Test1, Shuffle1));
        assertTimeout(ofSeconds(1), () -> main.shuffle(Test1));
        //Creating test array 2 and filling with random variables
        int[] Test2= new int[100];
        for(int i=0;i<Test2.length;i++)
        {
            Test2[i] = ran.nextInt();
        }
        //testing array 2
        assertTimeout(ofSeconds(1), () -> main.shuffle(Test2));
        //Creating test array 3 and filling with random variables
        int[] Test3= new int[1000];
        for(int i=0;i<Test3.length;i++)
        {
            Test3[i] = ran.nextInt();
        }
        //testing array 3
        assertTimeout(ofSeconds(1), () -> main.shuffle(Test3));
    }
    @Test
    public void NewRandom(){
        Calendar calendar =Calendar.getInstance();
        //testing New Random function
        System.out.println("Testing New random function");
        //Variable to hold the seed
        long Hold =((calendar.getTimeInMillis() +calendar.get(Calendar.SECOND)
                +(60* calendar.get(Calendar.MINUTE))
                +(3600* calendar.get(Calendar.HOUR)))/800);
        //Due to knowing the algorithm we can predict the value
        assertEquals((((calendar.getTimeInMillis() +calendar.get(Calendar.SECOND)
                +(60* calendar.get(Calendar.MINUTE))
                +(3600* calendar.get(Calendar.HOUR)))/800)+((calendar.getTimeInMillis() +calendar.get(Calendar.SECOND)
                +(60* calendar.get(Calendar.MINUTE))
                +(3600* calendar.get(Calendar.HOUR)))/800))%5,main.NewRandom(5));
        assertTimeout(ofSeconds(1), () -> main.NewRandom(100000));
        assertEquals((((calendar.getTimeInMillis() +calendar.get(Calendar.SECOND)
                +(60* calendar.get(Calendar.MINUTE))
                +(3600* calendar.get(Calendar.HOUR)))/1333350222)+Hold)%6000,main.NewRandom(6000));


        //Testing to see if all values are possible

        if(NewRandomPossible(100)) {

            System.out.println("Success");
        }else{
            System.out.println("Failure");
        }
    }

    //This function makes sure all values are possible for the random function
    public boolean NewRandomPossible(int range){
        List<Integer> list1=new ArrayList<Integer>();
        //fill a list full of all possible values
        for (int x=0; x<range; x++){
            list1.add(x);
        }
        long value;
        do{
            //generate a random value
            value=main.NewRandom(range);
            //remove value from list
            if(list1.contains((int)value)==true) {
                for(int c=0; c<list1.size();c++){
                    if (list1.get(c)==value){
                        list1.remove(c);
                    }
                }

            }
         //repeat until list is empty
        }while(list1.isEmpty()==false);
            return true;
    }
    @Test
    public void RockPaperScissors(){
        //testing rock paper scissors
        System.out.println("Testing Rock Paper Scissors game");
        assertEquals(false,main.RPSresult(1,2));
        assertEquals(true,main.RPSresult(1,3));
        assertEquals(true,main.RPSresult(2,1));
        assertEquals(false,main.RPSresult(2,3));
        assertEquals(false,main.RPSresult(3,1));
        assertEquals(true,main.RPSresult(3,2));
        assertEquals(false,main.RPSresult(3,3));
        assertEquals(false,main.RPSresult(1,1));
        assertEquals(false,main.RPSresult(2,2));
        assertTimeout(ofSeconds(1), () -> main.RPSresult(1,2));
        //Due to the random nature of the function we can not test return value
        //We can test timeout conditions although
        assertTimeout(ofSeconds(1), () -> main.RockPaperScissors("PAPeR"));

    }

    @Test
    public void EuclideanDistance(){
        //Testing Euclidean Distance
        System.out.println("Testing Euclidean Distance Function");
        //Testing for range of error of 0.05
        assertEquals(1.41f,(main.EuclideanDistance(1.0,1.0,2.0,2.0)),0.05);
        assertEquals(20.39f,(main.EuclideanDistance(7.0,20.0,3.0,40.0)),0.05);
        assertEquals(99999.5f,(main.EuclideanDistance(100000.0,2.0,0.5,0.222323)),0.05);
        assertTimeout(ofSeconds(1), () -> main.EuclideanDistance(8,7,9,1));
    }

    @Test
    public void BubbleSortASC(){
        //Testing Bubbles Sort Ascending
        //creating random generator to be used later
        Random ran =new Random();
        System.out.println("Testing Bubble Sort Ascending");
        //Creating arrays to hold unsorted and sorted results
        int[] Test1 = new int[]{ 1,4,3};
        int[] Sorted1= new int[]{1,3,4};
        //Testing Test array 1
        Assert.assertArrayEquals(Sorted1,main.BubbleSortASC(Test1));
        assertTimeout(ofSeconds(1), () -> main.BubbleSortASC(Test1));
        //Creating test array 2 and filling with random variables
        int[] Test2= new int[100];
        for(int i=0;i<Test2.length;i++)
        {
            Test2[i] = ran.nextInt();
        }
        //testing array 2
        assertTimeout(ofSeconds(1), () -> main.BubbleSortASC(Test2));
        //Creating test array 3 and filling with random variables
        int[] Test3= new int[1000];
        for(int i=0;i<Test3.length;i++)
        {
            Test3[i] = ran.nextInt();
        }
        //testing array 3
        assertTimeout(ofSeconds(1), () -> main.BubbleSortASC(Test3));
    }

    @Test
    public void BubbleSortDES(){
        //Testing Bubble Sort Descending
        Random ran =new Random();
        System.out.println("Testing Bubble Sort Descending");
        //Creating test array 1 and sorted array 1
        int[] Test1 = new int[]{ 1,4,3};
        int[] Sorted1= new int[]{4,3,1};
        //Testing array 1
        Assert.assertArrayEquals(Sorted1,main.BubbleSortDES(Test1));
        assertTimeout(ofSeconds(1), () -> main.BubbleSortDES(Test1));
        //Creating test array 2 and filling with random variables
        int[] Test2= new int[100];
        for(int i=0;i<Test2.length;i++)
        {
            Test2[i] = ran.nextInt();
        }
        //testing array 2
        assertTimeout(ofSeconds(1), () -> main.BubbleSortDES(Test2));
        //Creating test array 3 and filling with random variables
        int[] Test3= new int[1000];
        for(int i=0;i<Test3.length;i++)
        {
            Test3[i] = ran.nextInt();
        }
        //testing array 3
        assertTimeout(ofSeconds(1), () -> main.BubbleSortDES(Test3));
    }

    @Test
    public void InsertionSortASC(){
        //Testing Insertion Sort Ascending
        Random ran =new Random();
        System.out.println("Testing Insertion Sort Ascending");
        int[] Test1 = new int[] {1,4,3};
        int[] Sorted1= new int[]{1,3,4};
        Assert.assertArrayEquals(Sorted1,main.InsertionSortASC(Test1));
        assertTimeout(ofSeconds(1), () -> main.InsertionSortASC(Test1));
        int[] Test2= new int[100];
        for(int i=0;i<Test2.length;i++)
        {
            Test2[i] = ran.nextInt();
        }
        assertTimeout(ofSeconds(1), () -> main.InsertionSortASC(Test2));
        int[] Test3= new int[1000];
        for(int i=0;i<Test3.length;i++)
        {
            Test3[i] = ran.nextInt();
        }
        assertTimeout(ofSeconds(1), () -> main.InsertionSortASC(Test3));
    }

    @Test
    public void InsertionSortDEC(){
        //Testing Insertion Sort Descending
        Random ran =new Random();
        System.out.println("Testing Insertion Sort Descending");
        int[] Test1 = new int[] {1,4,3};
        int[] Sorted1= new int[]{4,3,1};
        Assert.assertArrayEquals(Sorted1,main.InsertionSortDES(Test1));
        assertTimeout(ofSeconds(1), () -> main.InsertionSortDES(Test1));
        int[] Test2= new int[100];
        for(int i=0;i<Test2.length;i++)
        {
            Test2[i] = ran.nextInt();
        }
        assertTimeout(ofSeconds(1), () -> main.InsertionSortDES(Test2));
        int[] Test3= new int[1000];
        for(int i=0;i<Test3.length;i++)
        {
            Test3[i] = ran.nextInt();
        }
        assertTimeout(ofSeconds(1), () -> main.InsertionSortDES(Test3));
    }

    @Test
    public void MergeSort()
    {
        // Testing Merge Sort
        Random ran = new Random();
        System.out.println("Testing Merge Sort");

        int[] Test1 = new int[] {1,4,3,5,2};
        int[] Sorted1 = new int[] {1,2,3,4,5};
        Assert.assertArrayEquals(Sorted1, main.msort(Test1, 0, 4)); // checking expected output
        assertTimeout(ofSeconds(1), () -> main.msort(Test1, 0, 4)); // checking time constraint

        int[] Test2= new int[100];
        for(int i = 0; i < Test2.length; i++)
        {
            Test2[i] = ran.nextInt();
        }
        assertTimeout(ofSeconds(1), () -> main.msort(Test2, 0, 99)); // checking larger time constraint

        int[] Test3= new int[1000];
        for(int i = 0; i < Test3.length; i++)
        {
            Test3[i] = ran.nextInt();
        }
        assertTimeout(ofSeconds(1), () -> main.msort(Test3, 0, 999)); // checking even larger time constraint
    }

    @Test
    public void HeapSortTest()
    {
        System.out.println("Testing heap sorting functions");
        int[] startingArr1 = {5, 16, 18, 3, 12, 1};
        int[] sortedArr1 = {1, 3, 5, 12, 16, 18};

        Assert.assertArrayEquals(sortedArr1, main.sort(startingArr1));
        assertTimeout(ofSeconds(1), () -> main.sort(startingArr1));


        int[] startingArr2 = {16, 75, 8, 83, 122, 31};
        int[] sortedArr2 = {8, 16, 31, 75, 83, 122};

        Assert.assertArrayEquals(sortedArr2, main.sort(startingArr2));
        assertTimeout(ofSeconds(1), () -> main.sort(startingArr2));

    }

    @Test
    public void reverseTest()
    {
        System.out.println("Testing the reverse order function");

        int[] sortedArr = {1, 3, 5, 12, 16, 18};
        int[] reverseArr= {18, 16, 12, 5, 3, 1};

        Assert.assertArrayEquals(reverseArr, main.reverseArray(sortedArr));
        assertTimeout(ofSeconds(1), () -> main.sort(sortedArr));
    }

    @Test
    public void select_sort_test() {

        //make an unsorted list
        int[] unsorted = {7, 22, 38, 7, 7, 1, 3};
        //make the corresponding sorted list
        int[] sorted = {1, 3, 7, 7, 7, 22, 38};
        //run the sort algorithm
        int[] maybe_sorted = main.select_sort(unsorted);
        boolean match = true;

        //loop through the sorted list and maybe sorted list checking to see if they do not match in which case it will be flagged
        for (int z = 0; z < maybe_sorted.length; z++) {
            if (maybe_sorted[z] != sorted[z]) {

                match = false;

            }

        }

        assertTrue(match);
    }

    @Test
    public void quick_sort_test() {

        //make an unsorted list
        int[] unsorted = {7, 22, 38, 7, 7, 1, 3};
        //make the corresponding sorted list
        int[] sorted = {1, 3, 7, 7, 7, 22, 38};
        //take the length of either array and subtract 1  to get the index of the last value
        int arraylen = unsorted.length - 1;

        //run the sort algorithm
        int[] maybe_sorted = main.quick_sort(unsorted,0,arraylen );
        boolean match = true;

        //loop through the sorted list and maybe sorted list checking to see if they do not match in which case it will be flagged
        for (int z = 0; z <= arraylen; z++) {
            if (maybe_sorted[z] != sorted[z]) {

                match = false;

            }

        }

        assertTrue(match);
    }
    
    @Test
    public void isPrimeTest()
    {
    	System.out.println("Testing isPrime function");
    	Assert.assertEquals(true, main.isPrime(7));
    	Assert.assertEquals(true, main.isPrime(11));
    	Assert.assertEquals(false, main.isPrime(24));
    	Assert.assertEquals(true, main.isPrime(104287));
    	assertTimeout(ofSeconds(1), () -> main.isPrime(18));
    	assertTimeout(ofSeconds(1), () -> main.isPrime(104287));
    }

}
