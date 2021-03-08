import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static java.time.Duration.ofSeconds;
import java.util.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Testing {
    @BeforeEach
    public void setup(){
        main main = new main();

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

     /*******************************************************************************************
     * Scott
     * These are to test Merge Sort.
     ********************************************************************************************/
    @Test
    public void MergeSort() {
        // Testing Merge Sort Ascending
        Random ran = new Random();
        System.out.println("Testing Merge Sort");

        int[] Test1 = new int[] {1,4,3,5,2};
        int[] Sorted1 = new int[] {1,2,3,4,5};
        assertTimeout(ofSeconds(1), () -> main.MergeSort(Test1, 0, 4));
        Assert.assertArrayEquals(Sorted1, main.MergeSort(Test1, 0, 4));

        int[] Test2= new int[100];
        for(int i = 0; i < Test2.length; i++)
        {
            Test2[i] = ran.nextInt();
        }
        assertTimeout(ofSeconds(1), () -> main.MergeSort(Test2, 0, 99));

        int[] Test3= new int[1000];
        for(int i = 0; i < Test3.length; i++)
        {
            Test3[i] = ran.nextInt();
        }
        assertTimeout(ofSeconds(1), () -> main.MergeSort(Test3, 0, 999));
    }

    /*******************************************************************************************
     * END SCOTT
     ********************************************************************************************/

    /* TEMPORARY TO FIX FUNCTION RETURNS

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
	*/

}
