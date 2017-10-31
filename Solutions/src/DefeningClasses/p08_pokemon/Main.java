package DefeningClasses.p08_pokemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Trainer> trainers = new LinkedHashMap<>();
        while (true){
            String line = reader.readLine();
            if("Tournament".equals(line)){
                break;
            }
            String[] tokens = line.split("\\s+");
            String name = tokens[0];
            trainers.putIfAbsent(name,new Trainer(
                    name,
                    new HashMap<>()
            ));
            String type = tokens[2];
            trainers.get(name).getPokemons().putIfAbsent(type,new ArrayList<>());
            trainers.get(name).getPokemons().get(type).add(new Pokemon(
                    tokens[1],
                    type,
                    Integer.parseInt(tokens[3])
            ));
            trainers.get(name).setPokemonsCount(trainers.get(name).getPokemonsCount()+1);
        }
        while (true){
            String line = reader.readLine();
            if("End".equals(line)){
                break;
            }
            trainers.values().forEach(tr->{
                if(tr.getPokemons().containsKey(line)){
                    tr.setBadgesCount(tr.getBadgesCount()+1);
                }else{
                    tr.getPokemons().values().forEach(x->{
                        x.forEach(p->{
                            int health = p.getHealth();
                            if(health < 10){
                                if(!p.isDeleted()){
                                    p.setDeleted(true);
                                    tr.setPokemonsCount(tr.getPokemonsCount()-1);
                                }

                            }else{
                                p.setHealth(health-10);
                            }
                        });
                    });
                }
            });
        }
        trainers.entrySet().stream()
                .sorted((t1,t2)->Integer.compare(t2.getValue().getBadgesCount(),t1.getValue().getBadgesCount()))
                .forEach(tr-> System.out.println(tr.toString().split("=")[1]));
    }

}
