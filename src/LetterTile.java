import java.util.HashMap;

public class LetterTile {
    private static HashMap<Character, Integer> allTiles;
    private static HashMap<Character, Integer> usedTiles;
    private static HashMap<Character, Integer> remainingTiles;



    private static final char[] englishAlphabet = new char[]
            {'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /*
    Fills up the allTiles HashMap with all letters in the alphabet according to a distribution.
    This allows for multiple scrabble variations, languages, etc.
    @param the distribution of the letters inputted as an array. E.g. if the array is
    [3, 5, 10, 2, ...] this results in 3 A's, 5 B's, 10 C's, 2 D's, and so on...
     */
    public static void fillMap(int[] letterDist, char[] language) {
        for (int index : letterDist) {
            allTiles.put(language[index], letterDist[index]);
        }

    public static HashMap<Character, Integer> getAllTiles() {
            return allTiles;
        }
}
