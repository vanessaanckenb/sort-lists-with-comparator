</br>

⚠️ English and Portuguese explanation

</br>


# Sort lists with comparator

</br>

java 1.8 or + is needed.

</br>

From Java 8 we can use sort() method which requires Comparator implementation (compares two references through compare method).

</br>

* Sorting lists with classes

Create a class that implements Comparator<T> (T represents the type of class we are going to compare, in my case I will compare my class Client)

Implement the mandatory method compare according to your business rule (I'll sort by name)
 
</br>

```
class ClientsNameComparator implements Comparator<Client> {
    @Override
    public int compare(Client client1, Client client2) {
        return client1.getName().compareTo(client2.getName());
    }
}
```

</br>
  
The comparison is made with the result of positive, 0 or negative numbers

if it gives -1 it is because client2.getName() is greater than client1.getName()

if it is 0, they are the same, if it is 1, client1 comes before

 after that, we instantiate the class to use it in the sort() method
 
 </br>
  
```
public static void main(String[] args) {
  ...
  clients.sort(new ClientsNameComparator());
  System.out.println(clients);
}
```
  
</br>
</br>

* Sorting lists with anonymous classes

Above we created a class to be able to implement the Compartor and override the comparison method

In order not to have to create a class to be instantiated just once, we can use anonymous classes, which are created directly in the method under the hood.

Internally, Java generates a class that implements the Comparator interface, and that contains the compare() method.
  
</br>

```
  ...
  final Comparator<Client> nameComparator = new Comparator<Client>() {
    @Override
    public int compare(Client client1, Client client2) {
      return client1.getName().compareTo(client2.getName());
     }
  };
     
  clients.sort(nameComparator);
  System.out.println(clients);
    ...
```

</br>

To make the code cleaner we insert the object's constructor directly as a parameter in the sort() method

</br>
  
```
  ...  
  clients.sort(new Comparator<Client>() {
      @Override
      public int compare(Client client1, Client client2) {
        return client1.getName().compareTo(client2.getName());
      }
  });
  System.out.println(clients);
  ...
```

</br>
</br>

* Sorting Lists with Lambdas

Instead of calling the constructor directly, sort method already expects a Comparator so we can just pass the parameters of the compare method with it rules inside it.
</br>

```
  ...
  clients.sort((Client c1, Client c2) -> {
    return c1.getAge().compareTo(c2.getAge());
  });
  clients.forEach(client -> System.out.println(client));
  ...
```

</br>
We can simplify the code as below:

</br>

```
  ...
  clients.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
  clients.forEach(client -> System.out.println(client));
  ...
```

</br>
</br>
</br>
</br>


# Ordernar listas com a interface Comparator e método Sort

</br>

A partir do Java 8 podemos usar o método sort() que exige um Comparator (compara duas referências por meio do um método compare).

</br>

* Ordenando listas com classes 

Criar uma classe que implements Comparator<T>  (T representa o tipo de classe que vamos comparar, no meu caso vou fazer uma comparação na classe Client)

Implementar o método obrigatório compare conforme sua regra de negócio (vou ordenar por nome)
 
</br>

```
class ClientsNameComparator implements Comparator<Client> {
    @Override
    public int compare(Client client1, Client client2) {
        return client1.getName().compareTo(client2.getName());
    }
}
```

</br>
  
A comparação é feita com o resultado de números positivos, 0 ou negativos

se der -1 é porque o client2.getName() é maior que o client1.getName()

se der 0, são iguais, se der 1, client1 vem antes

 após isso, instanciamos a classe para usa-la no método sort()
 
 </br>
  
```
public static void main(String[] args) {
  ...
  clients.sort(new ClientsNameComparator());
  System.out.println(clients);
}
```
  
</br>
</br>

* Ordenando listas com classes anônimas

Acima criamos uma classe para poder implementar o Compartor e sobreescrever o método de comparação

Para que não precisasse criar uma classe para ser instanciada apenas uma vez, podemos usar classes anônimas, as quais são criadas diretamente no método por debaixo dos panos.

Internamente, o Java gera uma classe que implementa a interface Comparator, e que contém o método compare()
  
</br>

```
  ...
  final Comparator<Client> nameComparator = new Comparator<Client>() {
    @Override
    public int compare(Client client1, Client client2) {
      return client1.getName().compareTo(client2.getName());
     }
  };
     
  clients.sort(nameComparator);
  System.out.println(clients);
    ...
```

</br>

Para deixar o código mais limpo inseririmos o construtor do objeto diretamente como um parâmetro no método sort()

</br>
  
```
  ...  
  clients.sort(new Comparator<Client>() {
      @Override
      public int compare(Client client1, Client client2) {
        return client1.getName().compareTo(client2.getName());
      }
  });
  System.out.println(clients);
  ...
```

</br>
</br>

* Ordenando listas com  Lambdas

Em vez de chamarmos o construtor diretamente, como o método já espera um Comparator, podemos apenas passar os parâmetros do método compare e dentro sua regra.
</br>

```
  ...
  clients.sort((Client c1, Client c2) -> {
    return c1.getAge().compareTo(c2.getAge());
  });
  clients.forEach(client -> System.out.println(client));
  ...
```

</br>
Podemos simplificar ainda mais o código conforme abaixo:

</br>

```
  ...
  clients.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
  clients.forEach(client -> System.out.println(client));
  ...
```


  

