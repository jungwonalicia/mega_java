package 정적;

public class Day {
	String doing;
	int time;
	String location;
	static int count; //일 누적
	static int sum; //시간 누적
	
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum = sum + time;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
	
}
