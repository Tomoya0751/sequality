/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        int sum = new Calculate().sum(2, 3);
        double ave = new Calculate().average(sum, 2);
        System.out.println("Sum of 2 and 3 is " + sum + "." + "Average is " + ave + ".");
        sum = new Calculate().sumOfRange(1, 10);
        ave = new Calculate().average(sum, 10);
        System.out.println("Sum of 1 to 10 is " + sum + "." + "Average is " + ave + ".");
        System.out.println("Sum of odd of 1 to 10 is " + new Calculate().sumOfOdd(1, 10) + "." + "Sum of even is " + new Calculate().sumOfEven(1, 10) + ".");
    }
}
