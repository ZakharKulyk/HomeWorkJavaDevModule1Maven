package Demo;

import Person.Person;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Person person = new Person("Zakhar", "Kulyk");

        System.out.println(gson.toJson(person));

    }
}
