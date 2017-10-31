package DefeningClasses.p07_car_salesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Engine> engines = new HashMap<>();
        List<Car> cars = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i <n ; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            Engine engine = readEngine(tokens);
            engines.putIfAbsent(engine.getModel(),engine);
        }
        int n1 = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n1 ; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            Car car = readCar(tokens,engines);
            cars.add(car);
        }
        cars.forEach(c-> System.out.print(c.toString()));
    }

    private static Car readCar(String[] tokens,Map<String, Engine> engines) {
        Car car = new Car(
                tokens[0],
                engines.get(tokens[1])
        );
        if(tokens.length==3){
            try{
                int weight = Integer.parseInt(tokens[2]);
                car.setWeight(weight);
            }catch (Exception ex){
                car.setColor(tokens[2]);
            }
        }else if(tokens.length==4){
            try{
                int weight = Integer.parseInt(tokens[2]);
                car.setWeight(weight);
                car.setColor(tokens[3]);
            }catch (Exception ex){
                car.setColor(tokens[2]);
                car.setWeight(Integer.parseInt(tokens[3]));
            }
        }
        return car;
    }

    private static Engine readEngine(String[] tokens){
        Engine engine = new Engine(
                tokens[0],
                Integer.parseInt(tokens[1])
        );
        if(tokens.length==3){
            try{
                int displacement = Integer.parseInt(tokens[2]);
                engine.setDisplacement(displacement);
            }catch (Exception ex){
                engine.setEfficiency(tokens[2]);
            }
        }else if(tokens.length==4){
            try{
                int displacement = Integer.parseInt(tokens[2]);
                engine.setDisplacement(displacement);
                engine.setEfficiency(tokens[3]);
            }catch (Exception ex){
                engine.setEfficiency(tokens[2]);
                engine.setDisplacement(Integer.parseInt(tokens[3]));
            }
        }
        return engine;
    }
}
