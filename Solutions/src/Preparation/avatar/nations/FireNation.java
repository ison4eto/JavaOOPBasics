package Preparation.avatar.nations;

import Preparation.avatar.benders.FireBender;
import Preparation.avatar.monuments.FireMonument;

import java.util.ArrayList;
import java.util.List;

public class FireNation {
    private List<FireBender> benders;
    private List<FireMonument> monuments;

    public FireNation(){
        this.benders = new ArrayList<>();
        this.monuments = new ArrayList<>();
    }
    public double calculatePower(){
        double powerBend = benders.stream().mapToDouble(FireBender::calculatePower).sum();
        double powerMon = monuments.stream().mapToInt(FireMonument::getFireAffinity).sum();
        return powerBend/100*powerMon;
    }

    public List<FireBender> getBenders() {
        return benders;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("Fire Nation\n")
                .append("Benders:");
        if(benders.isEmpty()){
            sb.append(" None\n");
        }else{
            sb.append(System.lineSeparator());
            benders.forEach(b->sb.append(b).append(System.lineSeparator()));
        }
        sb.append("Monuments:");
        if(monuments.isEmpty()){
            sb.append(" None\n");
        }else{
            sb.append(System.lineSeparator());
            monuments.forEach(b->sb.append(b).append(System.lineSeparator()));
        }
        return sb.toString();
    }

    public List<FireMonument> getMonuments() {
        return monuments;
    }
}
