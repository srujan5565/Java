package application;


public class TemperatureSensor implements Sensor {
    boolean sensor=true;
    int reading,avg;
    public boolean isOn(){
        return sensor;
    }   
    public void setOn(){
        sensor=true;
    }   
    public void setOff(){
        sensor=false;
    }  
    public int read(){
        this.reading=(int)(Math.random()*30-30);
        if(isOn()) return this.reading;
        else throw new IllegalStateException("Senosor is Off");
    }
}
