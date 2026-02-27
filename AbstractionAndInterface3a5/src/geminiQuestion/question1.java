package geminiQuestion;

interface EmergencyProtocols {
	public void triggerAlarm();
}

abstract class HospitalArea {
	String areaName;
	
	public HospitalArea (String areaName) {
		this.areaName = areaName;
	}
	
	public abstract void sanitize();
}

class OperatingTheater extends HospitalArea implements EmergencyProtocols{
	public void triggerAlarm() {
		System.out.println("Tut Tut!");
	}
	
	public OperatingTheater(String areaName) {
		super(areaName);
	}
	
	public void sanitize() {
		System.out.println("Currently sanitize at " + areaName);
	}
}

public class question1 {

	public static void main(String[] args) {
		
		OperatingTheater OT1 = new OperatingTheater("UiTM Dengkil");
		
		OT1.triggerAlarm();
		OT1.sanitize();	
	}

}
