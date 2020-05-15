import java.util.*;
import java.util.Scanner;
public class reverseWords {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you wish to reverse");
        String s[] = "This is a program".split("");
        String ans = "";
        for(int j = s.length-1; j>=0; j--)
        {
            ans += s[j] + " ";
        }
        System.out.println("The reversed String is" + " " + ans);


    }
}
