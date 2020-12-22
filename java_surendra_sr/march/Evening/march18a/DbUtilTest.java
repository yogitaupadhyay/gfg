import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
@Author:Surendra Kumar Sao

	>>Software Architect and Corporate Trainer
	>>+9 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 
   CurrentYear 2019 
 */

public class DbUtilTest {

	// public static void main(String[] args) throws Exception{
	public static void main(String[] args) {

		Connection con = null;

		try {
			con = SisDbConnectionUtil.getConnection();
			//todo
		} catch (SQLException e) {
			System.out.println("DB ERROR "+e.getMessage());

		} catch (Exception e) {
			System.out.println("other ERROR "+e.getMessage());
		} finally {
			try {
				SisDbConnectionUtil.closeConnection(con);
			} catch (SQLException e) {
				 System.out.println("DB Close ERROR "+e.getMessage());
			}
		}
	}

}
