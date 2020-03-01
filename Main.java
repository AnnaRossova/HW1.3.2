public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 50.5;
        double height = 1.68;
        double index = service.calculate(weight, height);
        System.out.println(index);
    }
}
