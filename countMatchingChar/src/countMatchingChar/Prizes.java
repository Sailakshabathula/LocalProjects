package countMatchingChar;

public class Prizes {
	
	
	private String name;
	private Integer prize;
	
	
	public Prizes(String name, Integer prize) {
		super();
		this.name = name;
		this.prize = prize;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrize() {
		return prize;
	}
	public void setPrize(Integer prize) {
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "Prizes [name=" + name + ", prize=" + prize + "]";
	}
	

}
