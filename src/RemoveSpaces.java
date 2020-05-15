import java.util.*;
import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string which you want to enter");
        String str = sc.nextLine();
        str = str.replaceAll("\\s","");
        System.out.println("The string after removing white spaces are");
        System.out.println(str);
    }
}
