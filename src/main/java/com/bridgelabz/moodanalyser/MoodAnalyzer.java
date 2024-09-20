package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {
    private String msg;
    public MoodAnalyzer(String msg) {
        this.msg = msg;
    }

    public String analyseMood() {
        if(msg.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }

    public static void main( String[] args )
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Sad");
        System.out.println(moodAnalyzer.analyseMood());
    }
}
