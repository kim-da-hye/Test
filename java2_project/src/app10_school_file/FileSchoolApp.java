//파일 읽기->ArrayList에 저장
//csv: comma separated values 쉼표로 분리된값을 저장한 파일(엑셀에서 읽힘)
//학사관리 프로그램
//학생정보가 파일에 저장되어 있다.
//0.0. 읽기(파일에서)
//0.1. 리스트만들기
//1. 출력
//2. 삭제(option)
//3. 평균계산
//4. 정렬(평균내림차순으로)
//5. 평균까지 합쳐서 파일에 저장

package app10_school_file;

public class FileSchoolApp {

	public static void main(String[] args) {
		StudentsTask st=new StudentsTask(); 
		st.readFile(); //파일에서 읽어서 스트링 리스트에 저장
		st.print(); //스트링 리스트에 저장된 데이터를 출력
		st.addAll(); //스트링 리스트에 저장된 스트링을 클래스 리스트에 저장
		//st.printList(); //클래스 리스트에 저장된 데이터 출력
		st.avg();       //평균계산
		//st.printList(); //클래스 리스트에 저장된 데이터 출력
		st.sort(); //avg로.
		st.printList(); //클래스 리스트에 저장된 데이터 출력
		st.writeFile();
	}

}
