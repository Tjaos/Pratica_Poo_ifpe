package lista01;

public class TesteUtil {
    public static void main(String[] args){
         // Teste do método somar
         System.out.println("Teste somar:");
         System.out.println("somar(5, 3) = " + Util.somar(5, 3)); // Deve retornar 8
         System.out.println();
 
         // Teste do método somarPositivo
         System.out.println("Teste somarPositivo:");
         System.out.println("somarPositivo(-5, 3) = " + Util.somarPositivo(-5, 3)); // Deve retornar 2
         System.out.println("somarPositivo(5, -3) = " + Util.somarPositivo(5, -3)); // Deve retornar 2
         System.out.println("somarPositivo(-5, -3) = " + Util.somarPositivo(-5, -3)); // Deve retornar 0
         System.out.println();
 
         // Teste do método subtrair
         System.out.println("Teste subtrair:");
         System.out.println("subtrair(5.5, 3.2) = " + Util.subtrair(5.5, 3.2)); // Deve retornar 2.3
         System.out.println();
 
         // Teste do método subtrairPositivo
         System.out.println("Teste subtrairPositivo:");
         System.out.println("subtrairPositivo(3.2, 5.5) = " + Util.subtrairPositivo(3.2, 5.5)); // Deve retornar 2.3
         System.out.println();
 
         // Teste do método obterResto
         System.out.println("Teste obterResto:");
         System.out.println("obterResto(10, 3) = " + Util.obterResto(10, 3)); // Deve retornar 1
         System.out.println();
 
         // Teste do método ajustarNota
         System.out.println("Teste ajustarNota:");
         System.out.println("ajustarNota(-1) = " + Util.ajustarNota(-1)); // Deve retornar 0
         System.out.println("ajustarNota(5) = " + Util.ajustarNota(5)); // Deve retornar 5
         System.out.println("ajustarNota(12) = " + Util.ajustarNota(12)); // Deve retornar 10
         System.out.println();
 
         // Teste do método calcularMedia
         System.out.println("Teste calcularMedia:");
         System.out.println("calcularMedia(8, 9, 7) = " + Util.calcularMedia(8, 9, 7)); // Deve retornar 8.0
         System.out.println();
 
         // Teste do método verificarAprovacao
         System.out.println("Teste verificarAprovacao:");
         System.out.println("verificarAprovacao(8, 9, 7) = " + Util.verificarAprovacao(8, 9, 7)); // Deve retornar "APROVADO"
         System.out.println("verificarAprovacao(5, 6, 2) = " + Util.verificarAprovacao(5, 6, 2)); // Deve retornar "EXAME FINAL"
         System.out.println("verificarAprovacao(1, 1, 1) = " + Util.verificarAprovacao(1, 1, 1)); // Deve retornar "REPROVADO"
         System.out.println();
 
         // Teste do método verificarAprovacaoCompleta
         System.out.println("Teste verificarAprovacaoCompleta:");
         System.out.println("verificarAprovacaoCompleta(8, 9, 7, 0.80) = " + Util.verificarAprovacaoCompleta(8, 9, 7, 0.80)); // Deve retornar "APROVADO"
         System.out.println("verificarAprovacaoCompleta(5, 6, 2, 0.70) = " + Util.verificarAprovacaoCompleta(5, 6, 2, 0.70)); // Deve retornar "REPROVADO POR FALTA"
         System.out.println("verificarAprovacaoCompleta(5, 6, 2, 0.80) = " + Util.verificarAprovacaoCompleta(5, 6, 2, 0.80)); // Deve retornar "EXAME FINAL"
    }
}
