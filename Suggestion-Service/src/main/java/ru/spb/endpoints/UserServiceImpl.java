package ru.spb.endpoints;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.spb.json.Suggestion;
import ru.spb.services.UserService;

import java.util.List;

/**
 * Rest контроллер для операций с предложениями пользователем.
 */
@RestController
public class UserServiceImpl implements UserService {

    public static final String USER_URL = "/user/suggestions";

    /**
     * Метод для создания предложения.
     */
    @PostMapping(USER_URL)
    public void create(@RequestBody Suggestion suggestion) {            // returns Http status
        // repo.save();
    }

    /**
     * Метод вовзвращает список всех предложения для пользователя с userID.
     */
    @GetMapping(USER_URL)
    public List<Suggestion> index(@RequestBody Long userId) {           //  ??????????
        // List<Suggestion> index = repo.getAll();
        return null;
    }

    /**
     * Метод для редактирования предложения.
     */
    @PatchMapping(USER_URL)
    public void edit(@RequestBody Suggestion suggestion) {   //  return Http status
        // Suggestion suggestionToUpdate = repo.findByUserId(Suggestion.getUserId());
        // suggestionToUpdate.set(suggestion);
        // repo.save();
    }

}
