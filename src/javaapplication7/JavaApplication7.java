/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import static kiss.API.*;

/**
 *
 * @author Cameron
 */
public class JavaApplication7 
{
    
    public static void printout(String str1, int sub)
    {
        String maxstr = "";
        String minstr = "";
        int i = 0;
        for (i=0;i<str1.length()-sub+1;i++)
        {
            String substr = str1.substring(i,i+sub);
            substr = substr.toLowerCase();
            if (i == 0)
            {
                maxstr = substr;
                minstr = substr;
            }
            else 
            {
                if (substr.compareTo(minstr)<0) minstr = substr;
                if (substr.compareTo(maxstr)>0) maxstr = substr;
            }
        }
        try(Close out = outExpect("ava",EOL,
                                  "wel",EOL)) {
            println(minstr);
            println(maxstr);
        }
        println(minstr);
        println(maxstr);
    }


    
    public static void main(String[] args) 
    {
        printout("Welcometojava", 3);
    }
    
}
