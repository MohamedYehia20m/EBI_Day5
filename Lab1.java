package EBI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lab1 {

    public static void main(String[] args) {

    
        // Lab1

        int [] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};


        System.out.printf("average: %.2f%n",
                IntStream.of(values)
                .average()
                .getAsDouble()
        );
    

        //Lab2
    
        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Programming");

        Stream<String> stream = stringList.stream();
        stream.filter(e -> e != null)
                .forEach(s ->System.out.printf("tolowercase strings: %s\n",s.toLowerCase()) );

     

        //Lab3
    
        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Hello");
        stringList.add("Programming");

        Stream<String> stream = stringList.stream();
        stream.distinct()
                .forEach(s ->System.out.printf("distinct strings: %s\n",s) );
     

        //Lab4
    
        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Hello");
        stringList.add("Programming");

        Stream<String> stream = stringList.stream();
        long count = stream
                .filter(s -> s.toLowerCase().startsWith("h"))
                .count();

        // Print the count
        System.out.println("Number of strings starting with 's': " + count);

     
    }
}
