import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        return 1;
    }

    // dictionary of roman numerals
    private static final Map<Character, Integer> romanNumerals = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
}