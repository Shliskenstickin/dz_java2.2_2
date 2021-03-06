public class Main {
    public static void main (String[] args){
        BmiService jirobas = new BmiService();
        double mass = 125;
        double height = 188;
        System.out.println(jirobas.calculate(mass, height));
    }
}
