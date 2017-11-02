package Encapsulation.exercise.p04_shopping_spree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Map<String, Person> people = new LinkedHashMap<>();
    private static Map<String, Product> products = new LinkedHashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        try {
            ReadInput();
            while (true) {
                String[] tokens = reader.readLine().split("\\s+");
                if (tokens[0].equals("END")) {
                    break;
                }
                Person p = people.get(tokens[0]);
                Product pr = products.get(tokens[1]);
                if (p.buy(pr)) {
                    System.out.printf("%s bought %s%n", tokens[0], tokens[1]);
                    people.get(tokens[0]).getBought().add(tokens[1]);
                } else {
                    System.out.printf("%s can't afford %s%n", tokens[0], tokens[1]);
                }
            }

            people.forEach((key, value) -> {
                StringBuilder sb = new StringBuilder("");
                sb.append(key)
                        .append(" - ");
                List<String> bought = value.getBought();
                if (bought.isEmpty()) {
                    sb.append("Nothing bought, ");
                } else {
                    bought.forEach(s -> sb.append(s).append(", "));
                }
                System.out.println(sb.substring(0, sb.length() - 2));
            });
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }


    }

    private static void ReadInput() throws IOException {
        String[] peopleTokens = reader.readLine().split(";");
        String[] productsTokens = reader.readLine().split(";");
        Arrays.stream(peopleTokens).forEach(
                pt -> {
                    String name = pt.split("=")[0];
                    double money = Double.parseDouble(pt.split("=")[1]);
                    Person p = new Person(name, money);
                    people.putIfAbsent(name, p);

                }
        );
        Arrays.stream(productsTokens).forEach(
                pt -> {
                    String name = pt.split("=")[0];
                    double cost = Double.parseDouble(pt.split("=")[1]);

                    Product p = new Product(name, cost);
                    products.putIfAbsent(name, p);
                }
        );
    }

}
