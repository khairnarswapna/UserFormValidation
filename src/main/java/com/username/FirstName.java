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
}
