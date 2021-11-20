package day32_array;

public class AWS {
    public static void main(String[] args) {
     String app="etsy";
     String zones="us-east-1, us-west-1, us-west-2, us-west-3";
     String [] allZones=zones.split(","); //optional, same as below
     for(String each : zones.split(",")){ //for(String each : allZones)){
         System.out.println("Deploying " +app+ " to " + each);
     }
for(int i=0; i<allZones.length; i++){//traditional loop:
    System.out.println("Deploying " +app+ " to " + allZones[i]);
}











    }
}
