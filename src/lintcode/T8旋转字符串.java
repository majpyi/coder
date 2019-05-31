package lintcode;

/**
 * @Author: Mr.M
 * @Date: 2019-05-31 16:08
 * @Description:
 **/
public class T8旋转字符串 {
	public void rotateString(char[] str, int offset) {
		// write your code here
		if(str.length==0){
			return;
		}
		if(offset>str.length){
			offset = offset%str.length;
		}
		String s = String.valueOf(str);
		String re = s.substring(str.length-offset)+s.substring(0,str.length-offset);
		for (int i=0;i<str.length;i++){
			str[i] = re.toCharArray()[i];
		}
	}


	public void rotateString1(char[] str, int offset) {
		if(str.length==0){
			return;
		}
		if(offset>str.length){
			offset = offset%str.length;
		}
		for (int i=0;i<offset;i++){
			char temp = str[i];
			str[i] = str[(str.length-offset+i)%str.length];
			str[str.length-offset] = temp;
		}
	}
}
