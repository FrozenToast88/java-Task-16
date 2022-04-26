// student implements Interface allows describe() to use data contained in student1
public class student3 implements Interface{

    // override asserts that a method is intended to override
    @Override
    public void describe(){
        //display String
        System.out.println(" Student 1: Sarah Jakes " +
                "\n Student Number : 537 " +
                "\n Registered for the Data Science Bootcamp " +
                "\n Completed level 1 " +
                "\n Completed level 2");

    }
}

