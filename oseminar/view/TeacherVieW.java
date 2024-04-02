package oseminar.view;

import java.util.logging.Logger;

import oseminar.data.User;

public class TeacherVieW <T extends User> { //Реализован принцип ISP.
    
    Logger logger = Logger.getLogger(TeacherVieW.class.getName());

    @Override
    public void sendOnConsole(List<T> teachers) {
        for(T user: teachers){
            logger.info(user.toString());
        }
    }

}