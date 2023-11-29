package practiceList;

public class PatternStar {
    public static void main(String[] args) {

        int numRows = 5; // You can change this to adjust the size of the triangle

        for (int i = 1; i <= numRows; i++) {
            // Print spaces before the asterisks
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }

    }
}
