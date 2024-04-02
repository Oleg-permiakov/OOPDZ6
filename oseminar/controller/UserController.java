package oseminar.controller;

import oseminar.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{ // Реализован принцип LSP. Тo же самое создает, что  и юзер
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
