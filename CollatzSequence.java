import java.util.*;
public class CollatzSequence {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        while(n!=1)
        {
            System.out.println(n);
            if((n%2)==0)
                n=n/2;
            else
                n=((3*n)+1);
        }
        System.out.println(n);
    }
}
