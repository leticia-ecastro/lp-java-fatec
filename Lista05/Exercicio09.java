//A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um programa em Java que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

//horasTrabalhadas = quantidade de horas trabalhadas no mês
//horasExtras = quantidade de horas extras no mês
//valorHora = valor da hora tradicional
//salarioNormal = salário pago pelo mês trabalhado
//salarioAdicional = salário pago pelas horas extras trabalhadas (quantidade de horasExtras * valor da hora extra)
//salarioTotal = salarioNormal + salarioAdicional

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		double horasTrabalhadas, valorHora, horasExtras, salarioNormal, salarioAdicional, salarioTotal;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite a quantidade de horas trabalhadas no mes: ");
		horasTrabalhadas = entrada.nextInt();
		System.out.print("Digite o valor pago por hora trabalhada: ");
		valorHora = entrada.nextInt();
		entrada.close();
		
		horasExtras = horasTrabalhadas - 120; //120 = horas trabalhadas no mês para gerar um salario padrao
		salarioNormal = (horasTrabalhadas - horasExtras) * valorHora;
		salarioAdicional = horasExtras * (valorHora + valorHora * 0.5); //hora extra = valor da hora normal + 50% dessde valor
		salarioTotal = salarioAdicional + salarioNormal;
		
		System.out.printf("Salario total do funcionario: R$%.2f.", salarioTotal);
	}
}

