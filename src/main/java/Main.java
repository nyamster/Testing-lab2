public class Main {
    public static void main(String[] args) {
        SystemCalculator systemCalculator = new SystemCalculator();
        for(double i = -150d; i <= 150d; i += 10d)
        {
            System.out.println(systemCalculator.calculate(i, 0.00000001));
        }
    }
}