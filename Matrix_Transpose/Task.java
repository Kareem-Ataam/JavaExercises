//Program to find the transpose of a matrix
import java.util.Scanner;
public class Task {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int [][]arr = new int [3][3];
        int [][]trans =new int [3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print("Enter the element in the row number " + (i+1) + " and column number "+ (j+1) + ":");
                arr[i][j]= input.nextInt();
            }
        }
        System.out.println("The original matrix is");
        print2dArray(arr);
        //Computing the transpose
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                trans[i][j]=arr[j][i];
            }
        }
        System.out.println("The transposed matrix is");
        print2dArray(trans);
    }
    public static void print2dArray(int [][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}