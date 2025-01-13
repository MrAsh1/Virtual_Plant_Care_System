package VirtualPlant;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        VirtualGarden MyGarden = new VirtualGarden();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Virtual Garden!!");
        boolean running=true;

        while(running){
            System.out.println("/n Menu:");
            System.out.println("1.Add Plant");
            System.out.println("2.Stimulate Day");
            System.out.println("3.Care for Plant");
            System.out.println("4.Exit");
            System.out.println("Choose an Option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter the Type [Cactus,Fern,Rose]: ");
                    String type = sc.nextLine();
                    System.out.println("Enter Name");
                    String Name = sc.nextLine();

                    Plant plant = switch (type.toLowerCase()){
                        case "cactus"->new Cactus(Name);
                        case "fern"->new Fern(Name);
                        case "rose"-> new Rose(Name);
                        default -> null;
                    };

                    if (plant!=null){
                        MyGarden.AddPlant(plant);
                        System.out.println(type + " named "+Name+" added to the Garden.");
                    } else{
                        System.out.println("Invalid Plant");
                    }
                    break;
                case 2:
                    MyGarden.SimulateDay();
                    break;
                case 3:
                    System.out.println("Enter the name of the Plant: ");
                    String PlantName = sc.nextLine();
                    System.out.println("Enter the Care [water,sunlight,fertilize]");
                    String Care = sc.nextLine();
                    MyGarden.CareForPlant(PlantName,Care);
                    break;
                case 4:
                    running=false;
                    break;
                default:
                    System.out.println("Invalid Choice, please try again");
            }

        }
        System.out.println("Thank you for using Virtual Plant Care Sytem");
    }
}