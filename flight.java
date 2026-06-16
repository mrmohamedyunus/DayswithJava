public class flight{
    public static void main(String[] args);
    String beacon = "  nav-beacon: MANILA-2026  ";
    String cleanCity = beacon.trim().split(":")[1].split("-")[0].toLowerCase();
}