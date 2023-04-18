import java.util.Scanner;
import java.lang.Math;

class Main {
  // Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
  
  public static void main(String[] args) {
    int area;
    double litros;
    double quantidadedeLatas;
    double valorFinal;
    Scanner input;
    
  // O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
    
    input = new Scanner(System.in);
    area = input.nextInt();
    
    // Calcular a quantidade de latas de tinta a serem compradas e o preco total
  
    litros = area / 3;
    quantidadedeLatas = Math.ceil(litros / 18);
    valorFinal = quantidadedeLatas * 80;
    
    // Mostrar a quantidade de latas de tinta a serem compradas e o preco total
    
    System.out.print(quantidadedeLatas + "\n");
    
    System.out.print("R$ " + valorFinal);
  }
}