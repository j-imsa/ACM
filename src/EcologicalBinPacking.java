import java.util.Arrays;
import java.util.Scanner;

// 102 - Ecological Bin Packing
public class EcologicalBinPacking {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String inputString = scanner.nextLine();
			String[] inputValuesAsString = inputString.split(" ");
			Garbage[] garbages = new Garbage[9];
			for (int i = 0; i < garbages.length; i++) {
				if (i == 0 || i == 3 || i == 6) {
					COLOR color = COLOR.BROWN;
					int binNumber = -1;
					if (i == 0) {
						binNumber = 1;
					} else if (i == 3) {
						binNumber = 2;
					} else {
						binNumber = 3;
					}
					garbages[i] = new Garbage(color, binNumber, Integer.valueOf(inputValuesAsString[i]));					
				} else if (i == 1 || i == 4 || i == 7) {
					COLOR color = COLOR.GEEN;
					int binNumber = -1;
					if (i == 1) {
						binNumber = 1;
					} else if (i == 4) {
						binNumber = 2;
					} else {
						binNumber = 3;
					}
					garbages[i] = new Garbage(color, binNumber, Integer.valueOf(inputValuesAsString[i]));					
				} else {
					COLOR color = COLOR.CLEAR;
					int binNumber = -1;
					if (i == 2) {
						binNumber = 1;
					} else if (i == 5) {
						binNumber = 2;
					} else {
						binNumber = 3;
					}
					garbages[i] = new Garbage(color, binNumber, Integer.valueOf(inputValuesAsString[i]));					
				}
			}
			
			// bin1 => min(bin1)
			// bin2 => max(bin2)
			// bin3 => remained
			
			String order = "";
			String order1 = findMinInBin1(garbages);
			String order2 = finMaxInBin2(garbages);
			
			order = findOrder(order1, order2);
			
			System.out.println(order);
		}
	}

	private static String findOrder(String order1, String order2) {
		
		if (order1.length() == 1) {
			if (order2.length() == 1) {
				return order1 + order2 + insertLastOrder(order1 + order2);
			} else if (order2.length() == 2) {
				order2 = order2.replace(order1, "");
				if (order2.length() != 1) {
					order2 = sortByAlphabet(order2);
				}
				return order1 + order2 + insertLastOrder(order1 + order2);
			} else {
				order2 = order2.replace(order1, "");
				order2 = sortByAlphabet(order2);
				return order1 + order2 + insertLastOrder(order1 + order2);
			}
		} else if (order1.length() == 2) {
			if (order2.length() == 1) {
				order1 = order1.replace(order2, "");
				order1 = sortByAlphabet(order1);
				return order1 + order2 + insertLastOrder(order1 + order2);
			} else if (order2.length() == 2) {
				order1 = sortByAlphabet(order1);
				order2 = order2.replace(order1, "");
				order2 = sortByAlphabet(order2);
				return order1 + order2 + insertLastOrder(order1 + order2);
			} else {
				order1 = sortByAlphabet(order1);
				order2 = order2.replace(order1, "");
				order2 = sortByAlphabet(order2);
				return order1 + order2 + insertLastOrder(order1 + order2);
			}
		} else {
			if (order2.length() == 1) {
				order1 = order1.replace(order2, "");
				order1 = sortByAlphabet(order1);
				return order1 + order2 + insertLastOrder(order1 + order2);
			} else if (order2.length() == 2) {
				order1 = sortByAlphabet(order1);
				order2 = order2.replace(order1, "");
				order2 = sortByAlphabet(order2);
				return order1 + order2 + insertLastOrder(order1 + order2);
			} else {
				order1 = sortByAlphabet(order1);
				order2 = order2.replace(order1, "");
				order2 = sortByAlphabet(order2);
				return order1 + order2 + insertLastOrder(order1 + order2);
			}
		}
		
	}

	private static String sortByAlphabet(String str) {
	    char charArray[] = str.toCharArray();
	    Arrays.sort(charArray);
		return charArray[0]+"";
	}

	private static String insertLastOrder(String order) {
		String tmp = "BCG";
		for (int i = 0; i < order.length(); i++) {
			tmp = tmp.replace(order.charAt(i)+"", "");
		}
		return tmp;
	}

	private static String finMaxInBin2(Garbage[] garbages) {
		String result = "";
		int max = Integer.MIN_VALUE;
		for (Garbage garbage : garbages) {
			if (garbage.binNumber != 2) {
				continue;
			}
			if (garbage.value >= max) {
				max = garbage.value;
				if (garbage.color.equals(COLOR.BROWN)) {
					result += 'B';
				}
				if (garbage.color.equals(COLOR.GEEN)) {
					result += 'G';
				}
				if (garbage.color.equals(COLOR.CLEAR)) {
					result += 'C';
				}
			}
		}
		return result;
	}

	private static String findMinInBin1(Garbage[] garbages) {
		String result = "";
		int min = Integer.MAX_VALUE;
		for (Garbage garbage : garbages) {
			if (garbage.binNumber != 1) {
				continue;
			}
			if (garbage.value <= min) {
				min = garbage.value;
				if (garbage.color.equals(COLOR.BROWN)) {
					result += 'B';
				}
				if (garbage.color.equals(COLOR.GEEN)) {
					result += 'G';
				}
				if (garbage.color.equals(COLOR.CLEAR)) {
					result += 'C';
				}
			}
		}
		return result;
	}

}

enum COLOR {
	BROWN, GEEN, CLEAR
}

class Garbage {
	COLOR color;
	int binNumber;
	int value;
	public Garbage(COLOR color, int binNumber, int value) {
		super();
		this.color = color;
		this.binNumber = binNumber;
		this.value = value;
	}
	
}

class RecyclingBin {
	COLOR color;
	int value;
}