package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void empty() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void emptyTest() {
        assertTrue( BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void balancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void balancedBracketsWithText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void balancedBracketsAtBeginning() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void balancedBracketsAtENd() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }



    @Test
   public void onlyOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testOnlyClosingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }


    @Test
    public void onlyOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
   public void closedOpenBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyClosedBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void onlyClosedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

}