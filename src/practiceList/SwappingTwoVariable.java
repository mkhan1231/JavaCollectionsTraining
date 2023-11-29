package practiceList;

public class SwappingTwoVariable {
    public static void main(String[] args) {
        int a=30;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

        int x=1;
        int y=2;
        int z=x;
        x=y;
        y=z;
        System.out.println(x);
        System.out.println(y);


    }
}
