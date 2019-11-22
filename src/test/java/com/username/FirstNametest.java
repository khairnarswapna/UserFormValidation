package com.username;

import org.junit.Assert;
import org.junit.Test;

public class FirstNametest
{

     @Test
     public void givenMessage_whenFirstNameIsCorrectformat_shouldReturnTrue()
     {
          FirstName firstname = new FirstName();
          boolean fname = firstname.isValidFirstName("Swapna");
          Assert.assertTrue(fname);

     }
     @Test
     public void givenMessage_whenFirstNameContainStartwithSmallcharacter_shouldReturnFalse()
     {
          FirstName firstname = new FirstName();
          boolean fname = firstname.isValidFirstName("swapna");
          Assert.assertFalse(fname);

     }

     @Test
     public void givenMessage_whenFirstNameContainsDigits_shouldReturnFalse()
     {
          FirstName firstname = new FirstName();
          boolean fname = firstname.isValidFirstName("Swapna123");
          Assert.assertFalse(fname);

     }
     @Test
     public void givenMessage_whenFirstNameContainsSpecialCharacter_shouldReturnFalse()
     {
          FirstName firstname = new FirstName();
          boolean fname = firstname.isValidFirstName("Swapna@#%$");
          Assert.assertFalse(fname);

     }
     @Test
     public void givenMessage_whenFirstNameLengthTwo_shouldReturnFalse()
     {
          FirstName firstname = new FirstName();
          boolean fname = firstname.isValidFirstName("s");
          Assert.assertFalse(fname);

     }
     @Test
     public void givenMessage_whenFirstNameContainOnlyDigit_shouldReturnFalse()
     {
          FirstName firstname = new FirstName();
          boolean fname = firstname.isValidFirstName("12345");
          Assert.assertFalse(fname);

     }

      ////////////////////////////////////////////////////////////////////////////////

     @Test
     public void givenMessage_whenLastNameIsCorrectformat_shouldReturnTrue()
     {
          FirstName firstname = new FirstName();
          boolean fname = firstname.isValidFirstName("Khairnar");
          Assert.assertTrue(fname);

     }
     @Test
     public void givenMessage_whenLastNameContainStartwithSmallcharacter_shouldReturnFalse()
     {
          FirstName firstname = new FirstName();
          boolean fname = firstname.isValidFirstName("khairnar");
          Assert.assertFalse(fname);

     }

     @Test
     public void givenMessage_whenLastNameContainsDigits_shouldReturnFalse()
     {
          FirstName firstname = new FirstName();
          boolean fname = firstname.isValidFirstName("Khairnar123");
          Assert.assertFalse(fname);

     }
     @Test
     public void givenMessage_whenLastNameContainsSpecialCharacter_shouldReturnFalse()
     {
          FirstName firstname = new FirstName();
          boolean fname = firstname.isValidFirstName("Khairnar@#%$");
          Assert.assertFalse(fname);

     }
     @Test
     public void givenMessage_whenLastNameLengthTwo_shouldReturnFalse()
     {
          FirstName firstname = new FirstName();
          boolean fname = firstname.isValidFirstName("k");
          Assert.assertFalse(fname);
     }
     @Test
     public void givenMessage_whenLastNameContainOnlyDigit_shouldReturnFalse()
     {
          FirstName firstname = new FirstName();
          boolean fname = firstname.isValidFirstName("123459");
          Assert.assertFalse(fname);
     }



}