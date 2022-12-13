public class Task {
    public static void main(String args[]) {

        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println("Unsorted Array");
        for(int i=0;i<data.length;i++)
            System.out.print(data[i] + " ");

        int size = data.length;

        // call quicksort() on array data
        Quicksort.quickSort(data, 0, size - 1);

        System.out.println("\nSorted Array: ");
        for(int i=0;i<data.length;i++)
            System.out.print(data[i] + " ");
    }
}