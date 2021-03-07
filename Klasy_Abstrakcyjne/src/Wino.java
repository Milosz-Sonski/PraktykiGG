public class Wino implements podajRocznikWina
{
    public int rocznikWina;
    public String markaWina;

    @Override
    public void rocznikWina()
    {
        System.out.println("2002");
    }

    @Override
    public void markaWina()
    {
        System.out.println("Martini");
    }
}