public class Athlete {
    
   private String name;
   private int speed;
   private int bibNumber;
    static int count;
    static String location = "New York";
    static String startTime = "9.00am";
    
    Athlete (String name, int speed){
   	 this.name = name;
   	 this.speed = speed;
   	 count++;
   	 this.bibNumber=count;   	 
    }
    
    public static void main(String[] args) {
   	 Athlete john = new Athlete("John", 10);
   	 Athlete sarah = new Athlete("Sarah", 11);
   	 
   	 System.out.println(sarah.name + "'s bib number is " +sarah.bibNumber);
   	 System.out.println("Total number of athletes is "+count);
   	 location = "San Diego";
   	 System.out.println(john.name+" is running in "+ john.location);
 	john.location = "Chicago";
   	 System.out.println(sarah.name + " is running in " + sarah.location);
 
    }
}
//Show that the static variables belong to the class and the other variables belong to the instance.
 
//Show what happens to the variables when the 2 constructors run, especially how count changes and when bib number is assigned. 
 
//Show how you can update the location and this is updated for all the athletes.
