package practiceList;

import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {
        ReversingString cm=new ReversingString();
        cm.reverseString();


    }

    public void reverseString(){

        Scanner scannerClass=new Scanner(System.in);
        System.out.println("Enter a String :");
        String userInput= scannerClass.nextLine().toLowerCase();

        String result="";

        for (int i= userInput.length()-1;i>=0;i--){
            result=result+userInput.charAt(i);
        }
        System.out.println(result);

        if(userInput.equalsIgnoreCase(result)){
            System.out.println(userInput + " is a Palindrome");
        }else{
            System.out.println("Try another word to get a Palindrome");
        }
    }
}
