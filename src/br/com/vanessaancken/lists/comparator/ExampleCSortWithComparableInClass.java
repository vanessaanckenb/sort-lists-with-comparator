package br.com.vanessaancken.lists.comparator;

import br.com.vanessaancken.lists.comparator.domain.Client;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleCSortWithComparableInClass {

    public static void main(String[] args) {

        Client client1 = new Client("Vanessa", 31, new BigDecimal(100.00));
        Client client2 = new Client("Camila", 33, new BigDecimal(10.00));
        Client client3 = new Client("Julia", 27, new BigDecimal(200.00));
        Client client4 = new Client("Andrezza", 30, new BigDecimal(500.00));

        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);

        System.out.println("NO COMPARATION");
        clients.forEach(System.out::println);

        Collections.sort(clients);

        System.out.println("==============");
        System.out.println("COMPARING WITH OFFICIAL RULE - COMPARABLE INTEFACE IMPLEMENTED IN CLIENTS WITH METHOD COMPARETO");
        clients.forEach(System.out::println);

        Collections.sort(clients, Comparator.comparing(Client::getAge));

        System.out.println("==============");
        System.out.println("COMPARING WITH COMPARATOR BY AGE");
        clients.forEach(System.out::println);

        Collections.sort(clients, Comparator.comparing(Client::getValue));

        System.out.println("==============");
        System.out.println("COMPARING WITH COMPARATOR BY VALUE");
        clients.forEach(System.out::println);
    }
}
