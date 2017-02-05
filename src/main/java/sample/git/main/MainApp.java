package sample.git.main;

import sample.git.main.util.Config;

import java.io.File;

/**
 * Created by sde52a6 on 05.02.2017.
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("ein test für branch");
        System.out.println("test nummer 2");
        System.out.println("test nummer 2");
        SamplePrinter.print();

        Config config = new Config(new File("test.txt"));

    }
}
