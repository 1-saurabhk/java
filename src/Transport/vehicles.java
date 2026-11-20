package Transport;

public class vehicles {
    public String name;
    public String model;
    public int noOfTires;

    vehicles(){
        this.name = "";
        this.model = "";
        this.noOfTires = -1;
    }

    vehicles(String name, String model, int noOfTires){
        this.name = name;
        this.model = model;
        this.noOfTires = noOfTires;
    }
    void start_engine(){

        System.out.println(name + " " + model + " starting");
    }
    void stop_engine(){

        System.out.println(name + " " + model + " stoping");
    }
}
