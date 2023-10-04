package fundamentals;

public class IntermediatePhones extends BasicMobile {
	private String displayType;
	private int resolution;
	private int internalMemory;
	private String backCamera;
	private boolean radio;
	private String features;
	
	public IntermediatePhones(String company, String model, String technology, int year, String sim, boolean cardSlot,
			boolean camera, boolean loudspeaker, int batteryType, double standByHorse, double talkTime,
			String displayType, int resolution, int internalMemory, String backCamera, boolean b, String features) {
		super(company, model, technology, year, sim, cardSlot, camera, loudspeaker, batteryType, standByHorse,
				talkTime);
		this.displayType = displayType;
		this.resolution = resolution;
		this.internalMemory = internalMemory;
		this.backCamera = backCamera;
		this.radio = b;
		this.features = features;
	}

	@Override
	public String toString() {
		return super.toString() +  "\nDISPLAY TYPE: " + displayType + ", \nRESOLUTION: " + resolution + " \nINTERNALMEMORY: "
				+ internalMemory + " \nBACKCAMERA: " + backCamera + " \nRADIO: " + radio + " \nFEATURES: " + features;
	}
	
	
	
	
	
	
}
