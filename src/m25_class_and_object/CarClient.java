package m25_class_and_object;

public class CarClient {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.make = "Honda";
        car1.model = "CRV";
        car1.year = 2015;
        car1.color = "White";
        car1.price = 30_000;

        car1.currentSpeed =180;
        car1.speedLimit = 200;

        car1.start("Honda", "CRV");
        car1.drive("Honda", "CRV");
        car1.stop("Honda", "CRV");

        car1.showCurrentSpeed(180,110);
        System.out.println("=================================");
        System.out.println(car1);

        Car car2 = new Car();

       // car2.stop();
        car2.make = "KIA";
        car2.model = "Sportage";
        car2.year = 2013;
        car2.color = "White";
        car2.price = 500_000;

        car2.currentSpeed =187;
        car2.speedLimit = 500;

        car2.showCurrentSpeed(155,156);

        car2.start("KIA", "Sportage");
        car2.drive("KIA", "Sportage");
        car2.stop("KIA", "Sportage");

        System.out.println(car2);
    }
}
