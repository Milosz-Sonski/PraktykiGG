import java.util.stream.Collectors;

import static java.util.stream.DoubleStream.iterate;

public class Pętle
{
    //Zadanie 1
    public static void main(String[] args) {

        char firstLetterOfAnAlphabet = 'A';

        for (int i = 0; i < 26; i++) {
            if (i % 2 == 0)
                System.out.print(firstLetterOfAnAlphabet + "\t");
            firstLetterOfAnAlphabet++;
            System.out.print("");
        }

        //Zadanie 2
        System.out.println("");
        System.out.println("");
        int a = 0;
        int b = 1;
        int x = 8;

        for(int i = 1; i < x; ++i) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
