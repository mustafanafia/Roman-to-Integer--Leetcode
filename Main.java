import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main o = new Main();

        System.out.println(o.romanToInt("LVIII"));
    }

    public int romanToInt(String s) {

        //Creating a Hashmap to map each Roman numeral to its value
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        int sum = 0;

        hashtable.put('I', 1);
        hashtable.put('V', 5);
        hashtable.put('X', 10);
        hashtable.put('L', 50);
        hashtable.put('C', 100);
        hashtable.put('D', 500);
        hashtable.put('M', 1000);


        //Result variable to hold the value of the last character
        int last_char_value = hashtable.get(s.charAt(s.length() - 1));

        for (int i = 0; i < s.length() - 1; i++) {

            int next = hashtable.get(s.charAt(i + 1));
            int curr = hashtable.get(s.charAt(i));

            if ( next <= curr ) {
                sum += hashtable.get(s.charAt(i));
            } else {
                sum -= hashtable.get(s.charAt(i));
            }
        }
        return sum + last_char_value;
    }
}