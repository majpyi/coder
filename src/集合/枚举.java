package 集合;

/**
 * @Author: Mr.M
 * @Date: 2019-05-09 10:32
 * @Description:
 **/


enum Color {


	RED(0),
	GREEN(1),
	BLANK(2),
	YELLOW(3);

	private int value;

	Color(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

public class 枚举 {
	public static void main(String[] args) {
		System.out.println(Color.BLANK.getValue());
	}

}

