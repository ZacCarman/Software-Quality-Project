class MergeSort {

    int[] merge(int arr[], int left, int mid, int right) {

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

    int[] sort(int[] arr, int left, int right) {
        // arr is the input array, left is left most index, and right is right most. mid is middle

        if (right > left) {
            // we want the middle point
            int mid = left + (right - 1) / 2;

            // recursively sort the first and second sub-arrays
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // merge the 2 sub-arrays
            merge(arr, left, mid, right);
        }
        return arr;
    }
}
