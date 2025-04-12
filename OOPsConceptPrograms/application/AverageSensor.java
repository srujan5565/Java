package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    ArrayList<Sensor> sensors = new ArrayList<>();
    List<Integer> readings = new ArrayList<>();
    public boolean isOn(){
        return true;
    }   
    public void setOn(){
        for(Sensor s:sensors){
            s.setOn();
        }
    }   
    public void setOff(){
        for(Sensor s:sensors){
            s.setOff();
        }
    }  
    public int read(){
        sensors.stream().filter(p -> !p.isOn())
                        .findAny()
                        .ifPresent(s -> { throw new IllegalStateException("Sensor is Off"); });
        int avg = (int) sensors.stream().mapToInt(Sensor::read).average().getAsDouble();
        readings.add(avg);
        return avg;
        
    }
    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }
    public List<Integer> readings(){
        return readings;
    }
}
