package MyProje;


import java.io.*;



public class Media implements Serializable{
    protected String name;
    protected int year;
    protected int amountofselling;
    //static int CntFilm = 0;
    //static int CntMusic = 0;

    public static void displayMenu() {
        System.out.println("enter 1 for film");
        System.out.println("enter 2 for music");
        System.out.println("enter 3 for show film");
        System.out.println("enter 4 for show music");
        System.out.println("enter 5 for quit the program");

    }


    public Media() {
        this.name = name;
        this.year = year;
        this.amountofselling = amountofselling;
    }

    public Media(String name, int year, int amountofselling) {
        name = "no name";
        year = 0;
        amountofselling = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setAmountofselling(int amountofselling) {
        this.amountofselling = amountofselling;
    }

    public int getAmountofselling() {
        return amountofselling;
    }

    public String getMedia() {
        return "name is " + this.name + "year is " + this.year + "amount of selling " + this.amountofselling;
    }


        }




