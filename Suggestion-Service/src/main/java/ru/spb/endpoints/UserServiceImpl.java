package ru.spb.endpoints;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.spb.json.Suggestion;
import ru.spb.services.UserService;

import java.util.List;


@RestController
public class UserServiceImpl implements UserService {

    @PostMapping(CREATE)
    public void create(@RequestBody Suggestion suggestion) {            // returns Http status
        // repo.save();
    }

    @GetMapping(INDEX)
    public List<Suggestion> index(@RequestBody Long userId) {           //  ??????????
        // List<Suggestion> index = repo.getAll();
        return null;
    }

    @PatchMapping(EDIT)
    public void edit(@RequestBody Long userId, @RequestBody Suggestion suggestion) {   //  return Http status
        // Suggestion suggestionToUpdate = repo.findByUserId();
        // suggestionToUpdate.set(suggestion);
        // repo.save();
    }

}
