public class ZinsDemo {

    public static void main(String[] args) {

        System.out.println("Erhaltene Zinsen in Höhe von:" + " " + BerechneZinsen(1000, 2.25));
    }

    public static double BerechneZinsen (double kontostand, double zinsen) {
       return ((kontostand/100)*zinsen);
    };
}
