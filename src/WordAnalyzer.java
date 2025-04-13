import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordAnalyzer {

    public  int countUniqueWordsFromFile(String filePath) throws IOException {
        Set<String> uniqueWords = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
           String line;
           while((line = reader.readLine())!=null) {
               line = line.toLowerCase().replaceAll("[^a-z ]", "");
               String[] words = line.split("\\s+");
               for(String word : words) {
                   if(!word.isEmpty()) {
                       uniqueWords.add(word);
                   }
               }
           }

        }
        return uniqueWords.size();

    }

    public Map<String,Integer> countWordOccurrencesFromFile(String filePath) throws IOException {
       Map<String,Integer> wordsFrequency = new HashMap<>();
       try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
           String line;
           while((line = reader.readLine())!=null) {
               line = line.toLowerCase().replaceAll("[^a-z ]", "");
               String[] words = line.split("\\s+");
               for(String word : words) {
                   if(wordsFrequency.get(word)==null) {
                       wordsFrequency.put(word,1);
                   }else {
                       wordsFrequency.put(word,wordsFrequency.get(word)+1);
                   }
               }
           }
       }
       return wordsFrequency;
    }
}
