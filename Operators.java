public class Operators {
    public static void main(String[] args) {
        System.out.println("ASSINMENT OPERATORS");
        int a =10;
        int b =20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


        System.out.println("RELATIONAL OPERATORS");
        float c=5.8f;
        float f2=8.999f;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);


        System.out.println("UNARY OPERATOR");
        long l=12;
        System.out.println(l++);
        System.out.println(l--);
        System.out.println(++l);
        System.out.println(--l);
        l=13;
        System.out.println(+l);
        l=12;
        System.out.println(-l);

        System.out.println("CONDITIONAL OPERATORS");
        byte age=25;
        if (age>18 && age>19) System.out.println("true");
        else System.out.println("false");
        if (age>18 || age>19) System.out.println("true");
        else System.out.println("false");
        if (!(age>18)) System.out.println("true");
        else System.out.println("false");

    }
}
