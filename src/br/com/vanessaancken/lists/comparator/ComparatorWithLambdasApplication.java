package br.com.vanessaancken.lists.comparator;

import br.com.vanessaancken.lists.comparator.domain.Client;

import java.util.ArrayList;
import java.util.List;

public class ComparatorWithLambdasApplication {

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

        System.out.println("JAVA ORDER");
        clients.forEach(client -> System.out.println(client));
        System.out.println();

        clients.sort((Client c1, Client c2) -> {
            return c1.getAge().compareTo(c2.getAge());
        });
        System.out.println("AGE COMPARATOR");
        clients.forEach(client -> System.out.println(client));
        System.out.println();

        clients.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
        System.out.println("NAME COMPARATOR");
        clients.forEach(client -> System.out.println(client));
    }
}
