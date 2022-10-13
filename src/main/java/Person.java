public class Person {
    private String name;
    private int age;
    private int weight;

    private char sex;

    private double id;

    public Person(String name, int age, int weight, char sex, double id) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}