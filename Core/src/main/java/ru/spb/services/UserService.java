package ru.spb.services;

import ru.spb.json.Suggestion;

import java.util.List;

public interface UserService {

    String CREATE = "/user/suggestion/create";
    String INDEX = "/user/suggestions/index";
    String EDIT = "/user/suggestions/edit";

    void create(Suggestion suggestion);

    List<Suggestion> index(Long userId);

    void edit(Long userId, Suggestion suggestion);
}
