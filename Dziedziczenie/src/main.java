public class main
{
    //Zadanie 1
    public static void main(String[] args)
    {
        Kwadrat kwadrat = new Kwadrat(4);
        System.out.println(kwadrat.obliczPole());

        Prostokat prostokat = new Prostokat(4,2);
        System.out.println(prostokat.poleProstokata());

        //Zadanie 2
        System.out.println();
        Pies pies = new Pies(4,4,"Azor","czarna",12 );
        pies.dajGłos();

        //Zadanie 3
        System.out.println();
        Spawacz spawacz = new Spawacz("niebezpieczna", 1525.25, "cały");
        spawacz.wykonujePrace();

        //Zadanie 4
        //a. Odp: Metoda 1 i 4.
        //b. Odp: Niewidzialna jest metoda numer trzy.
    }
}
