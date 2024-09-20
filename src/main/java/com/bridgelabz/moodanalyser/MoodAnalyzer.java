package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {

    private String msg;
    public MoodAnalyzer() {
        this.msg = "";
    }
    public MoodAnalyzer(String msg){
        this.msg = msg;
    }
    public String analyseMood() {
        if(msg.toLowerCase().contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }

    public static void main( String[] args )
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is Sad Message");
        System.out.println(moodAnalyzer.analyseMood());
    }
}
