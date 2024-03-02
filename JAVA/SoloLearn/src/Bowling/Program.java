package Bowling;

import java.util.Scanner;

public class Program {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        try (Scanner sc = new Scanner(System.in)) {
			for(int i=0;i<3;i++) {
			    String input = sc.nextLine();
			    String[] values = input.split(" ");
			    String name = values[0];
			    int points = Integer.parseInt(values[1]);
			    game.addPlayer(name, points);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        game.getWinner();
    }
}
