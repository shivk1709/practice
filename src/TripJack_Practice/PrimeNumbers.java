package TripJack_Practice;

import java.util.Scanner;

public class PrimeNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 1 to " + n + ":");

        for (int i = 2; i <= n; i++)
        {   // start from 2 because 1 is not prime
            if (isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num)
    {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++)
        { // check up to sqrt(num)
            if (num % i == 0) return false;
        }

        return true;
    }
}
