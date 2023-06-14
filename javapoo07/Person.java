package javapoo07;

public class Person {
    private String name;
    private short age;
    private char sex;
    private float weight;
    private float height;
    private static int numPerson = 1;

    public Person(String name, short age, char sex, float weight, float height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        numPerson++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public static int getNumPerson() {
        return numPerson;
    }

    public static void setNumPerson(int numPerson) {
        Person.numPerson = numPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
