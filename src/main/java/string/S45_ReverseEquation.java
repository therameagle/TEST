package string;
public class S45_ReverseEquation {
    static String reverseEqn(String str) {
        StringBuilder sb = new StringBuilder();
        String[] sarr = str.split("(?<=[-+*/])|(?=[-+*/])");
        for (int i = sarr.length - 1; i >= 0; i--) {
            sb.append(sarr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String eq1 = "20-3+5*2";
        String eq2 = "100+200*3-50/5";
        String eq3 = "5*4+3-2";
        System.out.println("Original: " + eq1);
        System.out.println("Reversed: " + reverseEqn(eq1));
        System.out.println();
        System.out.println("Original: " + eq2);
        System.out.println("Reversed: " + reverseEqn(eq2));
        System.out.println();
        System.out.println("Original: " + eq3);
        System.out.println("Reversed: " + reverseEqn(eq3));
    }
}