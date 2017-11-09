package Encapsulation.exercise.p03_animal_farm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        try{
            Chicken chicken = new Chicken(age,name);
            System.out.println(chicken);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}