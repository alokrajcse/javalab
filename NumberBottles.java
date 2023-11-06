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
