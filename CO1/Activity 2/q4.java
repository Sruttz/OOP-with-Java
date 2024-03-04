//You have just started a sales job in a department store. Your pay consists of a base salary
// and a commission. The base salary is $5,000. The scheme shown below is used to determine
// the commission rate.
// Sales Amount Commission Rate
// $0.01–$5,000 8 percent
// $5,000.01–$10,000 10 percent
// $10,000.01 and above 12 percent
// Your goal is to earn $30,000 in a year. Write a program that will find out the minimum
// amount of sales you have to generate in order to make $30,000.
public class q4 {
    public static void main(String[] args)
    {
        double salesAmount=0,commission;

        do {
            if (salesAmount>10000)
                commission=(5000 * 0.08)+ (5000 * 0.1) + ((salesAmount - 10000) * 0.12);

            else if (salesAmount > 5000)
                commission=(5000 * 0.08) + ((salesAmount - 5000) * 0.1);

            else
                commission=salesAmount * 0.08;

            salesAmount++;
        } while (commission < 30000);
        System.out.println("Minimum sales in order to make $30,000 : " + salesAmount);
    }
}