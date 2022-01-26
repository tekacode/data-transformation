public class Person {
    String name;
    int age;
    String city;
    String flags;
    // First constructor
    public Person(String name, int age, String city, String flags){
        this.name = name;
        this.age = age;
        this.city = city;
        this.flags = flags;
    }
    // Second constructor
    public Person(String name, String flags, String city){
        this.name = name;
        this.flags = flags;
        this.city = city;
    }
}
