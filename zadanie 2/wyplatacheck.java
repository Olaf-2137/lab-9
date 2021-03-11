package sample;
public class wyplatacheck extends RuntimeException{
    public wyplatacheck(int funds){
        super(String.format("Nie możesz wypłacić środkow %d, nie posiadasz tyle na koncie!", funds));
    }
}
