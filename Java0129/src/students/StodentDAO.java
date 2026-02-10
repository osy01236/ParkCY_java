package students;

import java.sql.Connection;     //DB서버 연결
import java.sql.DriverManager;  //DB서버 연결

import java.sql.PreparedStatement; //테이블에 SQL 실행
import java.sql.ResultSet;          //테이블에서 조회한 결과

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StodentDAO {
//  DB 서버 연결을 위한 드라이버, 주소 , 아이디 ,비번
	String dbDrv = "com.mysql.cj.jdbc.Driver";
//	DB 드라이버ㅏ
	String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
//    DB 주소
	String dbUsr = "javauser";
//  DB 아이디 
	String dbPwd = "1234";
//  DB 비번 

    
    // 등록
    public int setInsert(Student stud) {   //등록 메서드
        int result = 0;
        String sql = """
            insert into student
            (studentName, address, phone)
            values (?, ?, ?)
        """;
    
        try (      //코드가 끝나면 자동실행
        	Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);    //DB 주소 아이디 비번으로 접속
            PreparedStatement pstmt = conn.prepareStatement(sql);        //DB와 연결된 상태에서 SQL을 실행할 수 있는 객체
        ) {
            pstmt.setString(1, stud.getStudentName());    //연동된 DB 테이블에 문자열 넣을 준비중
            pstmt.setString(2, stud.getAddress());        //연동된 DB 테이블에 문자열 넣을 준비중
            pstmt.setString(3, stud.getPhone());          //연동된 DB 테이블에 문자열 넣을 준비중
            result = pstmt.executeUpdate();               //DB에서 실행해고 저장한다
        } catch (Exception e) {   //try 안의 오류 캐치 ( 어떤오류고 어디줄인지 이유까지)
            e.printStackTrace();   // 에러에 대한 내용 출력
        }
        return result;
    }

     //목록
    
    public List<Student> getSelectAll() {  //DB에서 학생 전부 가져와서 Student 객체 여러 개를 담은 리스트로 줌
        List<Student> list = new ArrayList<>();    //list 라는 새로운 ArrayList 객체
        String sql = "select * from student order by id desc";  //mysql 보낼 명령어 id 순서대로 student 테이블 가져와라

        try (
            Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);  //“DB 주소 아이디 비번으로 접속”
            PreparedStatement pstmt = conn.prepareStatement(sql);   //DB와 연결된 상태에서 SQL을 실행할 수 있는 객체
            ResultSet rs = pstmt.executeQuery();       //DB 에서 한걸 rs로 받아온다
        ) {
            while (rs.next()) {  //DB 에서 한걸 rs로 받아온다
                Student stud = new Student(); //DB에서 하고 rs로 받아온걸 while 문으로 반복해서 Student 새로운 객체에 이름 연락처 주소 담기
                
                stud.setStudentName(rs.getString("studentName"));
                stud.setPhone(rs.getString("phone"));
                stud.setAddress(rs.getString("address"));
                
                list.add(stud);   //stud 객체 를 list 가방으로
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;   //DB에서 가져온 학생 전부를 담은 리스트를, 이 메서드를 호출한 곳으로 돌려준다.
    }

    
    
    //  수정
    public int setUpdate(String targetName, Student stud) { //student 테이블에서  이름이 targetName인 행을 찾아서 이름·주소·전화번호를 새 값으로 바꿔라
        int result = 0;
        String sql = "update student set studentName=?, address=?, phone=? where studentName=?";  //student 테이블을 업데이트할 이름 주소 연락처 그래서 어떤이름으로?


        try (
            Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
        	//사용자가 새 값을 안 넣었으면(null이면), DB에 null을 넣지 말고 안전한 값으로 대신 넣어라
        	pstmt.setString(1, stud.getStudentName() == null ? targetName : stud.getStudentName());   
            pstmt.setString(2, stud.getAddress() == null ? "" : stud.getAddress());
            pstmt.setString(3, stud.getPhone() == null ? "" : stud.getPhone());
            pstmt.setString(4, targetName);

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    //삭제
    public int setDelete(String studentName) {
        int result = 0;
        String sql = "delete from student where studentName=?";   //테이블 student 에서 어떤 이름을 삭제할껀가?

        try (
            Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
            PreparedStatement pstmt = conn.prepareStatement(sql); ) {
        
            pstmt.setString(1, studentName);      //삭제할 이름 받기
            result = pstmt.executeUpdate();        // 삭제 실행
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    
    
    
    
    }

}
