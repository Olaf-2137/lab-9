package sample;

public class Konto {
//dane konta
    private String KNazwa;
    private double Balans;
    public Konto(String Nazwa, double BalansKonta) {
        this.KNazwa = Nazwa;
        this.Balans = BalansKonta;
    }

  //wypłata
    public int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return amount;
        }
        else{
            throw new wyplatacheck(amount);}}
//wykaz balansu
    public double getBalance() {
        return Balans;
    }
}
