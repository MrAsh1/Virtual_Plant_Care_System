package VirtualPlant;

public class Fern extends Plant{
    public Fern(String Name){
        super(Name);
    }

    @Override
    public void Grow(){
    if(getWaterLevel()>=2 && getSunlightLevel()>=2){
        setGrowthStage("Grown");
    }
    else{
        setGrowthStage("Seedling");
    }
    }

    @Override
    public void Care(String Action){
    switch (Action.toLowerCase()){
        case ("water"):
            setWaterLevel(getWaterLevel()+1);
        break;
        case ("sunlight"):
            setSunlightLevel(getSunlightLevel()+1);
        break;
        default:
            System.out.println("Invalid Action for Fern");
    }
    }
}
