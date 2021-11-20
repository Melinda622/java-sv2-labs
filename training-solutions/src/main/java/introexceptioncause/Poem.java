package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {

    public List<String> readPoem() {
        try {
            return Files.readAllLines(Paths.get("src/main/java/introexceptioncause/poem.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public static void main(String[] args) {

        List<String> poem = new Poem().readPoem();

        for (String s : poem) {
            System.out.print(s.charAt(0));
        }
    }
}