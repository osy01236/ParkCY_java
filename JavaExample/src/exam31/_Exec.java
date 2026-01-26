package exam31;

import java.util.List;
import java.util.Scanner;

public class _Exec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.print("선택(1:목록, 2:상세보기, 3:등록, 4:수정, 5:삭제, 기타:종료) : ");
            String menu = sc.nextLine();

            switch (menu) {

                case "1": // 목록
                    List<StudentDTO> list = dao.getSelectAll();
                    for (StudentDTO dto : list) {
                        System.out.println(
                            dto.getHakbun() + " | " +
                            dto.getName() + " | " +
                            dto.getPhone() + " | " +
                            dto.getAddress()
                        );
                    }
                    break;

                case "2": // 상세보기
                    System.out.print("학번 입력 : ");
                    int hakbun = Integer.parseInt(sc.nextLine());
                    StudentDTO one = dao.getSelectOne(hakbun);

                    if (one != null) {
                        System.out.println("학번 : " + one.getHakbun());
                        System.out.println("이름 : " + one.getName());
                        System.out.println("주민번호 : " + one.getSsn());
                        System.out.println("전화 : " + one.getPhone());
                        System.out.println("주소 : " + one.getAddress());
                        System.out.println("등록일 : " + one.getCreateddate());
                    } else {
                        System.out.println("데이터 없음");
                    }
                    break;

                case "3": // 등록
                    StudentDTO dto = new StudentDTO();
                    System.out.print("이름 : ");
                    dto.setName(sc.nextLine());
                    System.out.print("주민번호 : ");
                    dto.setSsn(sc.nextLine());
                    System.out.print("전화 : ");
                    dto.setPhone(sc.nextLine());
                    System.out.print("주소 : ");
                    dto.setAddress(sc.nextLine());

                    System.out.println("등록 결과 : " + dao.setInsert(dto));
                    break;

                case "4": // 수정
                    StudentDTO update = new StudentDTO();
                    System.out.print("학번 : ");
                    update.setHakbun(Integer.parseInt(sc.nextLine()));
                    System.out.print("이름 : ");
                    update.setName(sc.nextLine());
                    System.out.print("전화 : ");
                    update.setPhone(sc.nextLine());
                    System.out.print("주소 : ");
                    update.setAddress(sc.nextLine());

                    System.out.println("수정 결과 : " + dao.setUpdate(update));
                    break;

                case "5": // 삭제
                    System.out.print("삭제할 학번 : ");
                    int del = Integer.parseInt(sc.nextLine());
                    System.out.println("삭제 결과 : " + dao.setDelete(del));
                    break;

                default:
                    System.out.println("프로그램 종료");
                    return;
            }
        }
    }
}

