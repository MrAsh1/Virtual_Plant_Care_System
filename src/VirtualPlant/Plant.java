package VirtualPlant;

public abstract class  Plant {
    private String Name;
    private int WaterLevel;
    private int SunlightLevel;
    private String GrowthStage;

    public Plant(String Name){
        this.Name=Name;
        this.WaterLevel=0;
        this.SunlightLevel=0;
        this.GrowthStage="Seedling";
    }

    public abstract void Grow();
    public abstract void Care(String Action);

    //Getter and Setter Methods
    public String getName(){
        return Name;
    }

    public void setWaterLevel (int WaterLevel){
        this.WaterLevel=WaterLevel;
    }
    public int getWaterLevel(){
        return WaterLevel;
    }

    public void setSunlightLevel (int SunlightLevel){
        this.SunlightLevel=SunlightLevel;
    }
    public int getSunlightLevel(){
        return SunlightLevel;
    }

    public String getGrowthStage(){
        return GrowthStage;
    }
    public void setGrowthStage(String GrowthStage){
        this.GrowthStage=GrowthStage;
    }
}
