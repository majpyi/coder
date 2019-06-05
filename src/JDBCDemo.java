import java.math.BigDecimal;
import java.sql.*;

/**
 * @Author: Mr.M
 * @Date: 2019-06-01 16:35
 * @Description:
 **/
public class JDBCDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("");

		String sql = "select seq_orderdetid.nextval as orderidfrom dual";
		Statement stat1=conn.createStatement();
		ResultSet rs1 = stat1.executeQuery(sql);


		PreparedStatement pstmt  = conn.prepareStatement("UPDATE EMPLOYEES  SET SALARY = ? WHERE ID =?");
		pstmt.setBigDecimal(1, BigDecimal.valueOf(153833.00));
		pstmt.setInt(2, 110592);
		pstmt. executeUpdate();


		CallableStatement cstmt = conn.prepareCall("{call getTestData(?,?)}");
		cstmt.registerOutParameter(1, java.sql.Types.TINYINT);
		cstmt.registerOutParameter(2, java.sql.Types.DECIMAL, 3);
		cstmt.executeQuery();
		byte x = cstmt.getByte(1);
		java.math.BigDecimal n = cstmt.getBigDecimal(2, 3);

	}
}
