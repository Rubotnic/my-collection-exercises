package se.lexicon.CollectionChallenger3;

public class SuperHero implements SuperHero2 {

    private int id;
    private String name;
    private Integer age;

    public SuperHero(int id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public Integer getAge(SuperHero s) {
        if (age == s.age)
            return 0;
        else if(age > s.age)
            return 1;
        else
            return -1;
    }
}