import UniNoten.UniNoten;
import GroßeZahlen.GrosseZahlen;
import NurArray.NurArray;
import Markus.Markus;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int sizedoesntmatter=5;
        //NurArray myArray = new NurArray(sizedoesntmatter);
        //int caca=myArray.SumMin();
        //System.out.println(caca);

        int[] test={29, 37, 38, 41, 84, 67};
        UniNoten uni=new UniNoten();
        int[] test1=uni.abgerundete_noten(test);
        for(int i=0; i<test1.length; i++)
           System.out.print(test1[i]+" ");
        System.out.println();
        int[] test2=uni.nicht_ausreichend(test1);
        for(int i=0; i<test2.length; i++)
            System.out.print(test2[i]+" ");
        System.out.println();
        double test3=uni.duschschnittliche_note(test);
        System.out.println(test3);
        int test4=uni.maximale_abgerundete_note(test);
        System.out.println(test4);
        /*
        NurArray narray=new NurArray(5);
        int nr=narray.SumMax();
        System.out.println("sum max="+nr); */

        Markus fuckmarcus=new Markus();
        int ceva=fuckmarcus.combo(60);
        System.out.println(ceva);


        /*int[] test5=gz.differenz(zahl2, zahl1);
        //for(int i=0; i<test5.length; i++)
        //  System.out.print(test5[i]);
        int[] test6=gz.multiplikation(zahl1,3);

        int[] test7=gz.division(zahl2, 3);
        for(int i=0; i<test7.length; i++)
            System.out.print(test7[i]); */

    }
}
