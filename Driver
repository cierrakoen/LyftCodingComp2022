import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Driver {
    public static class DrDriver {
        protected int id;
        protected String location;
        protected float times;
        
        public static void main(String[] args) {
            //outer map
            HashMap<Integer, HashMap<String,Float>> Dmap = new HashMap<>();
            //inner map
            HashMap<String, Float> loc2Time = new HashMap<String, Float>();
            //driver object
            DrDriver first = new DrDriver(200,"Kensington", (float) 20.45);
            //adding drivers:
            addDriver(Dmap,loc2Time,first);
            //deletion
            
            System.out.println(printDriverInfo(first));
            first.remLocal(first.getLocal());
            System.out.println(printDriverInfo(first));
        }
        
         DrDriver(int id, String location, Float times) {
            this.id = id;
            this.location = location;
            this.times = times;
            
        }
        
        //methods for ids
        public int getID() {
            return id;
        }
        
        public void setID(int id) {
            this.id = id;
        }
        public void remID(int id) {
            this.id = Integer.parseInt(null);
        }
        
        //methods for local
        public String getLocal(){
            return location;
        }
        public void setLocal(String location) {
            this.location = location;
        }
        public void remLocal(String location) {
            this.location = null;
        }
    
        //methods for times
        public void setTime(Float times) {
            this.times = times;
        }
        public Float getTime(){
            return times;
        }
        public void remTime(Float times){
            this.times = Float.parseFloat(null);
        }
        
        
        public static void addDriver(HashMap<Integer, HashMap<String, Float>> map, HashMap<String,Float> inner, DrDriver steve){
            inner.put(steve.getLocal(),steve.getTime());
            map.put(steve.getID(),inner);
        }

        public static Set<Object> printDriverInfo(DrDriver x){
            Set<Object> info = new HashSet<Object>();
            info.add(x.getID());
            info.add(x.getLocal());
            info.add(x.getTime());
            
            return info; 
        }
        
    }
    
}
