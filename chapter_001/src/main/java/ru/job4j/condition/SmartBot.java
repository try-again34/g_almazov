package ru.job4j.condition;
/**
 * @author George Almazov (try_again34@tuta.io)
 * @version $Id$
 * @since 0.1
 */
public class SmartBot {
	   /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
	public String answer (String question) {
		String result;
		
		if ("Привет,Бот".equals(question)) {
			result = "Привет, умник";
		} else if("Пока".equals(question))
			result = "До скорой встречи";
		else
			result = "Это ставит меня в тупик. Спросите другой вопрос.";
		return result;
	}
}