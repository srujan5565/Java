/*
 * After writing the main class ->  cd.. i.e., go to the root directory and execute :
 *                                                                              javac application/*.java
                                                                    This will Create the .class files
                                                                    And then run java application.Main
 */

package application;
public class Main {
    public static void main(String[] args) {
    //     StandardSensor ten = new StandardSensor(10);
    // StandardSensor minusFive = new StandardSensor(-5);

    // System.out.println(ten.read());
    // System.out.println(minusFive.read());

    // System.out.println(ten.isOn());
    // ten.setOff();
    // System.out.println(ten.isOn());


        // Sensor kumpula = new TemperatureSensor();
        // kumpula.setOn();
        // System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");
    
        // Sensor kaisaniemi = new TemperatureSensor();
        // Sensor helsinkiVantaaAirport = new TemperatureSensor();
    
        // AverageSensor helsinkiRegion = new AverageSensor();
        // helsinkiRegion.addSensor(kumpula);
        // helsinkiRegion.addSensor(kaisaniemi);
        // helsinkiRegion.addSensor(helsinkiVantaaAirport);
    
        // helsinkiRegion.setOn();
        // System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");


        Sensor kumpula = new TemperatureSensor();
    Sensor kaisaniemi = new TemperatureSensor();
    Sensor helsinkiVantaaAirport = new TemperatureSensor();

    AverageSensor helsinkiRegion = new AverageSensor();
    helsinkiRegion.addSensor(kumpula);
    helsinkiRegion.addSensor(kaisaniemi);
    helsinkiRegion.addSensor(helsinkiVantaaAirport);

    helsinkiRegion.setOn();
    System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
    System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
    System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

    System.out.println("readings: " + helsinkiRegion.readings());
    
    }
}


