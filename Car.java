/**
 * Lab 10 Car class
 * @author Albert Giles
 *
 */

public class Car extends Vehicle{
	
	private int numDoors;
	private int numPassengers;
	
	public Car(String aMake, String aModel, String aPlate, int doors, int 
		passengers){
		super(aMake, aModel, aPlate);
		this.numDoors = doors;
		this.numPassengers = passengers;
	}

	public int getnumDoors() {
		return this.numDoors;
	}
	
	public int getnumPassengers() {
		return this.numPassengers;
	}
	
	@Override
	public String toString() {
		String result = "";
		result = String.format("%d-door %s %s with license %s", this.numDoors, 
			super.getMake(),
		super.getModel(), super.getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Car)) {
			return false;
		}
		
		Car other = (Car) obj;
		
		if(this.numDoors == other.numDoors) {
			if(this.numPassengers == other.numPassengers) {
				return super.equals(obj);
			}
		}
		
		return false;
	}
		
	
	
	public Car copy() {
		String aMake = super.getMake();
		String aModel = super.getModel();
		String aPlate = super.getPlate();
		
		int numDoors = this.getnumDoors();
		int numPassengers = this.getnumPassengers();
	
		Car theCopy = new Car(aMake, aModel, aPlate, numDoors, numPassengers);
		return theCopy;
	}
}