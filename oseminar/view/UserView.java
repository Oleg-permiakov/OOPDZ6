package oseminar.view;

import oseminar.data.User;

import java.util.List;

public interface UserView<T extends User>{ 
    void sendOnConsole(List<T> list);
}
