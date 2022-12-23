public class BinOps {
    public String sum(String a, String b) {
        int operand1 = Integer.parseInt(a, 2);
        int operand2 = Integer.parseInt(b, 2);
        int result = operand1 + operand2;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int operand1 = Integer.parseInt(a, 2);
        int operand2 = Integer.parseInt(b, 2);
        long result = operand1 * operand2;
        return Long.toBinaryString(result);
    }
}