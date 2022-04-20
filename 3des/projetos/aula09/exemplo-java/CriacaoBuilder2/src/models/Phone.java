package models;

//Classe Phone encapsulada e com um metodo construtor com todos os campos obrigatórios
//Não tem o construtor vazio

public class Phone {

	private String os;
	private String processor;
	private double screenSize;
	private int batery;
	private int camera;

	public Phone(String os, String processor, double screenSize, int batery, int camera) {
		this.os = os;
		this.processor = processor;
		this.screenSize = screenSize;
		this.batery = batery;
		this.camera = camera;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public int getBatery() {
		return batery;
	}

	public void setBatery(int batery) {
		this.batery = batery;
	}

	public int getCamera() {
		return camera;
	}

	public void setCamera(int camera) {
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", screenSize=" + screenSize + ", batery=" + batery
				+ ", camera=" + camera + "]";
	}

}
