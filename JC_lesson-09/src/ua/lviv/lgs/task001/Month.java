/*
 * LOGOS IT ACADEMY
 * */

package ua.lviv.lgs.task001;

public enum Month {
	JANUARY(Seasons.WINTER, 31), 
	FEBRUARY(Seasons.WINTER, 28), 
	MARCH(Seasons.SPRING, 31), 
	APRIL(Seasons.SPRING, 30), 
	MAY(Seasons.SPRING, 31), 
	JUNE(Seasons.SUMMER, 30), 
	JULY(Seasons.SUMMER, 31), 
	AUGUST(Seasons.SUMMER, 31), 
	SEPTEMBER(Seasons.FALL, 30), 
	OCTOBER(Seasons.FALL, 31), 
	NOVEMBER(Seasons.FALL, 30), 
	DECEMBER(Seasons.WINTER, 31);
	
	int day;
	Seasons seasons;
	
	Month(Seasons seasons, int day) {
		this.seasons = seasons;
		this.day = day;
	}

	public int getDay() {
		return day;
	}

	public Seasons getSeasons() {
		return seasons;
	}
	
	
}
