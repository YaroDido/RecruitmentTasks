package Strumienie;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {

            File katalog = new File("coś" +File.separator+"php"+File.separator+"mysql");
            katalog.mkdirs();

            File plik2 = new File("coś" +File.separator+"php"+File.separator+"mysql", "lekcja.txt");
            if (!plik2.exists())
                plik2.createNewFile();

            File plik = new File("test.txt");

            if (!plik.exists()) {

                plik.createNewFile();
            }

            System.out.println(plik.getPath());

            System.out.println("__________------_______");
            System.out.println("Plik 1 : " + plik.getCanonicalPath());//prawdziwa ścieżka
            System.out.println("Plik1 :  " + plik.getAbsolutePath());//dosłowna ścieżka

            System.out.println("Czy moge pisać? " + plik.canWrite());
            System.out.println("Czy moge odpalić? " + plik.canExecute());
            System.out.println("Czy moge ukryty? " + plik.isHidden());
            System.out.println("Czy moge czytać? " + plik.canRead());
            System.out.println("Czy jest plikiem? " + plik.isFile());
            System.out.println("Ostatnio modyfikowany? " + new Date(plik.lastModified()));
            System.out.println("Długośc pliku w bajtach (li.zmaków) : " + plik.length());
            System.out.println("__________------_______");

            Main.wypiszSciezki(new File(System.getProperty("user.dir")));
            //plik.delete -> usuwamy plik

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void wypiszSciezki(File nazwaSciezki) {
        String[] nazwyPlikowKatalogow = nazwaSciezki.list();
        System.out.println(nazwaSciezki.getPath());
        for (int i = 0; i < nazwyPlikowKatalogow.length; i++) {
            File p = new File(nazwaSciezki.getPath(), nazwyPlikowKatalogow[i]);

            System.out.println(p.getPath());

            if (p.isDirectory())
                wypiszSciezki(new File(p.getPath()));

           // if (p.isFile()) -> aby znalesc tylko pliki
                System.out.println(p.getPath());
        }
    }
}
