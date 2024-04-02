package ru.gb.oseminar.view;

import ru.gb.oseminar.data.User;

public class TeacherVieW <T extends User> {
    
    Logger logger = Logger.getLogger(TeacherVieW.class.getName());

    @Override
    public void sendOnConsole(List<T> teachers) {
        for(T user: teachers){
            logger.info(user.toString());
        }
    }

}