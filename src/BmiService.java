public class BmiService {
    public int calculate (int kilogram, double metre) {
        double bmi = kilogram / (metre * metre);
        return (int) bmi;
    }
}
