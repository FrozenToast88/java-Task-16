// Declare main which contains and displays data from other classes
public class Main {

    public static void main(String[] args) {
        //studentFactory contains the actions which is needed to identify data user seeks
        // Factory is also a Software pattern used to control section more efficiently
        studentFactory StudentFactory = new studentFactory();

        // calling all student classes & requesting data they contain with getStudent
        student1 stud1 = StudentFactory.getStudent("Fredd Hammond");
        student2 stud2 = StudentFactory.getStudent2("Mike Todd");
        student3 stud3 = StudentFactory.getStudent3("Sarah Jakes");

        // describe() function found in Interface class enables studentFactory
        // stud students are calling data from the different student classes
        stud1.describe();
        System.out.println(" ");
        stud2.describe();
        System.out.println(" ");
        stud3.describe();

    }
}
