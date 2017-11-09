package DefeningClasses.p10_family_tree;


public class Person {
    private String name;
    private String birthday;

    Person(){

    }
    Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s%n",this.name,this.birthday);
    }
}