/* LAB QUESTION 8
Write a method that takes a number between 0 and 9 as an argument and prints on the
screen “Number green bottles standing on the wall” (where Number is replaced by the word
version of the number). If the numeric parameter is 1 then your method should print bottle
rather than bottles.   */
public class NumberBottles {

    public static void main(String[] args) {
        printBottlesOnTheWall(3);
    }

    public static void printBottlesOnTheWall(int number) {
        if (number < 0 || number > 9) {
            System.out.println("Number out of range (0-9).");
            return;
        }

        String numberWord = convertNumberToWord(number);
        String plural = (number == 1) ? "" : "s";

        System.out.println(numberWord + " green bottle" + plural + " standing on the wall");
    }

    public static String convertNumberToWord(int number) {
        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Invalid";
        }
    }
}
