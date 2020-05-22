package demo1_9;

public class Book {
	private int mun;
	private String name;
	public int getMun() {
		return mun;
	}
	public void setMun(int mun) {
		this.mun = mun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [mun=" + mun + ", name=" + name + "]";
	}
	

}
