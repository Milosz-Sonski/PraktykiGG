import java.util.Scanner;

public class Petle2
{

    //Zadanie 3
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean programIsRunning = true;

        while(programIsRunning)
        {
            System.out.print("O nie! Zostałeś uwięziony w lochach podaj numer od 1-5 aby otworzyć odpowiednie drzwi: ");
            String userInput = sc.next();

            switch (userInput)
            {
                case "1": {
                    System.out.println("To nie są odpowiednie drzwi :(");
                    break;
                }
                case "2": {
                    System.out.println("To nie są odpowiednie drzwi :(");
                    break;
                }
                case "3": {
                    programIsRunning = false;
                    break;
                }
                case "4": {
                    System.out.println("To nie są odpowiednie drzwi :(");
                    break;
                }
                case "5": {
                    System.out.println("To nie są odpowiednie drzwi :(");
                    break;
                }
                default: {
                    System.out.println("Co ty tam napisałeś?!");
                }
            }
        }

        System.out.println("Brawo udało ci się uciec! ");
        System.out.println();

        //Zadanie 4
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i*j%2==0 && i*j%3==0){
                    System.out.print(i*j+"\t");}
                else {
                    System.out.print("X"+"\t");
                }
            }
            System.out.println();
        }
        System.out.println();

        //Zadanie 5
        System.out.println();
        int wysokoscTrojkata = 5;
        for (int i = 0; i < wysokoscTrojkata; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

}