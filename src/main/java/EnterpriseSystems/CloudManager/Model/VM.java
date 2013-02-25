package EnterpriseSystems.CloudManager.Model;

// class for virtual machines

public class VM {
	
	private Long ID;
	
	private double memoryUsage_current;
	
	private double memoryUsage_maximum;
	
	private double cpuUsage_current;
	
	private double cpuUsage_maximum;
	
	private double diskUsage_current;
	
	private double diskUsage_maximum;
	
	private double networkUsage_current;
	
	private double networkUsage_maximum;

	public VM() {
		
	}
	
	//constructor including all fields
	public VM(Long ID,double memoryUsage_current, double memoryUsage_maximum, double cpuUsage_current, double cpuUsage_maximum,
			double diskUsage_current, double diskUsage_maximum, double networkUsage_current, double networkUsage_maximum){
		this.ID = ID;
		this.memoryUsage_current = memoryUsage_current;
		this.memoryUsage_maximum = memoryUsage_maximum;
		this.cpuUsage_current = cpuUsage_current;
		this.cpuUsage_maximum = cpuUsage_maximum;
		this.diskUsage_current = diskUsage_current;
		this.diskUsage_maximum = diskUsage_maximum;
		this.networkUsage_current = networkUsage_current;
		this.networkUsage_maximum = networkUsage_maximum;
	}

    public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public double getMemoryUsage_current() {
		return memoryUsage_current;
	}

	public void setMemoryUsage_current(double memoryUsage_current) {
		this.memoryUsage_current = memoryUsage_current;
	}

	public double getMemoryUsage_maximum() {
		return memoryUsage_maximum;
	}

	public void setMemoryUsage_maximum(double memoryUsage_maximum) {
		this.memoryUsage_maximum = memoryUsage_maximum;
	}

	public double getCpuUsage_current() {
		return cpuUsage_current;
	}

	public void setCpuUsage_current(double cpuUsage_current) {
		this.cpuUsage_current = cpuUsage_current;
	}

	public double getCpuUsage_maximum() {
		return cpuUsage_maximum;
	}

	public void setCpuUsage_maximum(double cpuUsage_maximum) {
		this.cpuUsage_maximum = cpuUsage_maximum;
	}

	public double getDiskUsage_current() {
		return diskUsage_current;
	}

	public void setDiskUsage_current(double diskUsage_current) {
		this.diskUsage_current = diskUsage_current;
	}

	public double getDiskUsage_maximum() {
		return diskUsage_maximum;
	}

	public void setDiskUsage_maximum(double diskUsage_maximum) {
		this.diskUsage_maximum = diskUsage_maximum;
	}

	public double getNetworkUsage_current() {
		return networkUsage_current;
	}

	public void setNetworkUsage_current(double networkUsage_current) {
		this.networkUsage_current = networkUsage_current;
	}

	public double getNetworkUsage_maximum() {
		return networkUsage_maximum;
	}

	public void setNetworkUsage_maximum(double networkUsage_maximum) {
		this.networkUsage_maximum = networkUsage_maximum;
	}
}
