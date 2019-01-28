package MyProje;

/**
 * Created by sony on 07.03.2017.
 */
public class Music extends Media {

    private int view;

    public Music(){
        super();

        view=0;

    }
    public Music(String name, int view, int year, int amountofselling){
        super(name, year, amountofselling);
        this.view=view;
    }
    public void setView(int view){
        this.view=view;
    }
    public int getView(){
        return view;
    }
    public void getMusicInfo(){
        System.out.println( super.getMedia()+ "number of view is " + this.view);
    }

    public static void displayMusicsArrayInfo(Music[] musics) {
        for (int z = 0; z < musics.length; z++) {
            System.out.println("music information");
            System.out.println("*********************");
            System.out.println("Name                : " + musics[z].getName());
            System.out.println("Year                : " + musics[z].getYear());
            System.out.println("Amount of selling   : " + musics[z].getAmountofselling());
            System.out.println("View                : " + musics[z].getView());
            System.out.println();
        }
    }
}
