import com.mobile.store.Smartphone;
import com.mobile.store.brand.Apple;
import com.mobile.store.brand.Samsung;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
    private static final String FILE_NAME = "resources/smartphones100.csv";

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
    interface MyFunctionalInterface {
        void doSomething();
    }

    static MyFunctionalInterface myFunctionalInterface = () -> {
        System.out.println("Hello world!");
    };

    public static void main(String[] args) throws IOException {
        List<Samsung> samsung= new LinkedList<>();
        String[] data = readFileWithBufferReader(FILE_NAME);
        Main.phonesListObject(data);
        Stream<Samsung> stream = samsung.stream();

        stream
                .sorted((d1, d2) ->(d1.getYearReleased()) - d2.getYearReleased())
                .forEach(System.out::println);

        myFunctionalInterface.doSomething();
    }
}