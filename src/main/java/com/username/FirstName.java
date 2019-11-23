package com.username;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName
{
    Pattern pattern;
    Matcher matcher;
    public boolean isValidFirstName(String name)
    {

        pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        matcher=pattern.matcher(name);
        if(matcher.matches())
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public boolean isValidLastName(String name)
    {

        pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        matcher=pattern.matcher(name);
        if(matcher.matches())
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public boolean isValidMobileNumber(String number)
    {
        Pattern NUMBER_PATTERN = Pattern.compile("^[0-9]{2}[: :]{1}[0-9]{10}$");
        Matcher match = NUMBER_PATTERN.matcher(number);
        if (match.matches())
            return true;
        else
            return false;
    }



}
