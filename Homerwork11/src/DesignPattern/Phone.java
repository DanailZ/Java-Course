package DesignPattern;

public class Phone extends Device {
	
	private String memory;

	public Phone() {
		super();
	}
	
	public Phone(String model, String brand, String memory) {
		super(model, brand);
		this.memory = memory;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}
	
	public void infoAboutDevice(){
		System.out.println("The model: " + getModel() + " The brand: " + getBrand() + " Memory: " + getMemory());
	}

}
