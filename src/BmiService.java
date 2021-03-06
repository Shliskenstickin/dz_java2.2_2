public class BmiService {
    public static double calculate(double mass, double height){
        height /= 100;
        double index = mass / (height * height);
        return index;
    }
}
