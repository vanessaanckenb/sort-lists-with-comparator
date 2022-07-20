package br.com.vanessaancken.lists.comparator.domain;

import java.math.BigDecimal;

public class Client implements Comparable<Client> {

    private String name;
    private Integer age;
    private BigDecimal value;

    public Client(String name, Integer age){
        this.name = name;
        this.age = age;
        this.value = BigDecimal.ZERO;
    }

    public Client(String name, Integer age, BigDecimal value){
        this.name = name;
        this.age = age;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getValue() { return value; }

    @Override
    public String toString() {
        return "Client{name=" + name + ", age=" + age + ", value: " + value + "}";
    }

    @Override
    public int compareTo(Client anotherClient) {
        return this.name.compareTo(anotherClient.getName());
    }
}
