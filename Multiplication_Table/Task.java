import java.util.Scanner;
public class Task
{
    public static void multTable(int number){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++)
            {
                System.out.print((i*j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        multTable(num);
    }
}
