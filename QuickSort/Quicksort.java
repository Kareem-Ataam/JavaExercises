class Quicksort {


    public static int partition(int []array, int low, int high) {

        // we take the rightmost element as a pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greatr element pointed by i
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swap the pivot with the greater element specified at i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Where the partition was done
        return (i + 1);
    }

    public static void quickSort(int []array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);

            // recursive for the left of pivot
            quickSort(array, low, pivot - 1);

            // recursive for the right of pivot
            quickSort(array, pivot + 1, high);
        }
    }
}