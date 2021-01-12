package app07_average_api;

class Student {
	String name;
	int mathScore;
	int engScore;
	int avg;  //ЦђБе
	
	
	public Student(String name, int mathScore, int engScore) {
		super();
		this.name = name;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mathScore=" + mathScore + ", engScore=" + engScore + "]";
	}
	
	void printAvg() {
		System.out.printf("%10s  %6d  %6d  %6d",  name, mathScore, engScore, avg );
		System.out.println();
	}
}
