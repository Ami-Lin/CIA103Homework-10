package hw8;

import java.util.Objects;

public class Train implements Comparable<Train>{
//	• 請設計一個Train類別,並包含以下屬性:
//	- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//	- 目的地 dest,型別為String - 票價 price,型別為double
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train() {}
	//	並在main方法裡透過建構子產生以下7個Train的物件,放到每小題需使用的集合裡
	public Train(int number, String type, String start, String dest, double price) {
		this.number=number;
		this.type=type;
		this.start=start;
		this.dest=dest;
		this.price=price;
	}
	
	public void getTrain() {
		System.out.println("車次:" + number + " 車種:" + type + " 出發站:" + start + " 抵達站:" + dest + " 價格:" + price);
	}

//	設計對應的getter/setter方法
	public Integer getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public int compareTo(Train aTrain) {
		if (this.number > aTrain.number) {
			return -1;
		} else if(this.number == aTrain.number){
			return 0 ;
		}else {
			return 1;
		}
	}
	//回傳正負值代表兩者之間的"左右"關係
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	
}
