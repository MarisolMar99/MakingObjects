public class Car extends Vehicle
{
    private int numberOfDoors;

    public Car(int speed, double fuel, int numberOfDoors)
    {
        super(speed, fuel);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start()
    {
        System.out.println("The car has started. Vroom Vroom!");
    }

    public void honk()
    {
        System.out.println("Beep! Beep!");
    }

    //Getter and Setter for number of doors
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors)
    {
        this.numberOfDoors = numberOfDoors;
    }
}