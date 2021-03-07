public class Samochod implements Pojazd
{
    public boolean stop;

    @Override
    public void stop()
    {
        System.out.println("Zatzrymuje się");
    }

    public void skrecwLewo()
    {
        System.out.println("Skręcam w lewo");
    }
}
