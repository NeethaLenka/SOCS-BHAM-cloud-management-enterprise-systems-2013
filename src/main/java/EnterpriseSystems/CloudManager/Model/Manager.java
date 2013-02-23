package EnterpriseSystems.CloudManager.Model;

import java.security.Timestamp;
import java.util.ArrayList;

public class Manager {
	
	private ArrayList<Blade> bladeList;
	
	private Timestamp currentTime;
	
	public static Boolean shutdownBlade(Blade blade){
		return true;
	}
	
	public static Boolean tryOpenNewBlade(){
		return true;
	}
	
	public static Boolean moveVm2Blade(VM vm, Blade blade){
		return true;
	}

	public ArrayList<Blade> getBladeList() {
		return bladeList;
	}

	public void setBladeList(ArrayList<Blade> bladeList) {
		this.bladeList = bladeList;
	}

	public Timestamp getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Timestamp currentTime) {
		this.currentTime = currentTime;
	}
}
