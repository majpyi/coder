/**
 * @Author: Mr.M
 * @Date: 2019-03-27 21:06
 * @Description:
 **/
class test11 {
	public static void main(String[] args) {

		OK:
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.println(j);
				if(j == 5)
					break OK;
			}
		}

	}
}


class test22 {
	public static void main(String[] args) {

		boolean flag = false;
		for (int i = 0; i < 10 && !flag; i++) {  //当flag为true时跳出循环
			for (int j = 0; j < 10; j++) {
				System.out.println(j);
				if (j == 5) {
					flag = true;
					break;
				}
			}
		}

	}
}