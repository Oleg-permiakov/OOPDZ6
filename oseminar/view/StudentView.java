package oseminar.view;

import oseminar.data.Student;
import oseminar.data.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student>{ //Реализован принцип ISP.

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<Student> students) {
        for(Student user: students){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

}
