public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("100 + 11 = " + bins.sum("100", "11"));
        System.out.println("101 + 11 = " + bins.sum("101", "11"));
        System.out.println("11 * 11 = " + bins.mult("11", "11"));
    }
}
