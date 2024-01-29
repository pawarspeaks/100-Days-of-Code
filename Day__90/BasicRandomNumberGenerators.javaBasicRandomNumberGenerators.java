import java.util.Random;

public class BasicRandomNumberGenerators {
    public static void main(String[] args) {
        // Using the enhanced pseudorandom number generators
        Random random = new Random();

        // Generating random integers
        int randomInt = random.nextInt(100);
        System.out.println("Random Integer: " + randomInt);

        // Generating random doubles
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // Generating random Gaussian-distributed doubles
        double randomGaussian = random.nextGaussian();
        System.out.println("Random Gaussian: " + randomGaussian);
    }
}
