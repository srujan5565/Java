 class Student{
	private String studentId;
	private String name;
	private String examId;
		
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String generateExamId() {
        String ExamId="";
        String[] Names = getName().split(" ");
        int lastNoSquare = Character.getNumericValue(getStudentId().charAt(getStudentId().length()-1));
        ExamId = Names[0].substring(0,3)+"-"+Names[1].substring(0,3)+":"+getStudentId()+"-"+(int)Math.pow(lastNoSquare, 2);
        setExamId(ExamId);
        return ExamId;
	}
	
}

public class HallTicketIdGenerator{
	public static void main(String[] args) {
		Student stud1 = new Student();
		Student stud2 = new Student();
        stud1.setName("John Whedon");
        stud1.setStudentId("4596");
		stud2.setName("Ross Stark");
        stud2.setStudentId("3412");
        System.out.println(stud1.generateExamId());
        System.out.println(stud2.generateExamId());
	}
}
