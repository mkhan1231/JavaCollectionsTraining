package practiceList;



public class ReplaceString {
    public static void main(String[] args) {

        String str= "aBchl 0!23$%9Kl i";
        System.out.println(str);

        //removing spaces from the String

        String spaceRemove= str.replace(" ","");
        System.out.println(spaceRemove);

        //removing lower case letters

        String removeLowerCase= str.replaceAll("([a-z])","");
        System.out.println(removeLowerCase);

        //Taking a substring from a string

        String s="oakland";
        String s1= s.substring(4);//from 4th index to the end
        System.out.println(s1);
        String s2= s.substring(1,3);
        System.out.println(s2);

        //remove the last character of the string
        String s3=s.substring(0,s.length()-1);
        System.out.println(s3);

        //last 4 index of the string
        String s4=s.substring(s.length()-4);
        System.out.println(s4);

        //Removing leading and ending space
        String d=" abc ";
        String d1= d.trim();
        System.out.println(d1);
        String d2=d.strip();
        System.out.println(d2);


    }
}
