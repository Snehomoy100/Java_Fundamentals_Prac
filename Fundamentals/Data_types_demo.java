public class Data_types_demo {
    public static void main(String[] args) {
        int a = 10;
        short sh = 5;
        byte b = 1;
        long l = 7876;



        sh = b;
        a = b;
        a = sh;
        l = a;

        b = (byte) 128;

        a = 1000000;
        l = 10000000000L;

        float f = 5.6f;

        double db = 8.98;

        a = (int) f;
        f = a;


        System.out.println(b);
        System.out.println(l);

        System.out.println(a);
        System.out.println(f);

        boolean bool = true;

        // we can't store boolean vlaues like 0 or 1 like we do it C/C++

        if(bool){
            System.out.println("True");
        } else{
            System.out.println("False");
        }

        bool = false;

        if(bool){
            System.out.println("Again false");
        } else{
            System.out.println("Again true");
        }

        char c = 'a';
        System.out.println(c);

        c = 99;
        System.out.println(c);

        c = 64000;
        System.out.println(c);

        c = (char)68000;
        System.out.println(c);

        c = (char)(c + 2);
        System.out.println(c);

        System.out.println(10 + 20 + "Hello" + 10 + 20);
        System.out.println(2 + " " + 5);
        System.out.println(2 + ' ' + 5);
        System.out.println("Hello" + '\t' + "World");
        System.out.println("Hello" + "\t" + "World");
    }
}
