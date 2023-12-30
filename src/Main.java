import com.mobile.store.Smartphone;
import com.mobile.store.brand.Apple;
import com.mobile.store.brand.Huawei;
import com.mobile.store.brand.Samsung;
import com.mobile.store.brand.Xiaomi;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final String FILE_NAME = "resources/smartphones100.csv";

    static String[] readFileWithBufferReader(String filename) {
        ArrayList<String> data = new ArrayList<>();
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
        Set<Smartphone> samsungs = new LinkedHashSet<>();
        String[] data = readFileWithBufferReader(FILE_NAME);
        phonesListObject(data);
        Stream<Smartphone> stream = samsungs.stream();

        Stream<Smartphone> sortedStream = samsungs.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getYearReleased(), s1.getBuildInMemoryStorage()));

        sortedStream.skip(16)
                .limit(24)
                .forEach(System.out::println);

        stream
                .sorted((s1, s2) -> Integer.compare(s2.getYearReleased(), s1.getBuildInMemoryStorage()));

        stream
                .filter(s -> s.toString().toLowerCase().contains("samsung"))
                .limit(21)
                .forEach(System.out::println);

    }

    public static void phonesListObject(String[] data) {
        for (int c = 1; c < data.length; c++) {
            var pieces = data[c].split(",");
            Smartphone smartphones = null;
            switch (pieces[0].toLowerCase()) {
                case "apple":
                    smartphones = new Apple(pieces[0], pieces[1], pieces[2], Integer.parseInt(pieces[3]),
                            Double.parseDouble(pieces[4]), Integer.parseInt(pieces[5]), pieces[6],
                            Boolean.parseBoolean(pieces[7]), Integer.parseInt(pieces[8]),
                            Integer.parseInt(pieces[9]), Integer.parseInt(pieces[10]));
                    break;
                case "samsung":
                    smartphones = new Samsung(pieces[0], pieces[1], pieces[2], Integer.parseInt(pieces[3]),
                            Double.parseDouble(pieces[4]), Integer.parseInt(pieces[5]), pieces[6],
                            Boolean.parseBoolean(pieces[7]), Integer.parseInt(pieces[8]),
                            Integer.parseInt(pieces[9]), Integer.parseInt(pieces[10]));
                    break;
                case "huawei":
                    smartphones = new Huawei(pieces[0], pieces[1], pieces[2], Integer.parseInt(pieces[3]),
                            Double.parseDouble(pieces[4]), Integer.parseInt(pieces[5]), pieces[6],
                            Boolean.parseBoolean(pieces[7]), Integer.parseInt(pieces[8]), Integer.parseInt(pieces[9]), Integer.parseInt(pieces[10]));
                    break;
                case "xiaomi":
                    smartphones = new Xiaomi(pieces[0], pieces[1], pieces[2], Integer.parseInt(pieces[3]),
                            Double.parseDouble(pieces[4]), Integer.parseInt(pieces[5]), pieces[6],
                            Boolean.parseBoolean(pieces[7]), Integer.parseInt(pieces[8]), Integer.parseInt(pieces[9]), Integer.parseInt(pieces[10]));
                    break;
            }
            System.out.println("Smartphone: " + smartphones);
        }
    }
}