package 手撕;

/**
 * @Author: Mr.M
 * @Date: 2019-04-05 16:34
 * @Description:
 **/
class Helper {
	private volatile Helper helper = null;

	public Helper getHelper() {
		if (helper == null) {
			synchronized (this) {
				if (helper == null)
					helper = new Helper();
			}
		}
		return helper;
	}

}

class single_e {
	private static single_e sigle = new single_e();

	public single_e getSingle() {
		return sigle;
	}
}