public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kilogram = 65;
        double metre = 1.7;
        double bmi = service.calculate(kilogram, metre);
        System.out.println((int) bmi);
    }
}