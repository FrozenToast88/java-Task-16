// student implements Interface allows describe() to use data contained in student1
public class student1 implements Interface{

    // override asserts that a method is intended to override
    @Override
    public void describe(){
        //display String
        System.out.println(" Student 1: Fredd Hammond " +
                            "\n Student Number : 319 " +
                            "\n Registered for the Software Engineering Bootcamp " +
                            "\n Completed level 1");

    }
}
