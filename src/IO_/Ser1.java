package IO_;

import java.io.Serializable;

/**
 * @Author: Mr.M
 * @Date: 2019-04-04 13:28
 * @Description:
 **/
public class Ser1 {
}

class User1 implements Serializable {
	private static final long serialVersionUID = 8911117853523324918L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

