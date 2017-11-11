package Preparation.NeedForSpeed.Race;

import Preparation.NeedForSpeed.Car.Car;

import java.util.ArrayList;
import java.util.List;

public abstract class Race {
    private int length;
    private String route;
    private int prizePool;
    private List<Car> participants;

    protected Race(int length, String route, int prizePool) {
        this.length = length;
        this.route = route;
        this.prizePool = prizePool;
        this.participants = new ArrayList<>();
    }
}
