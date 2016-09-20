/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

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
            System.out.println(str1.substring(i,i+sub));
        }
    }


    
    public static void main(String[] args) 
    {
        printout("Hello", 2);
    }
    
}
