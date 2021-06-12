package SouthWind.s011;

public class F1Race {
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void startRace(){
        this.car.engine();
    }
}
