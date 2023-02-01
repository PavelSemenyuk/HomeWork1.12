public class Book {
    private String name;
    int date;
    Avthor avthor;



    public Book(String name, int date, Avthor avthor){
        this.name= name;
        this.date=date;
        this.avthor=avthor;
    }
    public String getName(){
        return this.name;

    }
    public int getDate(){

        return this.date;
    }

    public Avthor getAvthor(){
        return this.avthor;
    }

    public void setDate(int date){
        this.date=date;
    }
}
