/*
 // DEMO: Random random = new Random();

// The Random class provides methods for generating random numbers in Java.
// Below are step-by-step breakdowns of how different methods of the Random class work:

// ------------------------------------------------------
// 1. nextInt(int bound) - Generates a random integer between 0 (inclusive) and the specified bound (exclusive).

// Example:
random.nextInt(10);  // Generates a random integer between 0 and 9 (inclusive).

// The bound must be positive. If a negative value is passed, it will throw an IllegalArgumentException.

// ------------------------------------------------------
// 2. nextInt() - Generates a random integer (without any bound).

// Example:
random.nextInt();  // Generates a random integer from the range of all 32-bit signed integers.

// This method can return any integer within the entire integer range (-2^31 to 2^31-1).

// ------------------------------------------------------
// 3. nextDouble() - Generates a random double between 0.0 (inclusive) and 1.0 (exclusive).

// Example:
random.nextDouble();  // Generates a random double between 0.0 and 1.0.

// ------------------------------------------------------
// 4. nextFloat() - Generates a random float between 0.0 (inclusive) and 1.0 (exclusive).

// Example:
random.nextFloat();  // Generates a random float between 0.0 and 1.0.

// ------------------------------------------------------
// 5. nextBoolean() - Generates a random boolean value (true or false).

// Example:
random.nextBoolean();  // Generates either true or false randomly.

// ------------------------------------------------------
// 6. nextLong() - Generates a random long number (without any bound).

// Example:
random.nextLong();  // Generates a random long from the range of all 64-bit signed longs.

// This method can return any long value from -2^63 to 2^63-1.

// ------------------------------------------------------
// 7. nextBytes(byte[] bytes) - Fills the provided byte array with random values.

// Example:
byte[] byteArray = new byte[10];
random.nextBytes(byteArray);  // Fills the byteArray with 10 random bytes.

// The byte array will be modified directly with random byte values ranging from -128 to 127.

// ------------------------------------------------------
// 8. setSeed(long seed) - Sets the seed for the random number generator.

// Example:
random.setSeed(12345L);  // Sets the seed for generating random numbers based on a specific value.

// The seed is used to initialize the random number generator, ensuring that the sequence of random numbers
// is reproducible if the same seed is used again.

// ------------------------------------------------------
// 9. nextGaussian() - Generates a random number from a Gaussian (normal) distribution with mean 0 and standard deviation 1.

// Example:
random.nextGaussian();  // Generates a random number from a normal distribution (mean = 0, stddev = 1).

// This method is useful for generating numbers that follow a Gaussian distribution, often used in simulations or
// statistical applications.

// ------------------------------------------------------
// Final Output:
// System.out.println(random.nextInt(10));    // Random int between 0 and 9
// System.out.println(random.nextDouble());   // Random double between 0.0 and 1.0
// System.out.println(random.nextBoolean());  // Random boolean value (true or false)
// System.out.println(random.nextLong());     // Random long number
// System.out.println(random.nextGaussian()); // Random number from Gaussian distribution
// System.out.println(byteArray);             // Random byte array with 10 random bytes

 */
import java.util.ArrayList;
import java.util.Random;
class WeatherMan
{
    Random random;
    WeatherMan(){
        this.random =new Random();
    }
    public String forecast(){
        double prob = this.random.nextDouble();
        if (prob <= 0.1) {
            return "It rains";
        } else if (prob <= 0.4) { 
            return "It snows";
        } else { 
            return "The sun shines";
        }
    
    }
}
public class RandomExample {
    public static void main(String[] args) {
        WeatherMan forecaster = new WeatherMan();

        // save days of the week to a list
        ArrayList<String> days = new ArrayList<>();
        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");
        days.add("Sat");
        days.add("Sun");

        System.out.println("Next week's weather forecast:");

        for (String day : days) {
            String weatherForecast = forecaster.forecast();

            System.out.println(day + ": " + weatherForecast );
        }
    }
}
