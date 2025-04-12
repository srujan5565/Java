package application;

public class StandardSensor implements Sensor {
    int num;
    int reading,avg;
    boolean sensor=true;
    StandardSensor(int num){
        this.num=num;
    }
    public boolean isOn(){
        return true;
    }   
    public void setOn(){
        sensor=true;
    }   
    public void setOff(){
        sensor=false;
    } 
    public int read(){
        this.reading=num;
        return num;
    }
}
