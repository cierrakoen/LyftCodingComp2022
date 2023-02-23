import java.util.*;
public class Q4 {
    public static class halfHour{
        ArrayList<Double> pricesAndDistance = new ArrayList<>();
        
        halfHour(){
            
        }
        public void addInfo(Double price, Double mile){
            pricesAndDistance.add(price);
            pricesAndDistance.add(mile);
        }
        public ArrayList<Double> getRates(){
            ArrayList<Double> newPrices = new ArrayList<>();
            for(int i=0;i<pricesAndDistance.size();i+=2){
                newPrices.add(pricesAndDistance.get(i)/pricesAndDistance.get(i+1));
            }
            return newPrices;
        }
        
        public Double findMax(ArrayList<Double> p){
            Collections.sort(p);
            return p.get(p.size()-1);
        }
        
        
    }
    public static void main(String[] args) {
        //holds max rates from each half hour
        ArrayList<Double> dayRates = new ArrayList<>();
        //halfhour object
        halfHour first = new halfHour();
        //adding info to the half hour
        first.addInfo(11.23,6.2);
        first.addInfo(15.68,10.2);
        //adding the max rate from the first half hour to this array
        dayRates.add(first.findMax(first.getRates()));
        //sorting the arraylist that contains all max rates from all halfhours
        Collections.sort(dayRates);
        //the overall maximum rate over the whole day
        System.out.printf("$%.2f is the max rate of the day!\n", dayRates.get(dayRates.size()-1));
    }
}
