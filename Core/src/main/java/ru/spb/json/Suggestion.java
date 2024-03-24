package ru.spb.json;

/**
 * Класс рекорд для предложений
 * @param userId            ID пользователя, подающего предложение
 * @param departmentId      ID отдела
 * @param description       описание предложения
 * @param solution          описание решения
 * @param expectedImpact    ожидаемый эффект
 * @param economicImpact    ожидаемый экономический эффект
 * @param commentLevel1          комментарий 1-ого уровня            !!!вопрос с именованием!!!
 * @param commentLevel2          комментарий 2-ого уровня
 */
public record Suggestion(Long userId, Long departmentId, String description, String solution,
                         String expectedImpact, String economicImpact,
                         String commentLevel1, String commentLevel2) {}
