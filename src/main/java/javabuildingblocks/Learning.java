public class Learning {
    private static String hi;

    public static void main(String[] args) {
        System.out.println("Hi = " + hi);

        // variable garbage collection eligibility
        String one = "a";
        String two = "b";
        one = two;
        String three = one;
        one = null;
        System.gc();
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
