package DefeningClasses.p03_preson_opinion_pool;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n ; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            people.add(new Person(input[0],Integer.parseInt(input[1])));
        }
        people.stream()
                .filter(x->x.getAge()>30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(x-> System.out.printf("%s - %d%n",x.getName(),x.getAge()));
    }


}
