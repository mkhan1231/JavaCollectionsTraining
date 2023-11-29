package practiceList;

public class CheckVowelPresent {
    public static void main(String[] args) {

        System.out.println(vowelCheck("123@#$%"));

    }

    public static boolean vowelCheck (String str1){
        String str= str1.toLowerCase();
        System.out.println(str);
        for (int i=0; i<=str.length()-1; i++){
            if (str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='0'||str.charAt(i)=='u'){
                return true;

            }
        }

        return false;
    }
}
