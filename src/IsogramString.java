import java.util.*;
import java.util.Scanner;

public class IsogramString {
    public static boolean checkIsogram(String str, int n)
    {
        str = str.toLowerCase();
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<n; i++)
        {
            if(set.contains(str.charAt(i)))
                return false;
            set.add(str.charAt(i));
        }
        return true;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string which you want to enter");
        String str = sc.nextLine();
        int len = str.length();
        boolean var = checkIsogram(str,len);
        if(var)
        {
            System.out.println("The String is an isogram");
        }
        else
        {
            System.out.println("The String is not an isogram");
        }
    }

}
