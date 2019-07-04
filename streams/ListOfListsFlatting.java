package pl.samouczekprogramisty.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfListsFlatting {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Ania");
        list1.add("KAsia");
        list1.add("Basia");

        List<String> list2 = Arrays.asList("A","B","C");

        String[] array3 = {"123", "456", "789"};
        List<String> list3 = Arrays.asList(array3);

        List<List<String>> someList = Arrays.asList(list1,list2,list3);

        List<String> flatList = someList
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                ;

    }
    }

