import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        
        HashMap<Character, Integer> counter = new HashMap<Character, Integer>();
        for(int i = 0; i < str.length(); i++){
            char key = str.charAt(i);
            if(counter.containsKey(key)){
                counter.put(key, counter.get(key)+1);
            }
            else{
                counter.putIfAbsent(key, 1);
            }
        }
        char returnChar = ' ';
        int biggestAmount = Integer.MIN_VALUE;
        for(char key : counter.keySet()){
            if(counter.get(key) > biggestAmount){
                returnChar = key;
                biggestAmount = counter.get(key);
            }
        }
        return returnChar;
    }
}
