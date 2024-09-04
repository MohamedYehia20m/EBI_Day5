package EBI;

import java.util.*;

public class Lab2 {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        // Add the strings to the ArrayList

        stringList.add("CarrotCake");
        stringList.add("BananaSplit");
        stringList.add("CherryTart");
        stringList.add("DateShake");
        stringList.add("EggSalad");
        stringList.add("AvocadoToast");
        stringList.add("BlueberryMuffin");
        stringList.add("ApplePie");
        stringList.add("Doughnut");
        stringList.add("Eclair");

        // Creating a TreeMap with Character as key and List of Strings as value
        Map<Character, List<String>> treeMap = new TreeMap<>();

        // Populate the TreeMap

        stringList.stream().forEach(s -> {
            char key = s.charAt(0);
            // If the key is not present in the map, add it with a new list
            treeMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        });

    /*    // Populate the TreeMap using Iterator
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            String s = stringIterator.next();
            char key = s.charAt(0);
            // If the key is not present in the map, add it with a new list
            List<String> list = treeMap.computeIfAbsent(key, k -> new ArrayList<>());
            list.add(s);
        }
*/

        printAll(treeMap);
        printForChar(treeMap, 'B');


    }

    //print all strings for a given letter
    public static void printAll(Map<Character, List<String>> wordMap) {
        System.out.println("Strings grouped by starting character:");
        for (Character key : wordMap.keySet()) { // O(n)
            System.out.println("Key: " + key + ", Values: " + wordMap.get(key));
        }
    }

    // print for specific key
    public static void printForChar(Map<Character, List<String>> wordMap ,char key) {
        System.out.println("Key: " + key + ", Values: " + wordMap.get(key));

    }
}
