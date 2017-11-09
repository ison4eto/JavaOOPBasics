package Preparation.avatar.nations;

import Preparation.avatar.benders.AirBender;
import Preparation.avatar.benders.AirBender;
import Preparation.avatar.monuments.AirMonument;

import java.util.ArrayList;
import java.util.List;

public class AirNation{
    private List<AirBender> benders;
    private List<AirMonument> monuments;

    public AirNation(){
        this.benders = new ArrayList<>();
        this.monuments = new ArrayList<>();
    }
    public double calculatePower(){
        double powerBend = benders.stream().mapToDouble(AirBender::calculatePower).sum();
        double powerMon = monuments.stream().mapToInt(AirMonument::getAirAffinity).sum();
        return powerBend/100*powerMon;
    }

    public List<AirBender> getBenders() {
        return benders;
    }

    public List<AirMonument> getMonuments() {
        return monuments;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("Air Nation\n")
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
