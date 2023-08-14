package rock_paper_scissors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] arg) {

		System.out.println("Давай сыграем в игру: \"Камень, ножницы, бумага\"");
		System.out.println(" Выберите: \r\n" + "0 - Камень\r\n" + "1 - Ножницы\r\n" + "2 - Бумага");

		int user = userChoice();
		int comp = (int) (Math.random() * (3));

		System.out.println("Ваш выбор:" + user + "\r\n" + "Компьютер выбрал: " + comp + " ");
		System.out.println(result(user, comp));

	}

	public static int userChoice() {
		int a = -1;
		String fail = "Выбери из предложенных элементов!";
		while (a < 0) {
			try {
				a = scanner.nextInt();
				if (a < 0 || a > 2) {
					System.out.println(fail);
					a = -1;
				}
			} catch (InputMismatchException e) {
				System.out.println(fail);
				scanner.next();
			}
		}

		return a;
	}

	static String result(int user, int comp) {
		String result = null;
		String winn = "Вы победили!", loose = "Компьютер победил", draw = "ничья";

		switch (user) {
		case 0:

			switch (comp) {
			case 0:
				result = draw;
				break;

			case 1:
				result = winn;
				break;
			case 2:
				result = loose;
				break;
			}
			break;
		case 1:
			switch (comp) {
			case 0:
				result = loose;
				break;
			case 1:
				result = draw;
				break;
			case 2:
				result = winn;
				break;
			}
			break;
		case 2:
			switch (comp) {
			case 0:
				result = winn;
				break;
			case 1:
				result = loose;
				break;
			case 2:
				result = draw;
				break;
			}
			break;
		}
		return result;
	}
}
