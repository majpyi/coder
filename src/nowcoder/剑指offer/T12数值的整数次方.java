package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-06 09:01
 * @Description: 数值的整数次方
 **/
public class T12数值的整数次方 {
	public static double Power(double base, int exponent) {
		if (exponent==0){
			return 1;
		}

		if(exponent<0){
			return 1/Power(base,-exponent);
		}

		// 如果是奇数
		if((exponent&1)==1){
			return base*Power(base,exponent-1);
		}


		return Power(base*base,exponent/2);

	}


	public static double Power1(double base, int exponent) {
		if (exponent==0){
			return 1;
		}

		if(exponent<0){
			return 1/Power(base,-exponent);
		}
		double temp=1;
		for(int i=0;i<exponent;i++){
			temp=temp*base;
		}

		return temp;

	}


	public static void main(String[] args) {
		System.out.println(Power1(2,-6));
	}
}
