package CollectionsInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeyAndValue {

    public static void main(String[] args) {
        Map<Integer, String> country = new TreeMap<>();
        country.put(1, "England");
        country.put(2, "Newziland");
        country.put(3, "Poland");
        country.put(4, "Finland");
        country.put(5, "Netherland");
        country.put(6, "Saudi Arabia");
        country.put(7, "Germany");

        // Print entries containing "land" before sorting
        for (Map.Entry<Integer, String> entry : country.entrySet()) {
            if (entry.getValue().contains("land")) {
                System.out.println("Before Sorting: " + entry.getKey() + ": " + entry.getValue());
            }
        }

        // Sorting by Value in Ascending Order
        System.out.println("\nAscending order based on Value:");
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(country.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> s1, Map.Entry<Integer, String> s2) {
                return s1.getValue().compareTo(s2.getValue());
            }
        });
        Map<Integer, String> sortedValue = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : entryList) {
            sortedValue.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Integer, String> entry : sortedValue.entrySet()) {
            System.out.println("Value Based Sorting in Alphabetic Order: " + entry.getKey() + ": " + entry.getValue());
        }

        // Sorting by Value in Descending Order
        System.out.println("\nDescending order based on Value:");
        List<Map.Entry<Integer, String>> descen = new ArrayList<>(country.entrySet());
        Collections.sort(descen, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> s1, Map.Entry<Integer, String> s2) {
                return s2.getValue().compareTo(s1.getValue());
            }
        });
        Map<Integer, String> sortedVal = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : descen) {
            sortedVal.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Integer, String> entry : sortedVal.entrySet()) {
            System.out.println("Value Based Sorting in Alphabetic Descending Order: " + entry.getKey() + ": " + entry.getValue());
        }

        // Sorting by Key in Ascending Order
        System.out.println("\nAscending order based on Key:");
        List<Map.Entry<Integer, String>> keyAscList = new ArrayList<>(country.entrySet());
        Collections.sort(keyAscList, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> s1, Map.Entry<Integer, String> s2) {
                return s1.getKey().compareTo(s2.getKey());
            }
        });
        Map<Integer, String> sortedKeyAsc = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : keyAscList) {
            sortedKeyAsc.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Integer, String> entry : sortedKeyAsc.entrySet()) {
            System.out.println("Key Based Sorting in Ascending Order: " + entry.getKey() + ": " + entry.getValue());
        }

        // Sorting by Key in Descending Order
        System.out.println("\nDescending order based on Key:");
        List<Map.Entry<Integer, String>> keyDescList = new ArrayList<>(country.entrySet());
        Collections.sort(keyDescList, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> s1, Map.Entry<Integer, String> s2) {
                return s2.getKey().compareTo(s1.getKey());
            }
        });
        Map<Integer, String> sortedKeyDesc = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : keyDescList) {
            sortedKeyDesc.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Integer, String> entry : sortedKeyDesc.entrySet()) {
            System.out.println("Key Based Sorting in Descending Order: " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
