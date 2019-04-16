/*
 * InputUtil.java
 */
package utils;

import java.util.Scanner;

public class InputUtil {

	public static int getInt() {
		try {
			return Integer.parseInt(getString());
		} catch (IllegalArgumentException e) {
			return getInt();
		}
	}

	private static String getString() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
