Feature: Этот год високосный?
  Алгоритм должен корректно определять високосный год

  Scenario Outline: Введенный год - високосный или не високосный
    Given Пользователь вводит год "<year>"
    When Мы определяем високосность года
    Then Должны получить ответ "<answer>"

    Examples:
      | year          | answer          |
      | 1993          | Не високосный    |
      | 2000          | Не високосный      |
      | 2012          | Високосный      |
      | 2020          | Високосный      |
      | Not Year      | Некорректная дата    |