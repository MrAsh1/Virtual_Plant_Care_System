package VirtualPlant;

public class Rose extends Plant{
    public Rose(String Name){
        super(Name);
    }

    @Override
    public void Grow(){
    if(getWaterLevel()>=3 && getSunlightLevel()>=3){
        setGrowthStage("Grown");
    }
    else if(getWaterLevel()<=2){
        setGrowthStage("Withered");
    }
    else{
        setGrowthStage("Seedling");
    }
    }

    @Override
    public void Care(String Action){
        switch (Action.toLowerCase()){
            case "water":
                setWaterLevel(getWaterLevel()+1);
            break;
            case "sunlight":
                setSunlightLevel(getSunlightLevel()+1);
            break;
            case "fertilize":
                setSunlightLevel(getSunlightLevel()+1);// let fertilizer increase the Sunlight Absorption.
            break;
            default:
                System.out.println("Invalid Action for Rose");
        }
    }
}
