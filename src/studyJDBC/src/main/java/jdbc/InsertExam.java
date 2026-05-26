package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertExam {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/liondb";
        String user = "lion";
        String password = "lion1234";
        conn = DriverManager.getConnection(url, user, password);

        String sql = "insert into member(name, email, password) value(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, "kdy");
        ps.setString(2, "kdy@mail.com");
        ps.setString(3, "1234");

        int reslutCount = ps.executeUpdate();

        System.out.println(reslutCount + "건 입력됨");


    }
}
