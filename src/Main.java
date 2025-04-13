import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        String line = "Java is a .powerful /programming language. It is widely used for building enterprise-scale applications.\n";
        line = line.toLowerCase().replaceAll("[^a-z ]", "");
        String[] w = line.split("\\s+");
        for(String s:w)
        System.out.println(s);

    }
}