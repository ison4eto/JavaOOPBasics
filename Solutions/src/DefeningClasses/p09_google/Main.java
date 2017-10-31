package DefeningClasses.p09_google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, User> users = new HashMap<>();
        while (true) {
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens[0].equals("End")) {
                break;
            }
            switch (tokens[1]) {
                case "company":
                    Company comp = new Company(
                            tokens[2],
                            tokens[3],
                            Double.parseDouble(tokens[4])
                    );
                    users.putIfAbsent(tokens[0], new User(tokens[0]));
                    users.get(tokens[0]).setCompany(comp);
                    break;
                case "car":
                    Car car = new Car(
                            tokens[2],
                            Integer.parseInt(tokens[3])
                    );
                    users.putIfAbsent(tokens[0], new User(tokens[0]));
                    users.get(tokens[0]).setCar(car);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(
                            tokens[2],
                            tokens[3]
                    );
                    users.putIfAbsent(tokens[0], new User(tokens[0]));
                    users.get(tokens[0]).getPokemons().add(pokemon);
                    break;
                case "parents":
                    Person parent = new Person(
                            tokens[2],
                            tokens[3]
                    );
                    users.putIfAbsent(tokens[0], new User(tokens[0]));
                    users.get(tokens[0]).getParents().add(parent);
                    break;
                case "children":
                    Person child = new Person(
                            tokens[2],
                            tokens[3]
                    );
                    users.putIfAbsent(tokens[0], new User(tokens[0]));
                    users.get(tokens[0]).getChildren().add(child);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
        String name = reader.readLine();
        if(users.containsKey(name)){
            System.out.println(users.get(name).toString());
        }else{
            System.out.println("User not found");
        }
    }
}
