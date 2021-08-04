package exFixacao_map;

public class Candidates implements Comparable<Candidates>{
	
	private String name;
	private Integer numberVote;
	
	public Candidates() {
	}

	public Candidates(String name, Integer numberVote) {
		this.name = name;
		this.numberVote = numberVote;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberVote() {
		return numberVote;
	}

	public void setNumberVote(Integer numberVote) {
		this.numberVote = numberVote;
	}

	@Override
	public int compareTo(Candidates o) {
		return numberVote.compareTo(o.getNumberVote());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numberVote == null) ? 0 : numberVote.hashCode());
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
		Candidates other = (Candidates) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberVote == null) {
			if (other.numberVote != null)
				return false;
		} else if (!numberVote.equals(other.numberVote))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Candidates info\nname=" + name + ", numberVote=" + numberVote + "]";
	}
	
}
