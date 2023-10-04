package fundamentals;

public class SmartMobile extends IntermediatePhones {
	private String build;
	private String os;
	private String chipset;
	private String gpu;
	private String backCamera;
	private String bluetooth;
	
	public SmartMobile(String company, String model, String technology, int year, String sim, boolean cardSlot,
			boolean camera, boolean loudspeaker, int batteryType, double standByHorse, double talkTime,
			String displayType, int resolution, int internalMemory, String backCamera, boolean b, String features,
			String build, String os, String chipset, String gpu, String backCamera2, String bluetooth) {
		super(company, model, technology, year, sim, cardSlot, camera, loudspeaker, batteryType, standByHorse, talkTime,
				displayType, resolution, internalMemory, backCamera, b, features);
		this.build = build;
		this.os = os;
		this.chipset = chipset;
		this.gpu = gpu;
		backCamera = backCamera2;
		this.bluetooth = bluetooth;
	}

	@Override
	public String toString() {
		return  super.toString() + "\nBUILD: " + build + " \nOS" + os + "\nCHIPSET: " + chipset + "\nGPU: " + gpu + "\nBACKCAMERA: "
				+ backCamera + "\nBLUETOOTH: " + bluetooth;
	}

	
	
}
