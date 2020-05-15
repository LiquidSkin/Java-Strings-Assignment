import java.util.*;
import java.util.Scanner;

public class BalancedParantheses {
    public static boolean checkBalanced(String str, int n)
    {
        Map<Character,Character> map = new HashMap<Character,Character>();
        map.put(']','[');
        map.put('}', '{');
        map.put(')','(');

        Stack<Character> st = new Stack<Character>();
        if(n % 2 == 1)
            return false;
        for(int i=0; i<n; i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
              if(st.isEmpty())
                  return false;
              else if(!st.isEmpty())
              {
                  if(st.peek() != map.get(str.charAt(i)))
                      return false;
                  else
                      st.pop();

              }
            }
            else
            {
                st.push(str.charAt(i));
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string as parantheses");
        String str = sc.next();
        int len = str.length();
        boolean var = checkBalanced(str,len);
        if(var)
        {
            System.out.println("The parantheses are balanced");
        }
        else
        {
            System.out.println("The parantheses are not balanced");
        }
    }




}
