package ru.spb.services;

import ru.spb.json.Suggestion;

import java.util.List;

/**
 * CRUD сервис для руководителя отдела.
 */
public interface DepartmentLeadService {
    /**
     * Возвращет список всех поданых предложений отдела departmentId.
     */
    List<Suggestion> index(Long departmentId);

    /**
     * Возвращает список несогласованных(statusId = 1) предложений отдела departmentId.
     */
    List<Suggestion> showNotConfirmed(Long departmentId);

    /**
     * Принимает предложение и сохраняет в него комментарий первого уровня.
     * Присваивает предложению statusId = 2.
     */
    void confirm(Long suggestionId, String commentLevel1);

    /**
     * Создает предложение от руководителя отдела (statusId = 2).
     */
    void create(Suggestion suggestion);

    /**
     * Редактирует предложение руководителя.
     */
    void edit(Suggestion updatedSuggestion);
}