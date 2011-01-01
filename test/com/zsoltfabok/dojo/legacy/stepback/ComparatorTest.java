package com.zsoltfabok.dojo.legacy.stepback;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ComparatorTest {
    private Comparator comparator = new Comparator();

    @Test
    public void shouldReturnTrueForTheSameWords()  {
        assertTrue(new Comparator().same("word word"));
    }

    @Test
    public void shouldReturnFalseForDifferentWords()  {
        assertFalse(comparator.same("ward word"));
    }

    @Test
    public void shouldReturnFalseForWordsWithDifferentLength()  {
        assertFalse(comparator.same("worda word"));
    }

    @Test
    public void shouldReturnFalseWhenTheFirstWordIsMissing()  {
        assertFalse(comparator.same(" word"));
    }

    @Test
    public void shouldReturnFalseWhenTheSecondWordIsMissing()  {
        assertFalse(comparator.same("word "));
    }

    @Test
    public void shouldReturnTrueForTheSameButDifferentlyCasedWords()  {
        assertTrue(new Comparator().same("wORd word"));
    }

}
