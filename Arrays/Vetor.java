/* preenche com números randômicos (valor máximo = 100) um vetor de
   números inteiros com 10 posições e, posteriormente, exibe todos os 
   elementos e as quantidades de números pares e ímpares que foram gerados  */

import javax.swing.JOptionPane;

public class Vetor {

   public int geraRand(int limite) {
      return (int)(Math.random() * limite);
   }
      
   public boolean ehPar(int nro) {
      return (nro % 2 == 0);
   }
      
   public void vetRand() {
      int i, qPar = 0;
      int vet[]   = new int[10];
      String msg  = "Conteúdo do vetor\n";
      // preenche vetor e verifica se é PAR
      for (i = 0; i < vet.length; i++) {
         vet[i] = geraRand(100);
         if (ehPar(vet[i])) qPar++;
      }
      // criar mensagem
      for (i = 0; i < vet.length; i++) {
         msg += " " + vet[i];
      }
      msg += "\n\nQuantidade de números pares: " + qPar +
             "\nQuantidade de números ímpares: " + (vet.length - qPar);
      // exibe mensagem
      JOptionPane.showMessageDialog(null, msg);
   }
}