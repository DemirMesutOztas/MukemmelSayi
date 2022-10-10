import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz");
        int value = input.nextInt();
        int total = 0;


        for(int i=1; i<value; i++)
        {
            if(value%i==0)
            {
                total+=i;
            }
        }

       if(value==total)
       {
           System.out.println( value+" Mükemmel sayıdır");
       }
       else {
           System.out.println( value+" Mükemmel sayı değildir.");
       }


    }
}