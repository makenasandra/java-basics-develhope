package javastreams.exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String filePath = "src/file.txt";
        File file = new File(filePath);

        try{
            Stream<String> linesStream = Files.lines(file.toPath());
//            System.out.println(file.toPath());
            linesStream.forEach(line -> System.out.println(line));

        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}