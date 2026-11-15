import java.util.Scanner;
public class Relogio {


    static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        // Meu aniversario e hora para o relogio

        int dia = 14;
        int mes = 10;
        int hora = 12;
        int minuto = 00;

        System.out.println("Relogio Paulo");
        System.out.println("Hora Atual: " + dia + "/" + mes + " - " + hora + ":" + minuto);

        // Colocar Horas
        System.out.print("Quantas horas deseja adicionar? ");
        int horasAdicionadas = entrada.nextInt();

        // Colocar Minutos
        System.out.print("Quantos minutos deseja adicionar? ");
        int minutosAdicionados = entrada.nextInt();

        // Soma dos minutos
        minuto = minuto + minutosAdicionados;

        // Minutos quando a hora virar
        hora = hora + (minuto / 60);
        minuto = minuto % 60;

        // Soma das horas
        hora = hora + horasAdicionadas;

        // Avanca os dias se passar da meia-noite
        if (hora >= 24) {
            int diasAdicionados = hora / 24;
            dia = dia + diasAdicionados;
            hora = hora - (diasAdicionados * 24);

        }

        // Exibe o resultado
        System.out.println("\nO tempo avançou");
        System.out.println("Novo dia: " + dia + "/" + mes);
        System.out.println("Hora: " + hora + ":" + minuto);

        entrada.close();











    }







    }