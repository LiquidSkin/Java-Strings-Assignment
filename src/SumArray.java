import java.util.*;
import java.util.Scanner;

public class SumArray {
    public static int sumOfElements(int[] arr, int n)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int j=0; j<n; j++)
        {
            sum = sum + arr[j];
            if(arr[j] < min)
            {
                min = arr[j];
            }
            if(arr[j] > max)
            {
                max = arr[j];
            }
        }
        sum -= (max + min);
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array one by one");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();

        }
        int sum = sumOfElements(arr,n);
        System.out.println("The sum of elements without max and min is" + " " + sum);
    }
}
