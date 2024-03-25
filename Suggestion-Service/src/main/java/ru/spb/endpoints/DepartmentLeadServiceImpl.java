package ru.spb.endpoints;

import org.springframework.web.bind.annotation.*;
import ru.spb.json.Suggestion;
import ru.spb.services.DepartmentLeadService;

import java.util.List;

/**
 * Контроллер для руководителя отдела
 */
@RestController
public class DepartmentLeadServiceImpl implements DepartmentLeadService {

    public static final String INDEX = "departmentLead/suggestions/index";
    public static final String NOT_CONFIRMED = "departmentLead/suggestions/notConfirmed";
    public static final String CONFIRM = "departmentLead/suggestions/confirm";
    public static final String CREATE = "departmentLead/suggestions/create";
    public static final String EDIT = "departmentLead/suggestions/edit";

    /**
     * Возвращет список всех поданых предложений отдела departmentId.
     */
    @Override
    @GetMapping(INDEX)
    public List<Suggestion> index(@RequestParam Long departmentId) {
        //repo.getAllByDepartmentId();
        return null;
    }

    /**
     * Возвращает список несогласованных(statusId = 1) предложений отдела departmentId.
     */
    @Override
    @GetMapping(NOT_CONFIRMED)
    public List<Suggestion> showNotConfirmed(@RequestParam Long departmentId) {
        //repo.getAllByDepartmentIdIfStatusId1();
        return null;
    }

    /**
     * Принимает предложение и сохраняет в него комментарий первого уровня.
     * Присваивает предложению statusId = 2.
     */
    @Override
    @PatchMapping(CONFIRM)
    public void confirm(@RequestBody Long suggestionId, @RequestBody String commentLevel1) {
        //Suggestion sug = repo.getByID(suggestionId);
        //sug.setCommentLevel1(commentLevel1);
        //sug.setStatusId(2);
        //repo.save(sug);
    }

    /**
     * Создает предложение от руководителя отдела (statusId = 2).
     */
    @Override
    @PostMapping(CREATE)
    public void create(@RequestBody Suggestion suggestion) {
        //repo.save(suggestion);
    }

    /**
     * Редактирует предложение руководителя.
     */
    @Override
    @PatchMapping(EDIT)
    public void edit(@RequestBody Suggestion updatedSuggestion) {
        //Suggestion sug = repo.getById(updatedSuggestion.getId());
        //sug.set(updatedSuggestion);
        //repo.save(sug);
    }
}
