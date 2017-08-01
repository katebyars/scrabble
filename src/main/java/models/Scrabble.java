package models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Guest on 8/1/17.
 */
public class Scrabble {

    public Integer calculateScore(String input) {

//        ArrayList<Object> splits12 = new ArrayList<Object>();
        char[] result= input.toCharArray();
        Map<Character, Integer> scoreVals = new HashMap();

        Character[] alphabet = {'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T', 'D', 'G', 'B', 'C', 'M', 'P', 'F', 'H', 'V', 'W', 'Y', 'K','J', 'X', 'Q', 'Z'};

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i].equals('A') || alphabet[i].equals('E') || alphabet[i].equals('I') || alphabet[i].equals('O')  ||alphabet[i].equals('U') || alphabet[i].equals('L')                || alphabet[i].equals('N') || alphabet[i].equals('R') || alphabet[i].equals('S')||  alphabet[i].equals('T') ) {
                scoreVals.put(alphabet[i], 1);

            } else if (alphabet[i].equals('D') || alphabet[i].equals('G')) {
                scoreVals.put(alphabet[i], 2);

            } else if (alphabet[i].equals('B') || alphabet[i].equals('C') || alphabet[i].equals('M')|| alphabet[i].equals('P')) {
                scoreVals.put(alphabet[i], 3);

            } else if (alphabet[i].equals('F') || alphabet[i].equals('H') || alphabet[i].equals('V')|| alphabet[i].equals('W') || alphabet[i].equals('Y')) {
            scoreVals.put(alphabet[i], 4);

            } else if (alphabet[i].equals('K')) {
            scoreVals.put(alphabet[i], 5);

            } else if ( (alphabet[i].equals('J') ) || (alphabet[i].equals('X') ) ) {
                scoreVals.put(alphabet[i], 8);

            } else if ( (alphabet[i].equals('Q')) || (alphabet[i].equals('Z')) ) {
            scoreVals.put(alphabet[i], 10);

            } else return scoreVals.get(alphabet[i]);
        }


//        for (int i = 0; i <= splits12.length; i++) {

//        }
//        public String characterArray(String input) {
//
//            Map<Character, Integer> outputString = new HashMap();
//        }
        int score = 0;

        for (int i = 0; i < result.length; i++) {
            score += scoreVals.get(result[i]);
        }return score;
    }
}
