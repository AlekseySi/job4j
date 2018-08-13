package ru.job4j.condition;

/**
 * @author Aleksey Siminko (mailto:alekseysimink@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * ќтвечает на вопросы.
     * @param question ¬опрос от клиента.
     * @return ќтвет.
     */
    public String answer(String question) {
        String rsl = "Ёто ставит мен€ в тупик. —просите другой вопрос.";
        if ("ѕривет, Ѕот.".equals(question)) {
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "ѕривет, умник.";                    
        } else if (....) { // заменить ... на проверку, что этот вопрос известен боту и он знает как на него ответить.
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "ƒо скорой встречи.";
        }
        return rsl;
     }
}