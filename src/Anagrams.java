import java.io.*;
import java.util.*;

public class Anagrams {
    public static String anagrams(int minGroupSize) throws IOException{
        StringBuffer sb = new StringBuffer();
        // Read words from file and put them
        // into a simulated multimap
        Map<String, List<String>> m = new HashMap<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("CSV/spanish-dict (1).txt"));
            String word;
            while ((word = reader.readLine()) != null) {
                String alpha = alphabetize(word);
                List<String> l = m.get(alpha);
                if (l == null)
                    m.put(alpha, l = new ArrayList<>());
                l.add(word);
            }
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        } finally {
            reader.close();
        }

        // Print all permutation groups above size threshold
        for (List<String> l : m.values())
            if (l.size() >= minGroupSize)
                sb.append(l.size() + ": " + l + "\n");

        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        String res = anagrams(15);
        System.out.println(res);
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

}