public class Swaping_Of_Numbers {
    public static void main(String[]args){
        //method 1
        int a=3;
        int b=5;
        int c=a*b;
        a=c/3;
        b=c/5;
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);
        // method 2
        int k=2;
        int l=4;
        k=k^l;
        l=k^l;
        k=k^l;
        System.out.println("value of a:"+k);
        System.out.println("value of b:"+l);
        //method 3
        a=4;
        b=5;
        int temp =0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);
        // method 4
        a=5;
        b=6;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
}
