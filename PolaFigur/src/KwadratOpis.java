public class KwadratOpis
{
    private int bokA;

    public KwadratOpis()
    {
    }

    public KwadratOpis(int bokA)
    {
        this.bokA = bokA;
    }

    public int obliczPole()
    {
        return bokA * bokA;
    }

    public int getBokA()
    {
        return bokA;
    }
    public void setBokA(int bokA)
    {
        this.bokA = bokA;
    }
}
