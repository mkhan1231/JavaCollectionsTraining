package practiceList;

import java.util.Scanner;

public class countingVowelConsonant {


    public static void main(String[] args) {

        toCountItemizedCharacters();
    }

    public static void toCountItemizedCharacters() {
        int vowelCount = 0;
        int consCount = 0;
        int digitCounts = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String userInput = sc.nextLine().toLowerCase();
        System.out.println("Formatted String is :" + userInput);

        int countSpecialChar = userInput.length() - vowelCount - consCount - digitCounts;
        int totalCharacters = vowelCount + consCount + digitCounts + countSpecialChar;

        for (int i = 0; i < userInput.length(); i++) {
            boolean b = userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u';
            if (b == true) {
                vowelCount++;
            } else if (userInput.charAt(i) >= 'a' && userInput.charAt(i) <= 'z' && !(b == true)) {

                consCount++;
            } else if (Character.isDigit(userInput.charAt(i))) {
                digitCounts++;
            } else {
                //System.out.println("lets calculate them itemized :");
            }
        }
        System.out.println("Total vowel in the String is :" + vowelCount);
        System.out.println("Total Consonant in the String is :" + consCount);
        System.out.println("Total Digits in the String is :" + digitCounts);
        System.out.println("Total Special Character in the String is :" + countSpecialChar);

        System.out.println("Total Characters in the String from the user Input is :" + userInput.length());
        System.out.println("Total Characters in the String from adding all diff categories are :" + totalCharacters);

        if (userInput.length() == totalCharacters) {
            System.out.println("The Output is expected!! Yahoo!!! ");
        } else {
            System.out.println("There is a bug!!");
        }

    }


}
