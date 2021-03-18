package com.company.examples.module2.ex020_file;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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

    static void fileWriteContent() throws IOException {
        File directory = new File("C:\\Users\\Anton\\Desktop\\test");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        String stringPath = directory.getAbsolutePath() + "\\" + fileName;
        Path path = Paths.get(stringPath);

        String content = Files.readString(path, StandardCharsets.UTF_8);
        Scanner stringScanner = new Scanner(content);
        char[] word = stringScanner.next().toCharArray();
        // make changes
        Files.writeString(path, content, StandardCharsets.UTF_8);
    }

    static byte[] readBytes(String filename) throws IOException {
        InputStream inputStream = new FileInputStream(filename);

        byte[] buffer = new byte[inputStream.available()]; // {0}
        System.out.printf("Available %d bytes%n", inputStream.available());
        // d - digit
        // s - string
        // f - float
        // n - new line
        // List<Byte[]> list = new ArrayList<>();
        int count = 0;
        while (inputStream.available() > 0)
        {
            count = inputStream.read(buffer);
        }

        System.out.printf("Read %d bytes%n", count);

        inputStream.close();
        return buffer;
    }

    static void writeBytes(byte[] bytes, String filename) throws IOException {
        OutputStream outputStream = new FileOutputStream(filename);
        outputStream.write(bytes);
        System.out.printf("Written %d bytes%n", bytes.length);
        outputStream.close();
    }

    public static void main(String[] args) throws IOException {
        byte[] bytes = readBytes("C:\\Users\\Anton\\Desktop\\test\\file.txt");
        writeBytes(bytes, "C:\\Users\\Anton\\Desktop\\test\\outputFile.txt");
    }

}