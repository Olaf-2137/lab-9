package sample;

public class Osoba {
    String imie, naz;
    int rok;
  //imie - imie , naz - nazwisko , rok - rok
  // errory dannych 
    private void checkPersonData(String imie, String naz, int rok){
        if (imie.isEmpty() == true){
            throw new IllegalArgumentException("Pole imie nie moze byc puste!");
        }
        else if (naz.isEmpty() == true){
            throw new IllegalArgumentException("Pole nazwisko nie moze byc puste!");
        }
        else if ((rok < 1900) || (rok > 2021)){
            throw new IllegalArgumentException("Podano niewłaściwy rok urodzenia!");
        }
    }
  // stringi 
    public Person(String imie, String naz, int rok) {
        checkPersonData(imie, naz, rok);
        this.imie = imie;
        this.imie = imie;
        this.rok = rok;
    }
    // wyniki
    @Override
    public String toString(){
        return String.format("Imię: %s\nNazwisko: %s\nRok urodzenia: %d",imie,naz,rok);
    }
}
