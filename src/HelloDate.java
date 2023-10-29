import java.util.Date;
import java.util.Scanner;

public class HelloDate {



    public static void main(String[] args){
        NazwaTypu a = new NazwaTypu();
        System.out.println("Hello world!");
        a.hello();

        TylkoDane dane = new TylkoDane();
        dane.i=47;
        dane.d=1.1;
        dane.b=false;

        System.out.println(dane.i);
        System.out.println(dane.d);
        System.out.println(dane.b);

        int g = 0;
        String s = new String("hej");
        g = dane.wielkosc(s);
        System.out.println(g);

        NazwaTypu st1 = new NazwaTypu();
        NazwaTypu st2 = new NazwaTypu();

        NazwaTypu.incr();
        System.out.println(st1.i);
        System.out.println(st2.i);

        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();
        System.out.println(liczba);
    }

    /*public static void main(String[] args){
        int i;
        char a;
        System.out.println(i);
        System.out.println(a);
    }*/

    /*public static void main(String[] args){
        System.out.println("Witaj, dzisiaj jest: ");
        System.out.println(new Date());
    }*/
}