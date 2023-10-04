package fundamentals;

public class BasicMobile {
	private String company;
	private String model;
	private String technology;
	private int year;
	private String sim;
	private boolean cardSlot;
	private boolean camera;
	private boolean loudspeaker;
	private int batteryType;
	private double standByHorse;
	private double talkTime;
	
	public BasicMobile(String company, String model, String technology, int year, String sim, boolean cardSlot,
			boolean camera, boolean loudspeaker, int batteryType, double standByHorse, double talkTime) {
		super();
		this.company = company;
		this.model = model;
		this.technology = technology;
		this.year = year;
		this.sim = sim;
		this.cardSlot = cardSlot;
		this.camera = camera;
		this.loudspeaker = loudspeaker;
		this.batteryType = batteryType;
		this.standByHorse = standByHorse;
		this.talkTime = talkTime;
	}

	@Override
	public String toString() {
//		return "BasicMobile [company=" + company + ", model=" + model + ", technology=" + technology + ", year=" + year
//				+ ", sim=" + sim + ", cardSlot=" + cardSlot + ", camera=" + camera + ", loudspeaker=" + loudspeaker
//				+ ", batteryType=" + batteryType + ", standByHorse=" + standByHorse + ", talkTime=" + talkTime + "]";
		
		return
				company + " " + model + "\n"
				+ " NETWORK" + "\n"
				+ "\tTECHNOLOGY: " + technology + "\n"
				+ "LAUNCH: " + "\n"
				+ "\tANNOUNCED: " + year + "\n"
				+ "BODY" + "\n"
				+ "\tSIM: " + sim + "\n"
				+ "MEMORY" + "\n"
				+ "\tCARD SLOT: " + cardSlot + "\n"
				+ "CAMERA: " + camera + "\n"
				+ "SOUND" + "\n"
				+ "\tLOUD Speaker: " + loudspeaker + "\n"
				+ "BATTERY" + "\n"
				+ "\tType: " + batteryType + "mAH\n"
				+ "\tStandBy Hours: " + standByHorse + "hrs\n"
				+ "\tTalkTime: " + talkTime + "hrs";
	}
	
	
}
