package staticattrmeth;

public class Dog {

    private String name;
    private int age;
    private Species species;
    private long code;

    public Dog(String name, int age, Species species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void setCode(long code){
        this.code = code;
    }


}
