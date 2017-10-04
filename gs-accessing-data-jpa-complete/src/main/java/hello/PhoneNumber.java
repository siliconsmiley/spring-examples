package hello;

import javax.persistence.Embeddable;

@Embeddable
public class PhoneNumber {

//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private Long id;
	private String number;
	private String type;
	protected PhoneNumber() {}
	
	public PhoneNumber(String type, String number) {
		this.type = type;
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		PhoneNumber other = (PhoneNumber) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("PhoneNumber [number=%s, type=%s]", number, type);
	}
	
	

	
}
