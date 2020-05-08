package com.automation.Collection.ArrayLIst;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * @Author Deepak Lonare
 */
public class ArrayTOAL
{ @Test
    public void tstAL()
    {
        String [] names = {"My","Name","Is","Khan","SRK","Mannat","Land's End","Bollywood",};
        System.out.println("Displaying the Array");
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }

        System.out.println("Copying the Array to ArrayList");
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(names));
        System.out.println("Displaying the ArrayList");
        for(String name:al)
        {
            System.out.println(name);
        }

        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("Converting the Araylist to LInkedHasSet");
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        System.out.println("Add All");

        lhs.addAll(al);
        System.out.println("Added elements to LHS, now clearing the ArrayLIst"+lhs);
        al.clear();
        System.out.println("Copying from LHS to ArrayList");
        al.addAll(lhs);
        System.out.println("Showing new Arrylist elements");
        System.out.println("Sorting the list");
        Collections.sort(al);
        for(String alnames: al)
        {
            System.out.println(alnames);
        }
     }

}
