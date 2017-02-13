import java.util.Random;
import java.util.Scanner;

public class PaperRockScissors {
	private static final PaperRockScissors RoShamBo = null;

	public static void main (String[] args) {
        System.out.println("\nPlay Rock Paper Scissors with me!");
        
        int player = player();
        int cpu = cpu();
        
        if (player == -1) {
            System.out.println(
                "\nYou don't want to play? Come back soon!");
            System.exit(0);
        } else {
            System.out.printf("You chose %s! CPU chose %s! ",
                RoShamBo.name(player), RoShamBo.name(cpu));
            
            String result = "";
            
            if(player == cpu)
                result = "Its a draw!";
            else if(((player + 1 <= 2)? player+1: 0) == cpu)
                result = "CPU wins!";
            else
                result = "You win!";
            
            System.out.printf(
                "%s\n\nThanks for playing! Come back soon!\n\n",
                result);
        }
    }
    
    public static int player() {
        Scanner stdin = new Scanner(System.in);
        
        int answer = -1;
        System.out.print(
        "Choose one of the following:\n" +
        "    1: Scissors (cuts paper)\n" +
        "    2: Rock     (knocks scissors)\n" +
        "    3: Paper    (wraps rock)\n");
        try {
            answer = stdin.nextInt()-1;
        } catch (java.util.InputMismatchException e) {
            // don't need to do anything but trap the error.
            // function handles no input just fine.
        }
        
        return (answer >= 0 && answer <= 2)? answer: -1;
    }
    
    public static int cpu() {
        Random gen = new Random();
        return gen.nextInt(3);
    }
    
    public static String name(int answer) {
        String name = "";
        
        switch(answer) {
            case 0: name = "Scissors"; break;
            case 1: name = "Rock"; break;
            case 2: name = "Paper"; break;
        }
        
        return name;
    }
}
