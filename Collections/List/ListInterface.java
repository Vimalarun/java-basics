//List is an interface to store ordered collection.

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListInterface{
    public static void main(String[] args)
    {
        List<String> countries = new ArrayList<String>();
        //add element in list
        countries.add("India");
        countries.add("USA");
        countries.add("Brazil");
        countries.add(2,"Finland");
        countries.add("Brazil");
        //update element in list
        countries.set(2,"Japan");

        //remove element in list
        countries.remove("Brazil");
        countries.remove(1);

        System.out.println(countries.get(0));
        System.out.println(countries.contains("India"));
        System.out.println(countries.size());
        Collections.sort(countries);//sort
        Collections.sort(countries,Collections.reverseOrder());
        Collections.reverse(countries);//reverse list
        Collections.rotate(countries,2);
        Collections.rotate(countries,-2);
        
        for(String country:countries)
        {
            System.out.print(country+" ");
        }
    }
}