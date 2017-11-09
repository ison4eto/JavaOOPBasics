package Preparation.avatar.nations;

import Preparation.avatar.benders.WaterBender;
import Preparation.avatar.monuments.WaterMonument;

import java.util.ArrayList;
import java.util.List;

public class WaterNation {
    private List<WaterBender> benders;
    private List<WaterMonument> monuments;

    public WaterNation(){
        this.benders = new ArrayList<>();
        this.monuments = new ArrayList<>();
    }
    public double calculatePower(){
        double powerBend = benders.stream().mapToDouble(WaterBender::calculatePower).sum();
        double powerMon = monuments.stream().mapToInt(WaterMonument::getWaterAffinity).sum();
        return powerBend/100*powerMon;
    }

    public List<WaterBender> getBenders() {
        return benders;
    }

    public List<WaterMonument> getMonuments() {
        return monuments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("Water Nation\n")
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
}
