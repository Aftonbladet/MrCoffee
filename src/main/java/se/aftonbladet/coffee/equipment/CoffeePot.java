package se.aftonbladet.coffee.equipment;

import java.util.Date;

public class CoffeePot {

	private String name;
	private Date lastBrew;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Date getLastBrew() {
		return lastBrew;
	}

	public void setLastBrew(final Date lastBrew) {
		this.lastBrew = lastBrew;
	}
}
