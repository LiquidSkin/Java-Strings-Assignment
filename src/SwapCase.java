import java.util.*;
import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string which you want to enter");
        String str = sc.nextLine();
        int len = str.length();
        char[] charArray = str.toCharArray();
        int n = charArray.length;
        for(int j=0; j<n; j++)
        {
            char c = charArray[j];
            if(Character.isUpperCase(c))
            {
                charArray[j] = Character.toLowerCase(c);
            }
            if(Character.isLowerCase(c))
            {
                charArray[j] = Character.toUpperCase(c);
            }
        }

        System.out.println("The converted String is" + " " + new String(charArray));

    }
}
