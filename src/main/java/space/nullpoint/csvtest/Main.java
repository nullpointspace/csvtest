package space.nullpoint.csvtest;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String list = Stream.of(
                new TestFile("q", "w", 0, true),
                new TestFile(null, "e", 1, true),
                new TestFile(null, "r", 2, true),
                new TestFile(null, null, 3, true),
                new TestFile("t", null, 4, false),
                new TestFile("y", null, 5, false),
                new TestFile("u", "i", null, true)
        )
                .map(TestFile::toString)
                .collect(Collectors.joining("\n"));

        try (Writer writer = new OutputStreamWriter(new FileOutputStream("filename.csv"), "utf-8")) {
            writer.write(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
