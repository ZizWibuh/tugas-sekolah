import java.util.Scanner;

public class bmi2 {
    public static void main(String[] args) {
    
        Scanner dataBmi = new Scanner(System.in);

        System.out.println("== Program Sederhana BMI ==");
        
        System.out.println("Input berat (kg): ");
        double berat = dataBmi.nextDouble();

        System.out.println("Input tinggi (m): ");
        double tinggi = dataBmi.nextDouble();

        double rumusBmi = berat/(tinggi*tinggi);
        System.out.println("BMI: "+ rumusBmi);

        dataBmi.close();
    }
}