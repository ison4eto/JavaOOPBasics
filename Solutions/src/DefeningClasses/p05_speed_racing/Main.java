package DefeningClasses.p05_speed_racing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<String,Car> cars = new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            Car car = new Car(
                    tokens[0],
                    Integer.parseInt(tokens[1]),
                    Double.parseDouble(tokens[2])
            );
            cars.putIfAbsent(tokens[0],car);
        }
        String line;
        while (!"End".equals(line = reader.readLine())){
            String[] tokens = line.split("\\s+");
            String model = tokens[1];
            int dist = Integer.parseInt(tokens[2]);
            if(!cars.get(model).travel(dist)){
                System.out.println("Insufficient fuel for the drive");
            }
        }
        cars.entrySet().forEach(car-> System.out.println(car.toString().split("=")[1]));
    }
}
