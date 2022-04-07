package school.abstracts;

public abstract class People {
    private String name;
    private int age;
    private String gender;

    public People(String name, int age){
        this.name = name;
        this.age = age;
            }

    public String getName() {
        return name;
    }

    public abstract void atSchool();

    public abstract void havingBreak();
}
