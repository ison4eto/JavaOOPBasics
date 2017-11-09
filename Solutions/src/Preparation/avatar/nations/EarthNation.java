package Preparation.avatar.nations;

import Preparation.avatar.benders.EarthBender;
import Preparation.avatar.monuments.EarthMonument;

import java.util.ArrayList;
import java.util.List;

public class EarthNation {
    private List<EarthBender> benders;
    private List<EarthMonument> monuments;

    public EarthNation(){
        this.benders = new ArrayList<>();
        this.monuments = new ArrayList<>();
    }
    public double calculatePower(){
        double powerBend = benders.stream().mapToDouble(EarthBender::calculatePower).sum();
        double powerMon = monuments.stream().mapToInt(EarthMonument::getEarthAffinity).sum();
        return powerBend/100*powerMon;
    }

    public List<EarthBender> getBenders() {
        return benders;
    }

    public List<EarthMonument> getMonuments() {
        return monuments;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("Earth Nation\n")
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
