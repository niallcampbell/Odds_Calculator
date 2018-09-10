import java.util.Scanner;

public class OddsCalculator
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your odds (e.g. 3/1, 5/4, etc.): ");
        String odds = scan.nextLine();
        
        System.out.println("Please enter the amount of money you wish to bet: ");
        String stakeTemp = scan.nextLine();
        
        double stake = Double.parseDouble(stakeTemp);
        
        double returnOnBet = calculate(odds, stake);
        
        System.out.println();
        System.out.println("You will earn €" + returnOnBet + " if you win plus your initial stake of €" + stake + ". ");
        
        
    }
    
    public static double calculate(String odds, double stake)
    {
        String[] parts = odds.split("/");
        String part1 = parts[0];
        String part2 = parts[1];
        
        double odd1 = Double.parseDouble(part1);
        double odd2 = Double.parseDouble(part2);
        
        double temp = odd1/odd2;
        
        double returnMoney = stake * temp;
        
        return returnMoney;
    }
}
