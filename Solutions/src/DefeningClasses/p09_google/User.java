package DefeningClasses.p09_google;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private Company company;
    private Car car;
    private List<Pokemon> pokemons;
    private List<Person> parents;
    private List<Person> children;

    User(){

    }
    User(String name, Company company, Car car, List<Pokemon> pokemons, List<Person> parents, List<Person> children) {
        this.name = name;
        this.company = company;
        this.car = car;
        this.pokemons = pokemons;
        this.parents = parents;
        this.children = children;
    }

    User(String name) {
        this.name = name;
        this.company = null;
        this.car = null;
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Person> getParents() {
        return parents;
    }

    public void setParents(List<Person> parents) {
        this.parents = parents;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(this.name)
                .append(System.lineSeparator())
                .append("Company:\n");
        if(this.company!=null){
            sb.append(this.company.toString());
        }
        sb.append("Car:\n");
        if(this.car!=null){
            sb.append(this.car.toString());
        }
        sb.append("Pokemon:\n");
        if(!this.pokemons.isEmpty()){
            this.pokemons.forEach(p->sb.append(p.toString()));
        }
        sb.append("Parents:\n");
        if(!this.parents.isEmpty()){
            this.parents.forEach(p->sb.append(p.toString()));
        }
        sb.append("Children:\n");
        if(!this.children.isEmpty()){
            this.children.forEach(p->sb.append(p.toString()));
        }
        return sb.toString();
    }
}
