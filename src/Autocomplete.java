import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Autocomplete
{
    /* Initializes the data structure from the given filename */
    public Autocomplete(String filename) throws FileNotFoundException
    {
        // here's an example for file input/output. you'll need to change this
        // to initialize your Trie :)
        File f = new File (filename);
        Scanner sc = new Scanner(f);
        int n = sc.nextInt();
        System.out.println(n);
        for(int i = 0; i < n; i++)
        {
            long weight = sc.nextLong();
            String term = sc.nextLine().strip();
            System.out.println(weight + "\t" + term);
        }
    }

    /*
     * Returns all terms that start with the given prefix, in
     * descending order of weight.
     */
    public String[] allMatches(String prefix)
    {
        return null;
    }

    /*
     * Returns all terms that start with the given prefix, in
     * descending order of weight. For each string, the weight should
     * appear before the term.
     */
    public String[] allMatchesWithWeight(String prefix)
    {
        return new String[] {""};
    }

    /* Returns the number of terms that start with the given prefix. */
    public int numberOfMatches(String prefix)
    {
        return -1;
    }

    /*
     * Creates a new Autocomplete object, then repeatedly asks the user for a search term (prefix).
     * Results are printed with weight as well as the total time it took to execute.
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Autocomplete a = new Autocomplete("tiny.txt");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            System.out.print("Enter search term: ");
            String prefix = sc.nextLine();
            Instant start = Instant.now();
            String[] matches = a.allMatchesWithWeight(prefix);
            Instant end = Instant.now();

            // print all matches and execution time
            for(String m : matches)
                System.out.println(m);
            System.out.println("Completed in " + Duration.between(start, end).toMillis() + "ms");
        }
    }
}
