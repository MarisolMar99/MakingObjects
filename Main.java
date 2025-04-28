public class Main
{
    public static void main(String [] args)
    {
        Car car = new Car(65, 15.0, 4);
        System.out.println("Testing Car:");
        car.start();
        car.displayFuel();
        car.honk();
        System.out.println("Number of doors: " + car.getNumberOfDoors());
        car.stop();

        System.out.println();

        //Bicycle test
        Bicycle bike = new Bicycle(20, 0.0, true);
        System.out.println("Testing Bicycle:");
        bike.start();
        bike.displayFuel();
        bike.ringBell();

        System.out.println();

        System.out.println("Testing access modifiers:");
        System.out.println("Bike fuel (via getter): " + bike.getFuel());

        car.setSpeed(85);
        System.out.println("Car speed after change: " + car.getSpeed());
    }
}