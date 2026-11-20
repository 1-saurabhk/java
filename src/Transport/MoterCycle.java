package Transport;

public class MoterCycle extends vehicles {
    public String handleBarStyle;
    public String suspensioneType;

    MoterCycle(String name, String model, int noOfTyres, String handleBarStyle, String suspensioneType){
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensioneType = suspensioneType;
    }
    public void wheelie(){
        System.out.println("");
    }
}
