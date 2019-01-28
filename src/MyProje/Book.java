package MyProje;

public abstract class Book extends Media {
    private String author;



    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public int getAmountofselling() {
        return super.getAmountofselling();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public String getMedia() {
        return super.getMedia();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void printInfoB(){
        System.out.println("name: " + getName());
        System.out.println("year: "+ getYear());
        System.out.println("amount of selling: " + getAmountofselling());
        System.out.println("author: " +getAuthor());

    }
}
