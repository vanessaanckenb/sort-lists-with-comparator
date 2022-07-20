package br.com.vanessaancken.lists.comparator;

import br.com.vanessaancken.lists.comparator.domain.Client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleASortStringsWithCollectionsSort {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vanessa");
        names.add("Camila");
        names.add("Regiane");
        names.add("Julia");
        names.add("Andrezza");

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);
    }
}
