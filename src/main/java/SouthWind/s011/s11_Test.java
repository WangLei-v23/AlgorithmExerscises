package SouthWind.s011;

public class s11_Test {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        Tesla tesla = new Tesla();
        BugattiVeyron bugattiVeyron = new BugattiVeyron();
        F1Race f1Race = new F1Race();
        f1Race.setCar(ferrari);
        f1Race.startRace();
        f1Race.setCar(tesla);
        f1Race.startRace();
        f1Race.setCar(bugattiVeyron);
        f1Race.startRace();
    }
}
