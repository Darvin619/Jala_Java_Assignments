package javaBasics;

//Below is the Car Class with variables as Specifications
public class CAR {
	
	String Company;
	int Model;
	String Price;
	String Milage;
	
	//Creating a Consturcto to initialize the CAR
	public CAR(String Company, int Model, String Price, String string) {
		this.Company=Company;
		this.Model=Model;
		this.Price=Price;
		this.Milage=string;
	}
	
	//Creating info as Method
	
	public void Info() {
		System.out.println("Comapany Name : " + Company);
		System.out.println("Model Name : " + Model);
		System.out.println("Price : " + Price);
		System.out.println("Milage : " + Milage);
	}

	public static void main(String[] args) {
		
		//Creating Ford,Benz,Audi as objects
		
		CAR Ford = new CAR("Ford", 2022, "25Lacs", "10.2LKM");
		CAR Benz = new CAR("Benz", 2022, "30Lacs", "10.2LKM");
		CAR Audi = new CAR("Audi", 2022, "20Lacs", "10.2LKM");
		
		System.out.println("Ford Car Information:");
		Ford.Info();
		System.out.println(" ");
		System.out.println("Benz Car Information:");
		Benz.Info();
		System.out.println(" ");
		System.out.println("Audi Car Information:");
		Audi.Info();

	}

}
