package models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Guest on 8/1/17.
 */
public class Scrabble {

    public Integer calculateScore(String input){
        Map<Character, Integer> scoreVals = new HashMap();
        scoreVals.put('a' ,1);
        return scoreVals.get('a');
    }

}
