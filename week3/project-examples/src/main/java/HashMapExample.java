import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> wordLetterCount = new HashMap<>();
        wordLetterCount.put("java", 4);
        wordLetterCount.put("blabla", 6);
        wordLetterCount.put("python", 6);
        wordLetterCount.put("phone", 5);

        System.out.println(wordLetterCount);

        for(String key : wordLetterCount.keySet()) {
            System.out.println(key + " : " + wordLetterCount.get(key));
        }

        for(Integer value : wordLetterCount.values()) {
            System.out.println(value);
        }
    }
}
