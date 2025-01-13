package VirtualPlant;
import java.util.ArrayList;
import java.util.List;

public class VirtualGarden {
    private List<Plant>plants;
    private int CurrentDay;

    public VirtualGarden(){
        plants = new ArrayList<>();
        CurrentDay=0;
    }

    public void AddPlant(Plant plant){
        plants.add(plant);
    }

    public void SimulateDay(){
        CurrentDay++;
        System.out.println("Day "+ CurrentDay+" :");
        for (Plant plant :plants){
            plant.Grow();
            System.out.println(plant.getName()+" is at "+ plant.getGrowthStage()+ " Stage");
        }
    }

    public void CareForPlant(String Name,String Action){
        for (Plant plant:plants){
        if(plant.getName().equalsIgnoreCase(Name)){
            plant.Care(Action);
            System.out.println(plant.getName()+" cared "+Action+",");
        }else{
            System.out.println("Plant not Found!!");
        }
        }
    }
}
