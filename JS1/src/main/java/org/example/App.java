package org.example;

import com.google.gson.Gson;
import org.example.domen.Person;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Aleksej", "Voronkin", 25);

        Gson gson = new Gson();

        String json = gson.toJson(person);
        System.out.println("Сериализованный объект в JSON: " + json);

        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println("Десериализованный JSON в объект: " + deserializedPerson);
    }
}
