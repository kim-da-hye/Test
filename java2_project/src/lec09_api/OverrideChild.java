//Object class의 주요 메서드를 오버라이드하는 클래스 정의

package lec09_api;

class OverrideChild {
     String name;
     int score;
     OverrideChild(){}
	public OverrideChild(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
     //equals()
	//hashcode()
	//toString()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OverrideChild other = (OverrideChild) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OverrideChild [name=" + name + ", score=" + score + "]";
	}
	
	

}
