package exam31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	String dbDrv = "com.mysql.cj.jdbc.Driver";
    String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
    String dbUsr = "javauser";
    String dbPwd = "1234";

    // 1. 목록
    public List<StudentDTO> getSelectAll() {
        List<StudentDTO> list = new ArrayList<>();
        String sql = "select * from student order by hakbun desc";

        try (
            Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
        ) {
            while (rs.next()) {
                StudentDTO dto = new StudentDTO();
                dto.setHakbun(rs.getInt("hakbun"));
                dto.setName(rs.getString("name"));
                dto.setPhone(rs.getString("phone"));
                dto.setAddress(rs.getString("address"));
                dto.setCreateddate(rs.getDate("createddate"));
                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // 2. 상세보기
    public StudentDTO getSelectOne(int hakbun) {
        StudentDTO dto = null;
        String sql = "select * from student where hakbun=?";

        try (
            Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setInt(1, hakbun);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                dto = new StudentDTO();
                dto.setHakbun(rs.getInt("hakbun"));
                dto.setName(rs.getString("name"));
                dto.setSsn(rs.getString("ssn"));
                dto.setPhone(rs.getString("phone"));
                dto.setAddress(rs.getString("address"));
                dto.setCreateddate(rs.getDate("createddate"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dto;
    }

    // 3. 등록
    public int setInsert(StudentDTO dto) {
        int result = 0;
        String sql = """
            insert into student
            (name, ssn, phone, address, createddate)
            values (?, ?, ?, ?, now())
        """;

        try (
            Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getSsn());
            pstmt.setString(3, dto.getPhone());
            pstmt.setString(4, dto.getAddress());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // 4. 수정
    public int setUpdate(StudentDTO dto) {
        int result = 0;
        String sql = """
            update student
            set name=?, phone=?, address=?
            where hakbun=?
        """;

        try (
            Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getPhone());
            pstmt.setString(3, dto.getAddress());
            pstmt.setInt(4, dto.getHakbun());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // 5. 삭제
    public int setDelete(int hakbun) {
        int result = 0;
        String sql = "delete from student where hakbun=?";

        try (
            Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
            PreparedStatement pstmt = conn.prepareStatement(sql); ) {
        
            pstmt.setInt(1, hakbun);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
