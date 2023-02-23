import java.util.*;
public class Q3 {
    public static class Accident{
        Float time;
        String loc;
        Accident(Float time, String loc){
            this.time = time;
            this.loc = loc;
        }
        public void compareTime(Driver d, String loc){
            float timedif = (float) .30;
            if((d.getTime(loc)>=this.time-timedif) && (d.getTime(loc)<=this.time+timedif)){
                d.addImpact(loc,this.time);
            }
        }
    }
    public static class Driver{
        int id;
        HashMap<String,Float> info = new HashMap<>();
        Driver(int id){
            this.id=id;
        }
        public void addImpact(String location, Float time){
            this.info.put(location,time);
        }
        public HashMap<String, Float> getImpact(){
            return info;
        }
        public void addInfo(String loc, Float time){
            info.put(loc,time);
        }
        public Float getTime(String loc){
            return info.get(loc);
        }
        public int getID(){
            return this.id;
        }
        public void IDnum(){
            if(info.isEmpty()){
                System.out.println(getID()+":");
            }else{
                System.out.println(getID() + ": "+ getImpact());
            }
        }
    }
    public static void main(String[] args) {
        Driver first = new Driver(100);
        first.addInfo("Kensington",(float)20.30);
        Accident example = new Accident((float) 20.30,"Kensington");
        example.compareTime(first,"Kensington");
        
        Driver second = new Driver(200);
        
        ArrayList<Driver> employees = new ArrayList<>();
        
        employees.add(first);
        employees.add(second);
        //will print if 
        first.IDnum();
        second.IDnum();

    }
    
}
