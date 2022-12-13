//Program to find the largest number in an array
import java.util.Scanner;
public class Task {
    public static void main(String [] args){
        int [] arr = new int [10];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter the value number" + (i+1) + ":");
            arr[i]=input.nextInt();
        }
        int largest= arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
                largest = arr[i];
        }
        System.out.println("The largest number is:" + largest);
    }

}