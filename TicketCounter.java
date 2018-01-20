import java.util.*;
 class Ticket
 {
	 private String StartingPoint;
	 private String EndingPoint;
	 public void setPoint(String StartingPoint, String EndingPoint){
		this.StartingPoint = StartingPoint;
		this.EndingPoint= EndingPoint;
	 }
	 public void printStops(){
		System.out.println(" "+StartingPoint+" \n "+EndingPoint);
	 }
 

  List listOfStops = new ArrayList();
  listOfStops.add("Chennai Beach");
	listOfStops.add("Chennai Fort");
listOfStops.add("Chennai Park");
 listOfStops.add("Chennai Egmore");
	listOfStops.add("Chetpet");
listOfStops.add("Nungabakkam");
 listOfStops.add("Kodambakkam");
	listOfStops.add("Mambalam");
listOfStops.add("Saidapet");
 listOfStops.add("Guindy");
	listOfStops.add("St. ThomasMount");
listOfStops.add("Pazhavathangal");
 listOfStops.add("Meenambakkam");
	listOfStops.add("Trisulam");
listOfStops.add("Pallavaram");
 listOfStops.add("Chromepet");
	listOfStops.add("Tambaram Sanatorium");
listOfStops.add("Tambaram");
int start,end;
for(Object object : listOfStops) {
    String element = (String) object;
	if(listOfStops.contain(StartingPoint)){
		start=listOfStops.indexOf(StartingPoint);
	}
	if (listOfStops.contains(EndingPoint))
	{
		end=listOfStops.indeOf(EndingPoint)
	}
}
   public static final constStops=5;
   public static final baseFare=10;
   public static final ExtraCharge=5;

	int noOfStops = start-end;
//	int fareForStops=(noOftops-constStops)/constStops;
//	int totalFare=Math.ceil(fareForStops)*EtraCharge+baseFare;
	public int totalTicketFare(int noOfStops){
		int fareForStops=(noOftops-constStops)/constStops;
		int totalFare=Math.ceil(fareForStops)*ExtraCharge+baseFare;
		return toatlFare;
	}

 }
/* class TicketCounter
 {
  ArrayList<String> ListofStops = new ArrayList<String>(Arrays.asList(new String[] {"ChennaiBeach","ChennaiFort","ChennaiPark","Chennai Egmore"}));
 	   ArrayList<String> ListofStops = new ArrayList<String>(Arrays.asList(new String[] {"ChennaiBeach","ChennaiFort","ChennaiPark","Chennai Egmore"}));
	    Iterator itr=ListofStops.iterator(); 
		 while(itr.hasNext()){  
   System.out.println(itr.next());  
  } 
 }*/
 class Main
 {
	 public static void main(String args[]){
		
		Date date = new Date();
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
		Ticket ticketObj= new Ticket();
		ticketObj.printStops();
		System.out.println(noOfStops +" stops");
		//System.out.println(totalFare);
		ticketObj.totalTicketFare();

  }
	 }
 }