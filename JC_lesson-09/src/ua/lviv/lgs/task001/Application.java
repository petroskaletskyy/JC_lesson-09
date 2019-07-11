/*
 * LOGOS IT ACADEMY
 * */

package ua.lviv.lgs.task001;

import java.util.Scanner;

public class Application {

	/*
	 * Menu to selection action
	 */

	static void menu() {
		System.out.println("Press 1 to check if a month is present:");
		System.out.println("Press 2 to display all months this season:");
		System.out.println("Press 3 to display all months with the entered number of days:");
		System.out.println("Press 4 to display all months with fewer days:");
		System.out.println("Press 5 to display all months with more days:");
		System.out.println("Press 6 to display next season of the year:");
		System.out.println("Press 7 to display previous season of the year:");
		System.out.println("Press 8 to display all months that have a couple of days:");
		System.out.println("Press 9 to display all months that have an odd number of days");
		System.out.println("Press 10 to display all months that have an even number of days");
	}

	/*
	 * Displays all months that have an odd number of days
	 */
	/**
	 * @param masMonths
	 * @return void
	 */
	private static void allMonthOddDays(Month[] masMonths) {
		for (Month m : masMonths) {
			if (m.getDay() % 2 != 0) {
				System.out.println(m.name());
			}
		}
	}

	/*
	 * Displays all months that have an even number of days
	 */
	/**
	 * @param masMonths
	 * @return void
	 */
	private static void allMonthEvenDays(Month[] masMonths) {
		for (Month m : masMonths) {
			if (m.getDay() % 2 == 0) {
				System.out.println(m.name());
			}
		}
	}

	/*
	 * Check if there is a season
	 */
	/**
	 * @param masMonths
	 * @param season
	 * @return boolean
	 */
	private static boolean isSeasonPresent(Seasons[] masSeasons, String season) {
		boolean flag = false;
		for (Seasons s : masSeasons) {
			if (s.name().equals(season)) {
				System.out.println("Така пора року існує");
				flag = true;
			}
		}
		return flag;
	}

	/*
	 * Check if there are months, with more days than the number entered
	 */
	/**
	 * @param masMonths
	 * @param days
	 * @return boolean
	 */
	private static boolean isDaysOver(Month[] masMonths, int days) {
		boolean flag = false;
		for (Month m : masMonths) {
			if (m.getDay() > days) {
				System.out.println(m.name());
				flag = true;
			}
		}
		return flag;
	}

	/*
	 * Check if there are months, with fewer days than the number entered
	 */
	/**
	 * @param masMonths
	 * @param days
	 * @return boolean
	 */
	private static boolean isDaysLess(Month[] masMonths, int days) {
		boolean flag = false;
		for (Month m : masMonths) {
			if (m.getDay() < days) {
				System.out.println(m.name());
				flag = true;
			}
		}
		return flag;
	}

	/*
	 * Check if there are months, with the number of days entered
	 */
	/**
	 * @param masMonths
	 * @param days
	 * @return boolean
	 */
	private static boolean isDaysPreset(Month[] masMonths, int days) {
		boolean flag = false;

		for (Month m : masMonths) {
			if (m.getDay() == days) {
				System.out.println(m.name());
				flag = true;
			}
		}
		return flag;
	}

	/*
	 * Check if there are months, with the number of days entered
	 */
	/**
	 * @param masMonths
	 * @param season
	 * @return boolean
	 */

	private static boolean isMonthSeasonPresent(Month[] masMonths, String season) {
		boolean flag = false;

		for (Month m : masMonths) {
			if (m.getSeasons().name().equals(season)) {
				System.out.println(m.name());
				flag = true;
			}
		}
		return flag;
	}

	/*
	 * Check if there is a month entered
	 */
	/**
	 * @param masMonths
	 * @param season
	 * @return boolean
	 */
	private static boolean isMonthPresent(Month[] masMonths, String month) {
		boolean flag = false;

		for (Month m : masMonths) {
			if (m.name().equals(month)) {
				System.out.println("Такий місяць існує");
				flag = true;
			}
		}
		return flag;
	}

	/*
	 * Main method
	 */
	public static void main(String[] args) throws WrongInputConsoleParametersException {
		// Create arrays
		Month[] masMonths = Month.values();
		Seasons[] masSeasons = Seasons.values();
		// Input values
		Scanner sc = new Scanner(System.in);
		// Loop for data entry
		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				System.out.println("Введіть місяць: ");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				boolean flag = isMonthPresent(masMonths, month);

				if (!flag) {
					String message = "Такого місяця не існує...";
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			case "2": {
				System.out.println("Введіть пору року:");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = isMonthSeasonPresent(masMonths, season);

				if (!flag) {
					String message = "Такої пори року не існує...";
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			case "3": {
				System.out.println("Введіть кількість днів");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag = isDaysPreset(masMonths, days);

				if (!flag) {
					String message = "Не вірно введені дані...";
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			case "4": {
				System.out.println("Введіть кількість днів");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag = isDaysLess(masMonths, days);

				if (!flag) {
					String message = "На жаль, місяців, в яких менше днів, ніж введене число - не існує";
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			case "5": {
				System.out.println("Введіть кількість днів");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag = isDaysOver(masMonths, days);

				if (!flag) {
					String message = "На жаль, місяців, в яких більше днів, ніж введене число - не існує";
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			case "6": {
				System.out.println("Введіть пору року:");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = isSeasonPresent(masSeasons, season);

				if (flag) {
					Seasons season2 = Seasons.valueOf(season);
					int ordinal = season2.ordinal();

					if (ordinal == (masSeasons.length - 1)) {
						ordinal = 0;
						System.out.println(masSeasons[ordinal]);
					} else {
						System.out.println(masSeasons[ordinal + 1]);
					}
				}

				if (!flag) {
					String message = "Такої пори року не існує";
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			case "7": {
				System.out.println("Введіть пору року:");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = isSeasonPresent(masSeasons, season);

				if (flag) {
					Seasons season2 = Seasons.valueOf(season);
					int ordinal = season2.ordinal();

					if (ordinal == 0) {
						ordinal = (masSeasons.length - 1);
						System.out.println(masSeasons[ordinal]);
					} else {
						System.out.println(masSeasons[ordinal - 1]);
					}
				}

				if (!flag) {
					String message = "Такої пори року не існує";
				}
				break;
			}
			case "8": {
				allMonthEvenDays(masMonths);
				break;
			}
			case "9": {
				allMonthOddDays(masMonths);
				break;
			}
			case "10": {
				System.out.println("Введіть місяць: ");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				boolean flag = isMonthPresent(masMonths, month);

				if (flag) {
					for (Month m : masMonths) {
						if (m.name().equals(month)) {
							if (m.getDay() % 2 == 0) {
								System.out.println("Місяць має парну кількість днів");
							} else {
								System.out.println("Місяць має непарну кількість днів");
							}
						}
					}
				}

				if (!flag) {
					String message = "Такого місяця не існує...";
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			}
		}

	}

}
