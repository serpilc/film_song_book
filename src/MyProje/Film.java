package MyProje;

public class Film extends Media{


    private double imdb;
    private String type;


    public  Film(){

        super();
        imdb = 0.0;
        type= "no type";

    }

    public Film(String name, double imdb, String type, int year, int amountofselling) {
        super(name, year, amountofselling);
        this.imdb=imdb;
        this.type=type;
    }


    public void setImdb(double imdb){
        this.imdb=imdb;
    }
    public double getImdb(){
        return imdb;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }

    /*public static void displayFilmsArrayInfo(Film[] films) {
        for (int j = 0; j < films.length; j++) {
            System.out.println("film information");
            System.out.println("*********************");
            System.out.println("Name                : " + films[j].getName());
            System.out.println("Year                : " + films[j].getYear());
            System.out.println("Amount of selling   : " + films[j].getAmountofselling());
            System.out.println("Imdb                : " + films[j].getImdb());
            System.out.println("Type                : " + films[j].getType());
            System.out.println();
        }
    }*/
    public void printInfoF(){
        System.out.println("name: " + getName());
        System.out.println("year: "+ getYear());
        System.out.println("amount of selling: " + getAmountofselling());
        System.out.println("ımdb: " + getImdb());
        System.out.println("type: " + getType());
        System.out.println("");

    }


    /*public void getFilmInfo(){
        System.out.println( "imdb is" +this.imdb+ "type is" + this.type + super.getMedia());
    }
*/


}