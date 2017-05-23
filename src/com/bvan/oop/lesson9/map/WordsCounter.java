package com.bvan.oop.lesson9.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bvanchuhov
 */
public class WordsCounter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("world", "Hello", "Java", "Hello", "world");
        Map<String, Integer> wordsToCount = countWords(words);
        System.out.println(wordsToCount);

    }

    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordToCount = new HashMap<>();

        for (String word : words) {
            if (wordToCount.containsKey(word)) {
                Integer count = wordToCount.get(word);
                wordToCount.put(word, count+1);
            } else {
                wordToCount.put(word, 1);
            }
        }

        return wordToCount;
    }
}
