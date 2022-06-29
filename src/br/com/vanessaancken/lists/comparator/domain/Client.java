package br.com.vanessaancken.lists.comparator.domain;

public class Client {

    private String name;
    private Integer age;

    public Client(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{name=" + name + ", age=" + age + "}";
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
