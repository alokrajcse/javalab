/* LAB QUESTION 4
Write a java program that will take input as two +ve integers M and N where M<N.
a). The program will display the numbers between M and N, which are divisible by 3
and 5.
b). Count the numbers which are divisible by 3 and 5(between M and N), then add those
numbers and display.
*/



import java.util.Scanner;

public class ques4 {
    
public static void main(String args[])

{
    int count=0;
    int sum=0;

    int M,N;

Scanner sc=new Scanner(System.in);

System.out.println("Enter value of M");
M=sc.nextInt();
System.out.println("Enter the value of N");
N=sc.nextInt();


System.out.println("The numbers which are divisible by 3 and 5 are");

for(int i=M;i<N;i++)

{


    if(i%3==0&&i%5==0)
    {
        count++;

        System.out.println(i+" ");
        sum+=i;
    }

}

System.out.println("The sum of numbers which are divisible by 3 and 5 between M and N are");
System.out.println(sum);

}



{





}

}
