import java.util.*;

import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;
public class Main {
   static Constants constants = new Constants();
   static ArrayList<Potion> inventory = new ArrayList<Potion>();
   public static int gold = 0;
   public static int ing1 = 0;
   public static int ing2 = 0;
   public static int ing3 = 0;
   public static int ing4 = 0;
   public static int ing5 = 0;
   public static int ing6 = 0;
   public static int ing7 = 0;
   public static int labLevel = 0;
   
    public static void main(String[] args) throws Exception {
      

        ArrayList<String> hi = new ArrayList<String>();
        ArrayList<String> hi2 = new ArrayList<String>();
        
        Potion potion1 = new Potion("Healing Potion",5,123,hi);
        Potion potion2 = new Potion("Attacking Potion",3,321,hi2);


        
       

        Potion slot1 = potion1;
       // System.out.println(inventory[0] == potion1.getSteps());
        //inventory[0] = potion2;
       // System.out.println(inventory[0]);
       Menu();
       
        
    }
    public static void Menu(){
        System.out.println("DO YOU WANT TO (1)Craft Potion (2)Sell Potion (3)Upgarde Shop or (4)Find Ingredients");
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter Number ->");
        int MenuChoice = inputScanner.nextInt();
        switch (MenuChoice) {
            case 1:
                CraftPotion();
                break;
            case 2:
                SellPotion();
                break;
            case 3:
                UpgradeShop();
                break;
            case 4:
                FindIngredients();
                break;
            default:
                Menu();
                break;
        }

    }
    public static void CraftPotion(){ 
        System.out.println("Time to craft a potion");
        boolean crafting = true;
        ArrayList<String> craftLog = new ArrayList<String>();  
        while(crafting){
            System.out.println("Choose your first step : \n -add ingredient, format is(add num) \n -stir \n -add heat \n -finish");
            Scanner inpScanner = new Scanner(System.in);
            String stepChoice = inpScanner.nextLine();
            switch (stepChoice) {
                case "add 1":
                    craftLog.add("add 1");
                    ing1--;
                    break;
                case "add 2":
                    craftLog.add("add 2");
                    ing2--;
                    break;
                case "add 3":
                    craftLog.add("add 3");
                    ing3--;
                    break;
                case "add 4":
                    craftLog.add("add 4");
                    ing4--;
                    break;
                case "add 5":
                    craftLog.add("add 5");
                    ing5--;
                    break;
                case "add 6":
                    craftLog.add("add 6");
                    ing6--;
                    break;
                case "add 7":
                    craftLog.add("add 7");
                    ing7--;
                    break;
                case "stir":
                    craftLog.add("stir");

                    break;
                case "add heat":
                    craftLog.add("add heat");
                    
                    break;
                case "finish":
                    crafting = false;
                    break;
                default:
                    break;   
            }


            System.out.println(craftLog);
            
        }

        for(int i = 1; i <= 19; i++ ){
            //System.out.println(craftLog.equals(constants.getPotionLiszt(i)));
            //System.out.println(constants.getPotionLiszt(i));
            if(craftLog.equals(constants.getPotionLiszt(i))){
                inventory.add(constants.getPotion(i));
                System.out.println(i + " is the number of potion you made");
            }
        }
        System.out.println("Finished Crafting, returning to menu");
        sleep(0.5);
        Menu();
    }
    public static void SellPotion(){
        System.out.println(inventory);
        System.out.println("Which potion do you want to sell (they begin at 1)");
        Scanner inputScanner = new Scanner(System.in);
        int potionChoice = inputScanner.nextInt();
        inventory.remove(potionChoice - 1);
        System.out.println("You gained 100 Gold");
        sleep(0.5);
        gold += 100;
        Menu();
    }
    public static void UpgradeShop(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("What would you like to Upgrade!");
        System.out.println("(1) Upgrade to lab to level " + labLevel);
        int building = inputScanner.nextInt();
        switch (building) {
            case 1:
                labLevel ++;
                gold -= 100*labLevel;
                System.out.println("You have " + gold + " gold");
                Menu();
                break;
        
            default:
                Menu();
                break;

        }
    }
    public static void FindIngredients(){
        System.out.println("Searching.");
        sleep(0.5);
        System.out.println("Searching..");
        sleep(0.5);
        System.out.println("Searching...");
        sleep(0.5);
        System.out.println("You found some ingredients");
        ing1 ++;
        ing2 ++;
        ing3 ++;
        ing4 ++;
        ing5 ++;
        ing6 ++;
        ing7 ++;
        sleep(0.5);
        Menu();

    }
    
    public static void sleep(double seconds) {
        int miliseconds = (int) (seconds * 1000);
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
