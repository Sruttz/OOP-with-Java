//Modify the program to produce two sums: sum of odd numbers and sum of even numbers from 1 to 100 also computer their absolute difference.

public class SumOddEven{
    public static void main (String args [])
    {
    int sumO = 0;
    int sumE = 0;
    int absDiff ;
    for(int i =1 ; i<=100 ; i++)
    {
    if(i%2 ==0)
    {
    sumE += i;
    }
    else
    {
    sumO += i;
    }
    }
    System.out.println("The sum of Even numbers " + sumE);
    System.out.println("The sum of Odd numbers " + sumO);
    if(sumE > sumO)
    {
    absDiff = sumE-sumO;
    System.out.println("The absolute difference : " + absDiff );
    }
    else
    {
    absDiff = sumO-sumE;
    System.out.println("The absolute difference : " + absDiff );
    }
    }
    }