// Subject class (represents a subject and marks)
class CourseSubject {
    String subjectName;
    int marks;

    public CourseSubject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    void displaySubject() {
        System.out.println(subjectName + ": " + marks);
    }
}

// Student class (aggregates multiple CourseSubject objects)
class Learner {
    String studentName;
    CourseSubject[] subjects;

    public Learner(String studentName, CourseSubject[] subjects) {
        this.studentName = studentName;
        this.subjects = subjects;
    }

    void displaySubjects() {
        System.out.println("\nStudent: " + studentName);
        for (CourseSubject s : subjects) {
            s.displaySubject();
        }
    }
}

// GradeCalculator class (computes total and average marks)
class ResultProcessor {

    public void calculateGrade(Learner learner) {
        int total = 0;
        for (CourseSubject s : learner.subjects) {
            total += s.marks;
        }
        double average = to
