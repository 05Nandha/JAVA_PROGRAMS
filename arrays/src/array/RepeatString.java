package array;

public class RepeatString {
	public static void main(String[]args) {
	String cardnum = "1234 5678 9012 3456";
    String[] parts = cardnum.split(" ");
    for (int i = 0; i < 3; i++) {
        parts[i] = "*".repeat(4); 
    }
    String hiddenCard = String.join(" ", parts);
    System.out.println("Hidden Card Number: " + hiddenCard);
}
}