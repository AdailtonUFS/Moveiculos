package src.Person;

/**
 * Person
 */
public class Person {
    private final String name;
    private final Integer age;
    private final String email;
    private final String CPF;


    public Person(String name, Integer age, String email, String CPF)
    {
        this.name = name;
        this.age = age;
        this.email = email;
        this.CPF = CPF;
    }

    public String getName() {
        return this.name;
    }
    public Integer getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCPF() {
        return this.CPF;
    }

    public String toString() {
        return this.name + ";" + this.age + ";" + this.email + ";" + this.CPF;
    }
}