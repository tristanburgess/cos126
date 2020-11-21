package exercises_1_2;

public class Ex_2_TrigAdditionFormula {
    public static void main(String[] args) {
        double theta = Double.parseDouble(args[0]);
        System.out.println(theta);
        double sinTheta = Math.sin(theta);
        double cosTheta = Math.cos(theta);
        double trigAddResult = sinTheta * sinTheta + cosTheta * cosTheta;

        System.out.println(trigAddResult);
    }
}
