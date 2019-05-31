package lintcode;

import javax.sound.midi.Soundbank;

/**
 * @Author: Mr.M
 * @Date: 2019-05-31 19:24
 * @Description:
 **/
public class T13字符串查找 {
	public int strStr(String source, String target) {
		// Write your code here
		if(target.length()==0){
			return 0;
		}
		for(int i=0;i<source.length();i++){
			for(int j=0,k=i;j<target.length()&&k<source.length() ;j++){
				if(source.charAt(k)!=target.charAt(j)){
					break;
				}
				if(j==target.length()-1){
					return i;
				}
				k++;
			}
		}
		return -1;
	}
}
