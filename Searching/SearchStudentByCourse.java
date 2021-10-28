import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.*;
class Student{
    public String name;
    public String rollNumber;
    public String course;
    Student(String name, String rollNumber, String course){
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = this.course;
    }
    public String toString(){
        return name + " " + rollNumber + " " + course;
    }
}
public class SearchStudentByCourse {
    static BiFunction<List<Student>,String, List<Student>> meth = (al, c) -> al.stream().filter((i)->i.course.equalsIgnoreCase(c)).collect(Collectors.toList());
    static List<Student> getAccordingToCourse(List<Student> al, String course){
        return meth.apply(al,course);
     }
    public static void main(String args[]) {
      List<Student> l1 = new ArrayList<>(Arrays.asList(new Student("NIKHIL","21E32","MATHS"),
                                                       new Student("AJAY","21A22","MATHS"),
                                                       new Student("RAHUL","21E12","PHYSICS"),
                                                       new Student("RAM","21B02","CHEMISTRY"),
                                                       new Student("YAM","21Y11","PHYSICS")));
      System.out.println(getAccordingToCourse(l1,"physics"));
    }
}
