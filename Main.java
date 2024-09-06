import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe suas horas trabalhadas: ");
    double hoursworked = scanner.nextDouble();

    System.out.println("Informe o valor da hora: ");
    double hourlyValue = scanner.nextDouble();

    double grossSalary = hoursworked * hourlyValue;
    double inss = 0;
    double ir = 0;

    if(grossSalary <= 1000){
      inss = grossSalary * 0.08;
    } else {
      inss = grossSalary * 0.09;
    }

    if(grossSalary > 500 && grossSalary <= 1000){
      ir = grossSalary * 0.06;
    } else if (grossSalary > 1000) {
      ir = grossSalary * 0.07;
    }
    
    double result = grossSalary - inss - ir;

    System.out.println("Salário bruto: " + result);
    
  }
}