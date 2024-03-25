package ru.spb.services;

import ru.spb.json.Suggestion;

import java.util.List;

/**
 * CRUD сервис для предложения пользователя.
 */
public interface UserService {
    void create(Suggestion suggestion);

    List<Suggestion> index(Long userId);

    void edit(Suggestion suggestion);
}
