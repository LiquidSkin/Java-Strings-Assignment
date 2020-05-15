import java.util.Scanner;
public class ShortestLength {
    public static int shortestWord(String[] arr, int n)
    {
      int min = Integer.MAX_VALUE;
      for(int j=0; j<n; j++)
      {
          String res = arr[j];
          int len = res.length();
          if(len < min)
          {
              min = len;
          }
      }
      return min;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings you wish to enter");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the strings one by one");
        for(int j=0; j<n; j++)
        {
            String str = sc.next();
            arr[j] = str;
        }
        int len = shortestWord(arr,n);
        System.out.println("The length of the shortest word is" + " " + len);
    }
}
