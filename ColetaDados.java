import java.util.Scanner;

public class ColetaDados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- SISTEMA DE SELECAO INTERESTELAR ---");
        System.out.println("Por favor, insira os dados do candidato.");

        System.out.print("Nome completo do aspirante: ");
        String nome = leitor.nextLine();

        System.out.print("Idade terrestre: ");
        int idade = leitor.nextInt();

        System.out.print("Altura (em metros): ");
        double altura = leitor.nextDouble();

        System.out.print("Possui experiencia com pilotagem de drones? (true/false): ");
        boolean temExperiencia = leitor.nextBoolean();

        System.out.println("\n--- PROCESSANDO DADOS DA FICHA ---");
        System.out.printf("Candidato: %s%n", nome);
        System.out.printf("Idade: %d anos | Altura: %.2f m%n", idade, altura);
        System.out.println("Qualificado para pilotagem? " + (temExperiencia ? "Sim" : "Nao"));

        if (idade >= 18 && idade <= 45) {
            System.out.println("Status: Apto para os testes fisicos.");
        } else {
            System.out.println("Status: Idade fora dos parametros da missao.");
        }

        leitor.close();
        System.out.println("--------------------------------------");
    }
}
