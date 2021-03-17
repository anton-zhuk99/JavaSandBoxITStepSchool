package com.company.examples.module2.ex020_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    static void fileScannerExample() throws IOException {
        File file = new File("C:\\Users\\Anton\\Desktop\\test\\file.txt");
        // file.createNewFile();
        Scanner fileScanner = new Scanner(file);
        // delimiters
        fileScanner.useDelimiter("[^a-zA-Z0-9]+");
        while (fileScanner.hasNext()) {
            System.out.println(fileScanner.next());
        }
        fileScanner.close();
    }

    public static void main(String[] args) throws IOException {
        File directory = new File("C:\\Users\\Anton\\Desktop\\test");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        String stringPath = directory.getAbsolutePath() + "\\" + fileName;
        Path path = Paths.get(stringPath);

        String content = Files.readString(path, StandardCharsets.UTF_8);
        String contentModified = content.replace("foo", "bar");
        // make changes
        Files.writeString(path, contentModified, StandardCharsets.UTF_8);
    }

}
