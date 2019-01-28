package MyProje;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) throws IOException {

        String dosyaAdi = "film3.txt";
        FileWriter myfilm = new FileWriter(dosyaAdi);
        BufferedWriter bw = new BufferedWriter(myfilm);
        //PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(dosyaAdi, true)));


        Scanner input = new Scanner(System.in);
        String tempName;
        int tempYear;
        int tempAmountofselling;
        double tempImdb;
        String tempType;
        int tempView;

        ArrayList<Film> fA = new ArrayList<>(2);
        ArrayList<Music> mA = new ArrayList<>(2);
        //int numOfFilms = input.nextInt();
        //int numOfMusics = input.nextInt();


        boolean run = true;
        while (true) {


            Scanner in = new Scanner(System.in);
            Scanner in1 = new Scanner(System.in);
            Scanner scan = new Scanner(System.in);


            Media.displayMenu();
            int option = input.nextInt();

            switch (option) {
                case 1:

                    Film f = new Film();
                    System.out.println("enter film's information");

                    System.out.println("name: ");
                    tempName = input.nextLine();
                    //input.nextLine();
                    f.setName(input.nextLine());

                    System.out.println("year: ");
                    tempYear = input.nextInt();
                    input.nextLine();
                    f.setYear(tempYear);

                    System.out.println("amount of selling: ");
                    tempAmountofselling = input.nextInt();
                    input.nextLine();
                    f.setAmountofselling(tempAmountofselling);

                    System.out.println("Imdb: ");
                    tempImdb = input.nextDouble();
                    input.nextLine();
                    f.setImdb(tempImdb);

                    System.out.println("Type: ");
                    tempType = input.nextLine();
                    input.nextLine();
                    f.setType(tempType);


                    fA.add(f);
                    bw.write("name: " + tempName);
                    bw.newLine();
                    bw.write("year: " + String.valueOf(tempYear));
                    bw.newLine();
                    bw.write("amount of selling: " + String.valueOf(tempAmountofselling));
                    bw.newLine();
                    bw.write("imdb: " + String.valueOf(tempImdb));
                    bw.newLine();
                    bw.write("type: " + String.valueOf(tempType));
                    bw.newLine();
                    bw.flush();
                    bw.close();
                    //myfilm.close();
                    //myfilm.setWrapStyleWord();
                    //out.println(f);
                    //out.close();


                    break;

                case 2:

                    Music m = new Music();
                    System.out.println("enter music's information");

                    System.out.println("name: ");
                    tempName = input.nextLine();
                    //input.nextLine();
                    m.setName(input.nextLine());

                    System.out.println("year: ");
                    tempYear = input.nextInt();
                    input.nextLine();
                    m.setYear(tempYear);

                    System.out.println("amount of selling: ");
                    tempAmountofselling = input.nextInt();
                    input.nextLine();
                    m.setAmountofselling(tempAmountofselling);

                    System.out.println("View: ");
                    tempView = input.nextInt();
                    input.nextLine();
                    m.setView(tempView);

                    mA.add(m);


                    break;

                case 3:
                    System.out.println("Printing information of films .....");
                    //displayFilmsArrayInfo(films);
                    for (int i = 0; i < fA.size(); i++) {
                        System.out.println("Name : " + fA.get(i).getName());
                        System.out.println("Year : " + fA.get(i).getYear());
                        System.out.println("Amount of selling : " + fA.get(i).getAmountofselling());
                        System.out.println("Imdb : " + fA.get(i).getImdb());
                        System.out.println("Type : " + fA.get(i).getType());

                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Printing information of musics.....");
                    //displayMusicsArrayInfo(musics);
                    for (int i = 0; i < mA.size(); i++) {
                        System.out.println("Name : " + mA.get(i).getName());
                        System.out.println("Year : " + mA.get(i).getYear());
                        System.out.println("Amount of selling : " + mA.get(i).getAmountofselling());
                        System.out.println("View : " + mA.get(i).getView());

                        System.out.println();
                    }

                    break;
                case 5:
                    System.exit(5);
                    break;
                case 6:
                    //Book.printInfoB;
            }
        }

    }
}