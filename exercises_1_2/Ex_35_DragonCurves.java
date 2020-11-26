package exercises_1_2;

public class Ex_35_DragonCurves {
    private static String reverseDragonCurve(String in) {
        StringBuilder revBuilder = new StringBuilder(in);
        revBuilder.reverse();
        for (int i = 0; i < revBuilder.length(); i++) {
            if (revBuilder.charAt(i) == 'L') {
                revBuilder.setCharAt(i, 'R');
            }
            else if (revBuilder.charAt(i) == 'R') {
                revBuilder.setCharAt(i, 'L');
            }
        }
        return revBuilder.toString();
    }

    public static void main(String[] args) {
        String dCurve0 = "F";
        String dCurve1 = dCurve0 + "L" + dCurve0;
        String dCurve2 = dCurve1 + "L" + reverseDragonCurve(dCurve1);
        String dCurve3 = dCurve2 + "L" + reverseDragonCurve(dCurve2);
        String dCurve4 = dCurve3 + "L" + reverseDragonCurve(dCurve3);
        String dCurve5 = dCurve4 + "L" + reverseDragonCurve(dCurve4);

        System.out.println(dCurve0);
        System.out.println(dCurve1);
        System.out.println(dCurve2);
        System.out.println(dCurve3);
        System.out.println(dCurve4);
        System.out.println(dCurve5);
    }
}
