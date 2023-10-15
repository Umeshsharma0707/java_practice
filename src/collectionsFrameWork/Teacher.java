package collectionsFrameWork;

import java.util.Objects;

public class Teacher {
	int id;
	String name;
	
	public Teacher(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "\n Teacher {" + " \n id : " + id + "\n name : " + name + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Teacher other = (Teacher) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
}
