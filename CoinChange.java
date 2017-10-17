import java.util.Scanner;

public class CoinChange {
    /*****   This problem calculates the minimum number of coins whose total amount is equal to the amount n, for which change needs to be calculated. The only possible denominations of the coins are 1, 5 and 10 cents   *****/
    private static int getChange(int n) {               /*****   returns the minimum number of coins that is the equivalent to the amount for which change needs to be calculated (n)   *****/ 
        int count = 0;                                  /*****   count is the variable to be returned   *****/
        while(n != 0)                                   /*****   loops till the amount is not zero   *****/
        {
        	if(n >= 10)                                 /*****   checks for 10 cents, which is the highest denomination   *****/
        	{
                n -= 10;                                /*****   decrement n by 10 cents   *****/    
        		count++;                                /*****   increment count by 1   *****/
        	}
        	if(n >= 5 && n < 10)                        /*****   checks for 5 cents   *****/
        	{
        		n -= 5;                                 /*****   decrement n by 5 cents   *****/
                count++;                                /*****   increment count by 1   *****/    
        	}
        	if(n >= 1 && n<5)                           /*****   checks for 1 cent   *****/
        	{
        		n -= 1;                                 /*****   decrement n by 1 cent   *****/
        		count++;                                /*****   increment count by 1   *****/
        	}
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();                      /*****   input number for which change needs to be obtained   *****/
        System.out.println(getChange(n));

    }
}

