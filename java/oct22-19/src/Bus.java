
public class Bus {
	int seats;
	String color;

	Bus(int seats, String color) {
		this.seats = seats;
		this.color = color;
	}

	Bus() {
		this(40);
	}

	Bus(int seats) {
		this.seats = seats;
	}

	void getDetails() {
		System.out.println("Welcome to redbus ,bus capacity is " + seats);
	}
}
