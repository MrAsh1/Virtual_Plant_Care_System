package VirtualPlant;

public class Cactus extends Plant {
    public Cactus(String Name){
        super(Name);
    }
    @Override
    public void Grow(){
       if (getSunlightLevel()>3 && getWaterLevel()<5){
           setGrowthStage("Grown");
       }
       else if (getWaterLevel()>=5){
           setGrowthStage("Over Watered");
       }
       else {
           setGrowthStage("Seedling");
       }
    }
    @Override
    public void Care(String Action){
        switch (Action.toLowerCase()){
            case "water":
                setWaterLevel(getWaterLevel()+ 1);
            break;
            case "sunlight":
                setSunlightLevel(getSunlightLevel()+1);
            break;
            default:
                System.out.println("Invalid Action for Cactus");
        }
    }
}
