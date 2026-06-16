public class day1pot {
    public static void main(String[] args) {
        int pot = 500;
        //double
        pot *= 2;
        //add 1000
        pot += 1000;

        int finalpot = (int)(pot*0.95);
        System.out.println(finalpot);
        //only int no float
    }
}
