# Software-Quality-Project


## Zac
### IndexCollect
This function takes in an integer array of any size and an integer value. The function will return and integer arraylist of all indexes the entered value appears in the given array.
Testing:
Testing of this function includes testing for both correctness and timeout conditions. This test case involves passing through assigned variables and increasing amount of random variables for timeout conditions.

### MIN
This function takes in an integer array of any size and returns an integer. This integer will hold the value of the minimum value from the array.
Testing:
Testing of this function includes testing for both correctness and timeout conditions. This test case simply passes through expected values.

### MAX
This function takes in an integer array of any size and returns an integer. This integer will hold the value of the maximum value from the array.
Testing:
Testing of this function includes testing for both correctness and timeout conditions. This test case simply passes through expected values.

### shuffle
This function takes in an integer array of an size and returns the array. The array will be returned shuffled using a Fisher–Yates shuffle.
Testing:
Testing of this function includes testing for both correctness and timeout conditions. This test case involves passing through assigned variables and increasing amount of random variables for timeout conditions.

### NewRandom
This function takes in an integer and returns a long value. The entered integer is used as a range to generate the random value. When the function is called a key is set for the object so every consecutive call of the random function will have the same key.
Testing:
Testing of this function includes testing for both correctness and timeout conditions. As well as testing to make sure random can generate all values within the range.

### RockPaperScissors
This function will take in a string value and return a boolean value. The string value passed is the users selection and must equal "rock", "paper", or "scissors". The boolean value passed back is whether the user won or lose(Tie will return false).
Testing:
Testing of this function includes testing for both correctness and timeout conditions. This test case simply passes through expected values.

### EuclideanDistance
This function takes in 4 double values representing x1,y1,x2,y2 and returns a double value. The returned value will be the distance between the coordinates passed through the function.
Testing:
Testing of this function includes testing for both correctness and timeout conditions. This test case simply passes through expected values.

### BubbleSortASC and BubbleSortDES
These two functions take in an integer array and returns the array sorted. These functions use bubble sort to return the sorted array. BubbleSortASC returns the array sorted in ascending order and BubbleSortDES return the array sorted in descending order.
Testing:
Testing of this function includes testing for both correctness and timeout conditions. This test case involves passing through assigned variables and increasing amount of random variables for timeout conditions.

### InsertionSortASC and InsertionSortDES
These two functions take in an integer array and returns the array sorted. These functions use insertion sort to return the sorted array. InsertionSortASC returns the array sorted in ascending order and InsertionSortDES returns the array sorted in descending order.
Testing:
Testing of this function includes testing for both correctness and timeout conditions. This test case involves passing through assigned variables and increasing amount of random variables for timeout conditions.




## Alex
### isPrime
This function takes an integer as an input into the function. It will start a for loop from 2 until half the value of the number and check if there are any numbers divisible therefore checking if it is prime.
Testing:
Testing of this function includes testing for correctness and timeout conditions for both large and small numbers. This involves inputting small numbers while increasing the number to test the timeout conditions. 

### hypotenuse
This function takes two lengths of a triangle and calculates the hypotenuse. 
Testing:
Testing of this function includes testing for correctness and timeout conditions for both large and small numbers. This involves inputting small numbers while increasing the number to test the timeout conditions. 

### triangeLeg
This function takes one leg and the hypotenuse of the triangle and calculates the missing leg. 
Testing:
Testing of this function includes testing for correctness and timeout conditions for both large and small numbers. This involves inputting small numbers while increasing the number to test the timeout conditions. 




## Iliya
### quick_sort
This function accepts an array a low index and a high index both integer, it chooses a piviot within the index range and finds the correct spot for that number in a sorted array
all larger numbers go to a higher index and the lower ones receive lower  indexes. It does this recursively until the array is sorted.
Testing:
The code will have to sort a premade list that exploits certain situations like multiple instances of the same number. It will then compare the array it sorted to another premade
array that is the exact same as the original however it is manually sorted. If all the numbers are the same the test is passed.

### select_sort
This  function accepts an unsorted array. It then loops through the array to visit every index while having a nested forloop finding the smallest number each time swaping the smallest number and the number at the current index. The array will eventually be sorted.
Testing:
The test is the same as quicksort with a 1 sorted and 1 unsorted premade list, the function is called to sort the unsorted list. Finally the 2 lists are compared.

### role_dice
This function requires no input. It simply generates a number between and including 1-6 and returns the generated value.
Testing:
The function is asked to generate a number. If it is between 1 and 6 it will pass the test.

### read_file
This function acceptes a string. This input should be the location and name of a file. It will then throw an exception if it cannot find the file or if it does it will read the contents of the file.
Testing:
The test is if the file can be read. It will ask the user for a file to read. If it can find and read the file it will pass the test. If an exception is thrown aor the code crashes the test is failed.

### backwards_list_2
This function will take an array and reverse their order. It is different from reverseArray because rather then reading the array backwards into a new array, it keeps the same array and swaps mirrored indexes across the middle. This upgrade effectvily halves the time and space required to execute the code.
Testing:
Similar to the previous 2 sorts. It has an original array, and the same array backwards. The function is called to reverse one of them. Then we compare the 2 arrays. If they are the same the test passes.




## Scott
### MergeSort
Testing:

### BinarySearch
Testing:

### RollMultiDie
Testing:




# Deliverables:

- (2 Marks) A one-page proposal on project description and plan needs to be submitted in
Blackboard by February 10.
- (3 Marks) A progress report with the snapshots of preliminary experiments need to be
submitted by March 9. At this stage the project can be changed upon providing explanations
with results why the initial choice on project was not right. The reasons need to be properly
justified in the report.
- (5 Marks) Group presentations will take place on April 5 and April 8 lecture time. The schedule
will be posted closer to these dates. Presentation should contain discussion on:
1. Test cases or methods
2. Test data
3. Statistics on bugs (if any) or improvements (if any) because of using test cases or test data
- (10 Marks) Submission of a zip file in Canvas must contain the following:
1. Presentation slides
2. Source code, test cases, and test data with proper documentation
3. A final project report explaining the details of the project, design choices, implementation
challenges, and lessons learned
The deadline for submitting the report in blackboard is April 9, 2021 11.59pm
