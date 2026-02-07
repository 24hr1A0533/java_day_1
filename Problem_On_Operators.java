public class Problem_On_Operators {
    public static void main(String[]args){
        int a=10;
        int b=12;
        System.out.println("sum:"+(a+b));

        int c=88;
        if(c>0) System.out.println("positive");
        else System.out.println("negative");

        if(a>0 && a%2==0) System.out.println(a+": is even and positve");
        else System.out.println(a+": is may be not even or not");



        System.out.println("before:"+a);
        a+=5;
        System.out.println("after assinment operaator:"+a);

        System.out.println("before unary:"+a);
        a++;
        System.out.println("after unary operator:"+a);
    }
}
