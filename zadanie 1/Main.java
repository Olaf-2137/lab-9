package sample;
import java.util.Scanner;

public class main {
    public static void Main(String[] args) {
    
      //scanery zmiennych imie nazwisko rok
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj swoje imię");
            String name = scan.nextLine();
            System.out.println("Podaj swoje nazwisko");
            String last_name = scan.nextLine();
            System.out.println("Podaj rok");
            int birth_year = scan.nextInt();
      //konto person
            try {
                Person p = new Person(name, last_name, birth_year);
                System.out.println(p);
                break;
      //brak / zły argument
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                
            }
        }
    }
}
