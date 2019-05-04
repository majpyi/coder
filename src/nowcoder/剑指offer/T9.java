package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-05 22:04
 * @Description: https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387?tpId=13&tqId=11162&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 **/
public class T9 {
	int[] re = new int[1000];
	{
		re[1] = 1;
		for (int i=2;i<re.length;i++){
			re[i]+=1;
			for(int j=1;j<i;j++){
				re[i]+=re[j];
			}
		}
	}
	public int JumpFloorII(int target) {
		return re[target];
	}
}
