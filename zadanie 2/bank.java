package sample;
import java.util.Scanner;
public class bank {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Czy pragniesz założyć nowe konto ?");
        boolean doCreateAccount = getYesNoAnswer();
        if(!doCreateAccount) {
            endProgram();
        }
        Konto account = createNewAccount();
        System.out.println("Czy chcesz wyplacic pieniadze z konta?");
        boolean shouldWithdrawMoney = getYesNoAnswer();
        if(!shouldWithdrawMoney) {
            endProgram();
        }
        while (true) {
            System.out.println("Ile srodkow chcesz wyplacic ?");

            try {
                int amount = getAmount();
                try {
                    account.withdraw(amount);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("ERROR! Liczba nie istnieje!");
                }
            }catch (NumberFormatException e){
                System.out.println("ERROR! Liczba nie istnieje!");
            }
        }
        System.out.printf("Dzienkujemy za korzystanie z naszego banku twoj stan konta wynosi: %.2f $", account.getBalance());
    }
    private static Konto createNewAccount() {
        String name = "";
        while (name.length() < 1){
            System.out.println("Jak masz na imie ?");
            name = scanner.nextLine();}
        while (true) {
            System.out.println("Ile srodkow chcesz dodac do swojego konta?");
            try{
                int initialAmount = getAmount();
                return new Konto(name, initialAmount);
            }catch (NumberFormatException e){
                System.out.println("Nie jest to liczba!");
            }
        }
    }
    private static void endProgram() {
        System.out.println("Dziekujemy za korzystanie z serwisu");
        System.exit(0);
    }
    private static int getAmount() {
        Integer x =  Integer.parseInt(scanner.nextLine());
        if (x instanceof Integer == false){
            throw new NumberFormatException(); }
        return x;  }
    private static boolean getYesNoAnswer() {
        String userAnswer = scanner.nextLine();
        if(userAnswer.toLowerCase().contains("y")) {
            return true;
        }else if(userAnswer.toLowerCase().contains("n")) {
            return false;}
        else {
            System.out.println("Napisz tak lub nie");
            return getYesNoAnswer();
        }
    }
}
