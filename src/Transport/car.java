package Transport;

public class car extends vehicles{
    public int noOfDoors;
    public String transmissionType;
    car(String name, String model, int noOfTires, int noOfDoors, String transmissionType){
        super(name, model, noOfTires);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }
    public void startAC(){
        System.out.println("started AC of " + name + " " + model);
    }
}
