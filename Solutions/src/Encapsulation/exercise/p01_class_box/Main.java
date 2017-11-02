package Encapsulation.exercise.p01_class_box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Box box ;
        try {
            double l = Double.parseDouble(reader.readLine());
            double w = Double.parseDouble(reader.readLine());
            double h = Double.parseDouble(reader.readLine());
            box = new Box(l,w,h);
            System.out.println(box);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}


