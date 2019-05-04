package 蘑菇街19实习;

/**
 * @Author: Mr.M
 * @Date: 2019-04-10 20:17
 * @Description:
 **/
public class A1 {

	public static void main(String[] args) {

		int x = 0;

		int y = 0;

		int k = 0;

		for (int z = 0; z < 5; z++) {

			if ((++x > 2) && (++y > 2) && (k++ > 2)) {

				x++;

				++y;

				k++;

			}

		}

		System.out.println(x + " "+ y + " " +k);

	}

}
