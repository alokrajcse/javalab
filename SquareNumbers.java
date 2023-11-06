/* LAB QUESTION 9
If one looks at the square numbers and the differences between each adjacent pair of square
numbers a pattern emerges.
squares: 0 1 4 9 16 25 36 49…
differences: 1 3 5 7 9 11 13…
Write a program to print out the square numbers, ten in a line, without using multiplication operator */


public class SquareNumbers {

    public static void main(String[] args) {
        printSquareNumbers();
    }

    public static void printSquareNumbers() {
        int count = 0;
        int currentNumber = 0;
        int difference = 1;

        while (count < 10) {  
            System.out.print(currentNumber + " ");

            currentNumber += difference;
            difference += 2;

            count++;

          
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
