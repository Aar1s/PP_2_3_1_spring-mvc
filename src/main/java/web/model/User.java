package web.model;

public class User {
    private int id;
    private String name;
    private String surname;
    private int age;

    public int getId() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }

    public User() {}

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
