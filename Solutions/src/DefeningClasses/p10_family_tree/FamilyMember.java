package DefeningClasses.p10_family_tree;

import java.util.ArrayList;
import java.util.List;

public class FamilyMember {
    private Person data;
    private List<Person> children;
    private List<Person> parents;

    FamilyMember(){

    }

    FamilyMember(Person data) {
        this.data = data;
        this.children = new ArrayList<>();
        this.parents = new ArrayList<>();
    }

    public Person getData() {
        return data;
    }

    public void setData(Person data) {
        this.data = data;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Person> getParents() {
        return parents;
    }

    public void setParents(List<Person> parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(data.toString())
                .append("Parents:\n");
        parents.forEach(p->sb.append(p.toString()));
        sb.append("Children:\n");
        children.forEach(p->sb.append(p.toString()));
        return sb.toString();
    }
}
