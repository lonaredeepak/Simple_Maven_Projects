package com.automation.Collection.ArrayLIst;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Deepak Lonare
 */
public class ALtoA
{
    @Test
    public void conversionAL()
    {
        List<String> al = new ArrayList<String>();
        al.add("My");
        al.add("Name");
        al.add("Is");
        al.add("Khan");
        System.out.println("Printing the arrayList: ");
        for(String alName:al)
        {
            System.out.println(alName);
        }
        System.out.println();
        String [] str = new String[al.size()];
        System.out.println("Conversion :");
        for(int j=0;j<al.size();j++)
        {
            str[j]=al.get(j);
        }
        System.out.println();

        System.out.println("Printing the converted array:");
        for(String k : str)
        {
            System.out.println(k);
        }
    }
}
