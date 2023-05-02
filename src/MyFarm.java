import java.util.ArrayList;

public class MyFarm {

    ArrayList<Plot> row;


    public static void main(String[] args) {

      MyFarm LettuceCode = new MyFarm();
    }

    public MyFarm(){

        row = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            row.add(new Plot());
        }

//        for(int x = 0; x < row.size(); x++){
//            row.get(x).printPlotInfo();
//        }

        System.out.println();
        totalPlants();
        System.out.println();
        printPlantName();
        System.out.println();
        printRowInfo();
        System.out.println();
        addLettuce();
        System.out.println();
        addTulip();
        System.out.println();
        tomatoLocations();
        System.out.println();
        totalCarrots();
        System.out.println();
        averageNumberOfPlants();
        System.out.println();
        numberOfCarrotPlots();
        System.out.println();
        numberOfEmptyPlots();
        System.out.println();
        everyOtherNeedsWater();
        System.out.println();
        greaterThan10();




    }//MyFarm is the constructor method

//Practice problems
    public void totalPlants(){
        int total = 0;
        System.out.println("***TOTAL PLANTS***");
        for (int t = 0; t < row.size(); t++){
            total = total + row.get(t).numberOfPlants;
        }

        System.out.println("There are a total of " + total + " plants in the plot.");
    }
    public void printPlantName(){

        System.out.println("***PLANT NAME***");
        for (int p = 0; p < row.size(); p++){
            System.out.println(p + ":" + row.get(p).plantName);
        }
    }
    public void printRowInfo() {
        System.out.println("***ROW INFO***");
        for (int r = 0; r < row.size(); r++) {
            row.get(r).printPlotInfo();
        }
    }
    public void addLettuce(){
        printPlantName();
        System.out.println("***ADD LETTUCE***");
        row.add(new Plot());
        row.get(10).plantName = "lettuce";
        row.get(10).numberOfPlants = 42;
        row.get(10).needsWater = true;
        printPlantName();
    }
    public void addTulip(){
        printPlantName();
        System.out.println("***ADD TULIP***");
        row.get(3).plantName = "tulip";
        row.get(3).numberOfPlants = 70;
        row.get(3).needsWater = false;
        printPlantName();
    }
    public void tomatoLocations() {
        for (int c = 0; c < row.size(); c++) {
            if (row.get(c).plantName == ("tomato")) {
                System.out.println(c);
            }
        }
    }
    public void totalCarrots(){
        System.out.println("***TOTAL CARROTS***");
        int total = 0;
        for(int c = 0; c < row.size(); c++){
            if(row.get(c).plantName == ("carrot")){
                total = total + row.get(c).numberOfPlants;
            }
        }
        System.out.println("There are a total of: " + total + " carrots in the garden");
    }
    public void averageNumberOfPlants(){
            System.out.println("***AVERAGE NUMBER OF PLANTS***");
            int total = 0;
            int average;
            for(int t = 0; t < row.size(); t++){
                total = total + row.get(t).numberOfPlants;
            }
            average = total/row.size();
            System.out.println("There is an average of " + average + " plants.");

    }
    public void numberOfCarrotPlots() {
        System.out.println("***TOTAL NUMBER OF CARROT PLOTS***");
        int total = 0;
        for(int c = 0; c < row.size(); c++){
            if(row.get(c).plantName == ("carrot")){
                total = total + 1;
            }
        }
        System.out.println("There are " + total + " carrot plots");
    }
    public void numberOfEmptyPlots(){
        System.out.println("***TOTAL EMPTY PLOTS***");
        int total = 0;
        for(int c = 0; c < row.size(); c++){
            if(row.get(c).plantName == ("empty")){
                total = total + 1;
            }
        }
        System.out.println("There are " + total + " empty plots");
    }
    public void everyOtherNeedsWater(){
        for (int w = 0; w < row.size(); w += 2){
            row.get(w).needsWater = false;
        }
    }
    public void greaterThan10(){
        int total = 0;
        for(int g = 0; g < row.size(); g++){
            if(row.get(g).numberOfPlants > 10){
                total = total + 1;
            }
        }
        System.out.println("There are " + total + " plots with more than 10 plants.");
    }

}
