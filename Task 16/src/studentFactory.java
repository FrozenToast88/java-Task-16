public class studentFactory {

//getter methods for each student with parameters which request String data
    public student1 getStudent(String studentInfo) {
        // if statements with conditions "if String data in the parameters requested is empty it will return null"
        if (studentInfo == null) {
            return null;
        }
        // students if statements with conditions " if String data in the parameters is the same as String data stored
        //return that student
        if (studentInfo.equalsIgnoreCase("Fredd Hammond")) {
            return new student1();
        }
        return null;
    }


    public student2 getStudent2(String studentInfo) {
        if (studentInfo == null) {
            return null;
        }
        if (studentInfo.equalsIgnoreCase("Mike Todd")) {
            return new student2();

        }
        return null;
    }

    public student3 getStudent3(String studentInfo) {
        if (studentInfo == null) {
            return null;
        }
        if (studentInfo.equalsIgnoreCase("Sarah Jakes")) {
            return new student3();
        }
        return null;
    }
}
