package bus;

public class Bus {
	private int busNo;
	private boolean ac;
	private  int capacity;
	
	Bus(int no, boolean ac, int cap){
		this.busNo    = no;
		this.ac       = ac;
		this.capacity = cap;
	}
	public int getBusNo() {
	return busNo;
	}
	
	public boolean isAC() {
		return ac;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setAc(boolean  val) {
		ac=val;
	}
	public void setCapacity(int cap) {
		capacity = cap;
	}
	public void  displayBusInfo() {
		System.out.println("Bus No: "+busNo+"Ac :"+ac+"Total Capcity "+capacity);
	}
		
	public static void main(String[] args) {
		

	}

}