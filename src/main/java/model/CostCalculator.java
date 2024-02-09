package model;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Feb 8, 2024
 */
public class CostCalculator {
	private double gasPrice;
	private double tankCapacity;
	private double tripDistance;
	private double milesPerGallon;
	private String startPoint;
	private String endPoint;

	public CostCalculator() {
		super();
	}
	public CostCalculator(String startPoint, String endPoint, double tripDistance) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.tripDistance=tripDistance;
	}
	
	public CostCalculator(double gasPrice, double tankCapacity, double tripDistance, double milesPerGallon, String startPoint, String endPoint) {
		this();
		this.gasPrice = gasPrice;
		this.tankCapacity = tankCapacity;
		this.tripDistance = tripDistance;
		this.milesPerGallon = milesPerGallon;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		if (milesPerGallon <= 0) {
			throw new IllegalArgumentException("Miles Per Gallon cannot be zero or negative.");
		}
		if (tankCapacity <= 0) {
			throw new IllegalArgumentException("Tank Capacity cannot be zero or negative.");
		}
	}
		
	public double calculateGallonsPerTrip() {
		double gallonsPerTrip = 0.0;
		gallonsPerTrip = this.getTripDistance()/this.getMilesPerGallon();
		return gallonsPerTrip;
	}
	
	public double calculateTripFuelCost() {
		double fuelCost = 0.0;
		fuelCost = this.getGasPrice()*calculateGallonsPerTrip();
		return fuelCost;
	}
	
	public double calculateTanksPerTrip() {
		double tanksPerTrip = 0.0;
		tanksPerTrip = calculateGallonsPerTrip()/this.getTankCapacity();
		return tanksPerTrip;
	}
	
	public double calculatePricePerTank() {
		double tankCost = 0.0;
		tankCost = this.getGasPrice()*this.getTankCapacity();
		return tankCost;
	}

	public double getGasPrice() {
		return gasPrice;
	}

	public void setGasPrice(double gasPrice) {
		this.gasPrice = gasPrice;
	}

	public double getTankCapacity() {
		return tankCapacity;
	}

	public void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
	}

	public double getTripDistance() {
		return tripDistance;
	}

	public void setTripDistance(double tripDistance) {
		this.tripDistance = tripDistance;
	}

	public double getMilesPerGallon() {
		return milesPerGallon;
	}

	public void setMilesPerGallon(double milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	@Override
	public String toString() {
		return "CostCalculator [gasPrice=" + gasPrice + ", tankCapacity=" + tankCapacity + ", tripDistance="
				+ tripDistance + ", milesPerGallon=" + milesPerGallon + ", startPoint=" + startPoint + ", endPoint="
				+ endPoint + "]";
	}
	
	


}
