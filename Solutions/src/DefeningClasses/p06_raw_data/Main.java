package DefeningClasses.p06_raw_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<Car>> carsByCargoType = new LinkedHashMap<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            Car car = readCar(tokens);
            String cargoType = car.getCargo().getType();
            if (cargoType.equals("fragile")) {
                carsByCargoType.putIfAbsent("fragile", new ArrayList<>());
                carsByCargoType.get("fragile").add(car);
            } else if (cargoType.equals("flamable")) {
                carsByCargoType.putIfAbsent("flamable", new ArrayList<>());
                carsByCargoType.get("flamable").add(car);
            }
        }
        String cargoType = reader.readLine();
        if (cargoType.equals("fragile")) {
            carsByCargoType.get("fragile")
                    .stream()
                    .filter(x -> x.getTires().get(0).getPressure() < 1 ||
                            x.getTires().get(1).getPressure() < 1 ||
                            x.getTires().get(2).getPressure() < 1 ||
                            x.getTires().get(3).getPressure() < 1)
                    .forEach(c-> System.out.println(c.getModel()));
        }else if(cargoType.equals("flamable")){
            carsByCargoType.get("flamable")
                    .stream()
                    .filter(c->c.getEngine().getPower()>250)
                    .forEach(c-> System.out.println(c.getModel()));
        }
    }

    private static Car readCar(String[] tokens) {

        String model = tokens[0];
        Engine engine = new Engine(
                Integer.parseInt(tokens[1]),
                Integer.parseInt(tokens[2])
        );
        Cargo cargo = new Cargo(
                Integer.parseInt(tokens[3]),
                tokens[4]
        );
        List<Tire> tires = new ArrayList<>();
        for (int j = 5; j < 13; j = j + 2) {
            Tire tire = new Tire(
                    Double.parseDouble(tokens[j]),
                    Integer.parseInt(tokens[j + 1])
            );
            tires.add(tire);
        }
        return new Car(
                model,
                engine,
                cargo,
                tires
        );
    }
}
