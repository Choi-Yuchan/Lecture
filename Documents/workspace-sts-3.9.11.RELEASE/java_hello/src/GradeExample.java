
public class GradeExample {

	public static void main(String[] args) {
		int kor, eng, math;
		int total;
		double average;
		char grade = '가';
		
		kor = 90;
		eng = 60;
		math = 45;
		
		total = kor + eng + math;
		average = total / 3.0;
		
		if (average >= 90) {
			grade = '수';
		} else if (average >= 80) {
			grade = '우';
		} else if (average >= 70) {
			grade = '미';
		} else if (average >= 60) {
			grade = '양';
		}else {
			grade = '가';
		}
				
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
		System.out.println("성적: " + grade);

	}

}
