public class ProstyKalkulator
{
    private double a;
    private double b;


    public ProstyKalkulator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    void dodawanie() {
        System.out.println(a+b);
    }
    void mnozenie() {
        System.out.println(a*b);
    }
    void odejmowanie() {
        System.out.println(a-b);
    }
    void dzielenie() {
        System.out.println(a/b);
    }
}