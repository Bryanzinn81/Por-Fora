
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        /*   analisarCandidato(1900.0);
        analisarCandidato(2500.0);
        analisarCandidato(2000.0);*/

        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendito = valorPretendido();

            System.out.println("O candidato " + candidato + "solicitou esse valor de salario" + salarioPretendito);
            if (salarioBase >= salarioPretendito) {
                System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendito) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendito) {
            System.out.println("Ligar para o Candidato");
        } else if (salarioBase == salarioPretendito) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
