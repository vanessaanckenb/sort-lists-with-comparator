package br.com.vanessaancken.lists.comparator;

import br.com.vanessaancken.lists.comparator.domain.Client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class ExampleBSortWithComparableInClass {

    public static void main(String[] args) {

        Client client1 = new Client("Vanessa", 31);
        Client client2 = new Client("Camila", 33);
        Client client3 = new Client("Julia", 27);
        Client client4 = new Client("Andrezza", 30);

        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);

        clients.forEach(System.out::println);

        Collections.sort(clients);

        System.out.println("==============");
        clients.forEach(System.out::println);
    }
}
