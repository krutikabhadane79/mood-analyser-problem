package com.bridgelabz.moodanalyser;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturn_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("This is Sad Message");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("This is Happy Message");
        Assert.assertEquals("HAPPY",mood);
    }

}
