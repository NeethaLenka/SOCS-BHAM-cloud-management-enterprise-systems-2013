package main.ES2.facts;

import java.util.ArrayList;

public class Blade {
	
	private Long ID;

	private double memory_total;
	
	private double memoryUsage_current;
	
	private double disk_total;
	
	private double diskUsage_current;
	
	private double network_total;
	
	private double networkUsage_current;
	
	private double cpuUsage_current;
	
	private Long vmAmount;
	
	private ArrayList<VM> vmList;
	
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public double getMemory_total() {
		return memory_total;
	}

	public void setMemory_total(double memory_total) {
		this.memory_total = memory_total;
	}

	public double getMemoryUsage_current() {
		return memoryUsage_current;
	}

	public void setMemoryUsage_current(double memoryUsage_current) {
		this.memoryUsage_current = memoryUsage_current;
	}

	public double getDisk_total() {
		return disk_total;
	}

	public void setDisk_total(double disk_total) {
		this.disk_total = disk_total;
	}

	public double getDiskUsage_current() {
		return diskUsage_current;
	}

	public void setDiskUsage_current(double diskUsage_current) {
		this.diskUsage_current = diskUsage_current;
	}

	public double getNetwork_total() {
		return network_total;
	}

	public void setNetwork_total(double network_total) {
		this.network_total = network_total;
	}

	public double getNetworkUsage_current() {
		return networkUsage_current;
	}

	public void setNetworkUsage_current(double networkUsage_current) {
		this.networkUsage_current = networkUsage_current;
	}

	public double getCpuUsage_current() {
		return cpuUsage_current;
	}

	public void setCpuUsage_current(double cpuUsage_current) {
		this.cpuUsage_current = cpuUsage_current;
	}

	public Long getVmAmount() {
		return vmAmount;
	}

	public void setVmAmount(Long vmAmount) {
		this.vmAmount = vmAmount;
	}

	public ArrayList<VM> getVmList() {
		return vmList;
	}

	public void setVmList(ArrayList<VM> vmList) {
		this.vmList = vmList;
	}
	
	public void AddVM(VM vm){
		if(vmList == null){
			vmList = new ArrayList<>();
		}
		vmList.add(vm);
	}
	
	
}
