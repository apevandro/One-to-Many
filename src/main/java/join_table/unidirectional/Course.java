package join_table.unidirectional;

import java.util.HashSet;
import java.util.Set;

public class Course {

    private int courseId;
    private String name;
    private int totalCredits;
    private Set<Student> students = new HashSet<Student>();

	public Course() {}

    public Course(int courseId, String name, int totalCredits) { 
        this.courseId = courseId;
    	this.name = name;
        this.totalCredits = totalCredits;
    }

	public int getCourseId() {
		return courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}