package Preparation.avatar;

import Preparation.avatar.benders.AirBender;
import Preparation.avatar.benders.EarthBender;
import Preparation.avatar.benders.FireBender;
import Preparation.avatar.benders.WaterBender;
import Preparation.avatar.monuments.AirMonument;
import Preparation.avatar.monuments.EarthMonument;
import Preparation.avatar.monuments.FireMonument;
import Preparation.avatar.monuments.WaterMonument;
import Preparation.avatar.nations.AirNation;
import Preparation.avatar.nations.EarthNation;
import Preparation.avatar.nations.FireNation;
import Preparation.avatar.nations.WaterNation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    private static FireNation fireNation = new FireNation();
    private static WaterNation waterNation = new WaterNation();
    private static EarthNation earthNation = new EarthNation();
    private static AirNation airNation = new AirNation();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> warList = new ArrayList<>();
        while(true){
            String[] tokens = reader.readLine().split("\\s+");
            if(tokens[0].equals("Quit")){
                for (int i = 0; i < warList.size(); i++) {
                    System.out.printf("War %d issued by %s\n",i+1,warList.get(i));
                }
                break;
            }
            switch (tokens[0]){
                case "Bender":
                    createBender(tokens);
                    break;
                case "Monument":
                    createMonument(tokens);
                    break;
                case "Status":
                    printStatus(tokens);
                    break;
                case "War":
                    warList.add(tokens[1]);
                    double waterPower = waterNation.calculatePower();
                    double firePower = fireNation.calculatePower();
                    double earthPower = earthNation.calculatePower();
                    double airPower = airNation.calculatePower();
                    double maxPower = max(waterPower,firePower,earthPower,airPower);

                    if(waterPower==maxPower){
                        fireNation.getMonuments().clear();
                        fireNation.getBenders().clear();
                        earthNation.getMonuments().clear();
                        earthNation.getBenders().clear();
                        airNation.getMonuments().clear();
                        airNation.getBenders().clear();
                    }else if(earthPower==maxPower){
                        fireNation.getMonuments().clear();
                        fireNation.getBenders().clear();
                        airNation.getMonuments().clear();
                        airNation.getBenders().clear();
                        waterNation.getMonuments().clear();
                        waterNation.getBenders().clear();
                    }else if(airPower==maxPower){
                        fireNation.getMonuments().clear();
                        fireNation.getBenders().clear();
                        earthNation.getMonuments().clear();
                        earthNation.getBenders().clear();
                        waterNation.getMonuments().clear();
                        waterNation.getBenders().clear();
                    }else{
                        earthNation.getMonuments().clear();
                        earthNation.getBenders().clear();
                        airNation.getMonuments().clear();
                        airNation.getBenders().clear();
                        waterNation.getMonuments().clear();
                        waterNation.getBenders().clear();
                    }
                    
            }
        }
    }
    private static double max(double a, double b, double c, double d) {

        double max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        return max;
    }
    private static void printStatus(String[] tokens) {
        switch (tokens[1]){
            case "Water":
                System.out.print(waterNation);
                break;
            case "Air":
                System.out.print(airNation);
                break;
            case "Fire":
                System.out.print(fireNation);
                break;
            case "Earth":
                System.out.print(earthNation);
                break;
        }
    }

    private static void createBender(String[] tokens){
        switch (tokens[1]){
            case "Water":
                waterNation.getBenders().add(
                        new WaterBender(
                                tokens[2],
                                Integer.parseInt(tokens[3]),
                                Double.parseDouble(tokens[4])));
                break;
            case "Air":
                airNation.getBenders().add(
                        new AirBender(
                                tokens[2],
                                Integer.parseInt(tokens[3]),
                                Double.parseDouble(tokens[4])));
                break;
            case "Fire":
                fireNation.getBenders().add(
                        new FireBender(
                                tokens[2],
                                Integer.parseInt(tokens[3]),
                                Double.parseDouble(tokens[4])));
                break;
            case "Earth":
                earthNation.getBenders().add(
                        new EarthBender(
                                tokens[2],
                                Integer.parseInt(tokens[3]),
                                Double.parseDouble(tokens[4])));
                break;
        }
    }
    private static void createMonument(String[] tokens){
        switch (tokens[1]){
            case "Water":
                waterNation.getMonuments().add(
                        new WaterMonument(
                                tokens[2],
                                Integer.parseInt(tokens[3])));
                break;
            case "Air":
                airNation.getMonuments().add(
                        new AirMonument(
                                tokens[2],
                                Integer.parseInt(tokens[3])));
                break;
            case "Fire":
                fireNation.getMonuments().add(
                        new FireMonument(
                                tokens[2],
                                Integer.parseInt(tokens[3])));
                break;
            case "Earth":
                earthNation.getMonuments().add(
                        new EarthMonument(
                                tokens[2],
                                Integer.parseInt(tokens[3])));
                break;
        }
    }
}
