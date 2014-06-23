package se.aftonbladet.coffee.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import se.aftonbladet.coffee.equipment.CoffeePot;

import java.util.Date;

@Controller
public class NewBrew {

	@Value("${timeToBrew:3000}")
	private Integer timeToBrew;

	@MessageMapping("/brewstarted")
	@SendTo("/topic/brewfinished")
	public CoffeePot newBrew(CoffeePot coffeePot) throws Exception {
		Thread.sleep(timeToBrew);
		coffeePot.setLastBrew(new Date());
		return coffeePot;
	}
}
