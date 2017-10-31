package DefeningClasses.p10_family_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String toFind = reader.readLine();
        Map<Person,FamilyMember> familyTree = new HashMap<>();
        while (true){
            String line = reader.readLine();
            if(line.equals("End")){
                break;
            }
            String[] tokens = new String[4];
            if(line.contains("-")){
                tokens = line.split(" - ");
            }else{
                String[] splitted = line.split("\\s+");
                tokens[0] = splitted[0]+" "+splitted[1];
                tokens[1]=splitted[2];
            }
            Person parent = new Person();
            Person child = new Person();
            if(tokens[0].contains("/")){
                if(tokens[1].contains("/")){ //	day/month/year - day/month/year
                    parent.setBirthday(tokens[0]);
                    child.setBirthday(tokens[1]);
                }else{ // day/month/year - FirstName LastName
                    parent.setBirthday(tokens[0]);
                    child.setName(tokens[1]);
                }
            }else {
                if(tokens[1].contains("/")){ //FirstName LastName day/month/year
                    parent.setName(tokens[0]);
                    child.setBirthday(tokens[1]);
                }else{ //FirstName LastName - FirstName LastName
                    parent.setName(tokens[0]);
                    child.setName(tokens[1]);
                }
            }
            familyTree.putIfAbsent(parent,new FamilyMember(parent));
            familyTree.putIfAbsent(child,new FamilyMember(child));
            familyTree.get(parent).getChildren().add(child);
            familyTree.get(child).getParents().add(parent);
        }

        if(toFind.contains("/")){
            Optional<Person> keyToFind = familyTree.keySet().stream()
                    .filter(p-> p.getBirthday().equals(toFind))
                    .findFirst();
            if(keyToFind.isPresent()){
                System.out.println(familyTree.get(keyToFind).toString());
            }
        }else{
            Optional<Person> keyToFind = familyTree.keySet().stream()
                    .filter(p-> p.getName().equals(toFind))
                    .findFirst();
            if(keyToFind.isPresent()){
                System.out.println(familyTree.get(keyToFind).toString());
            }
        }
    }
}
