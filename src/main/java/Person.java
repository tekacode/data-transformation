public class Person {
   private String name;
    private int age;
    private String city;
    private String flags;
    // First constructor
    public Person(String name, int age, String city, String flags){
        this.setName(name);
        this.setAge(age);
        this.setCity(city);
        this.setFlags(flags);
    }
    // Second constructor
    public Person(String name, String flags, String city){
        this.name = name;
        this.flags = flags;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getFlags() {
        return flags;
    }
}
