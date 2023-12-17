import com.mobile.store.Smartphone;
import com.mobile.store.brand.Apple;
import com.mobile.store.brand.Huawei;
import com.mobile.store.brand.Protected_Smartphone;
import com.mobile.store.brand.Samsung;
import com.mobile.store.brand.Xiaomi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "resources/smartphones2.csv";

    static String[] readFileFromScanner(String fileName) {
        ArrayList<String> data = new ArrayList<String>();
        var file = new File(fileName);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        boolean finished = false;

        do {
            try {
                data.add(scanner.nextLine());
            } catch (NoSuchElementException e) {
                finished = true;
            }
        } while (!finished);

        scanner.close();
        return Arrays.copyOf(data.toArray(), data.size(), String[].class);
    }

    static String[] readFileWithFileReader(String filename) {
        var sb = new StringBuffer();
        FileReader reader;

        try {
            reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int c;
        try {
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString().split(System.lineSeparator());
    }

    static String[] readFileWithBufferReader(String filename) {
        ArrayList<String> data = new ArrayList<String>();
        FileReader reader;

        try {
            reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        var br = new BufferedReader(reader);
        String newLine;

        try {
            while ((newLine = br.readLine()) != null) {
                data.add(newLine);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Arrays.copyOf(data.toArray(), data.size(), String[].class);
    }

    public static void main(String[] args) {
//        String[] data = readFileFromScanner(FILE_NAME);
//        String[] data = readFileWithFileReader(FILE_NAME);
        String[] data = readFileWithBufferReader(FILE_NAME);
        System.out.println(data);

        for (int c = 1; c < data.length; c++) {
            var pieces = data[c].split(",");
            Smartphone smartphones = null;
            switch (pieces[0].toLowerCase()) {
                case "apple":
                    smartphones = new Apple(pieces[0], pieces[1], pieces[2], Integer.parseInt(pieces[3]),
                            Double.parseDouble(pieces[4]), Integer.parseInt(pieces[5]), pieces[6],
                            Boolean.parseBoolean(pieces[7]), Integer.parseInt(pieces[8]),
                            Integer.parseInt(pieces[9]));
                    break;
                case "samsung":
                    smartphones = new Samsung(pieces[0], pieces[1], pieces[2], Integer.parseInt(pieces[3]),
                            Double.parseDouble(pieces[4]), Integer.parseInt(pieces[5]), pieces[6],
                            Boolean.parseBoolean(pieces[7]), Integer.parseInt(pieces[8]),
                            Integer.parseInt(pieces[9]));
                    break;
                case "huawei":
                    smartphones = new Huawei(pieces[0], pieces[1], pieces[2], Integer.parseInt(pieces[3]),
                            Double.parseDouble(pieces[4]), Integer.parseInt(pieces[5]), pieces[6],
                            Boolean.parseBoolean(pieces[7]), Integer.parseInt(pieces[8]), Integer.parseInt(pieces[9]));
                    break;
                case "xiaomi":
                    smartphones = new Xiaomi(pieces[0], pieces[1], pieces[2], Integer.parseInt(pieces[3]),
                            Double.parseDouble(pieces[4]), Integer.parseInt(pieces[5]), pieces[6],
                            Boolean.parseBoolean(pieces[7]), Integer.parseInt(pieces[8]), Integer.parseInt(pieces[9]));
                    break;
            }
            System.out.println("Reading from different types file import: " + smartphones);
        }
    }
}