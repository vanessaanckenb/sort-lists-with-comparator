package br.com.vanessaancken.lists.comparator;

import br.com.vanessaancken.lists.comparator.domain.Client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExampleFComparatorWithAnonymousClassApplication {

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
        System.out.println(clients);
        System.out.println();


        final Comparator<Client> ageComparator = new Comparator<Client>() {
            @Override
            public int compare(Client client1, Client client2) {
                return client1.getAge().compareTo(client2.getAge());
            }
        };
        clients.sort(ageComparator);
        System.out.println("AGE COMPARATOR");
        System.out.println(clients);
        System.out.println();


        clients.sort(new Comparator<Client>() {
            @Override
            public int compare(Client client1, Client client2) {
                return client1.getName().compareTo(client2.getName());
            }
        });
        System.out.println("NAME COMPARATOR");
        System.out.println(clients);
    }
}
