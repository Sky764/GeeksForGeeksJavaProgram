import java.util.*;
public class distinct_char 
{
     public static void main(String args[])
 {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String s = sc.next();
    System.out.println("Enter the kth distinct character");
    int k = sc.nextInt();
    int len = s.length();String w = "";String distinct = "";int i;
    if (k > len)
    System.out.println("Invalid");
    else
    {
        for (i = 0;i < k;i++)
        {   if(k > s.length())
            {
                System.out.println("Invalid");
                break;
            }
            char ch = s.charAt(i);
            w = s.substring(i+1);
            s = s.substring(0,i + 1) + w.replace(ch+"","");
         distinct = ch + "";
        }
        if (i == k)
        System.out.println("The " +k + "th distinct character is: " +distinct);
    }
    
}

}