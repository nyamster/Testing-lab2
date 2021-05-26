public class SystemCalculator {
    private  Trigonometry trigonometry;
    private Logarifm logarifm;

    public SystemCalculator() {
        trigonometry = new Trigonometry();
        logarifm = new Logarifm();
    }

    public double calculate(double x, double acc) {
        double result;
        if(x > 0)
        {
            double log_3 = logarifm.log(x, 3d, acc);
            double log_5 = logarifm.log(x, 5d, acc);
            double log_10 = logarifm.log(x, 10d, acc);
            result = ((((Math.pow(log_3, 3) + log_3) * log_10) + log_3) + log_5);
        } else
        {
            double sin = trigonometry.calculateSin(x, acc);
            double cot = trigonometry.calculateCot(x, acc);
            double sec = trigonometry.calculateSec(x, acc);
            double csc = trigonometry.calculateCsc(x, acc);
            result = Math.pow((((sec / cot / csc) + sec) / sin), 2);
        }
        Logger.write("system", x, result);
        return result;
    }
}
