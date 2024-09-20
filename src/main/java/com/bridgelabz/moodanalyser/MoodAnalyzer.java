package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {

    public String analyseMood(String msg) {
        if(msg.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }

    public static void main( String[] args )
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("Sad");
        System.out.println(mood);
    }
}
