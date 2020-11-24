/* preenche com n�meros rand�micos (valor m�ximo = 100) um vetor de
   n�meros inteiros com 10 posi��es e, posteriormente, exibe todos os 
   elementos e as quantidades de n�meros pares e �mpares que foram gerados  */

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
      String msg  = "Conte�do do vetor\n";
      // preenche vetor e verifica se � PAR
      for (i = 0; i < vet.length; i++) {
         vet[i] = geraRand(100);
         if (ehPar(vet[i])) qPar++;
      }
      // criar mensagem
      for (i = 0; i < vet.length; i++) {
         msg += " " + vet[i];
      }
      msg += "\n\nQuantidade de n�meros pares: " + qPar +
             "\nQuantidade de n�meros �mpares: " + (vet.length - qPar);
      // exibe mensagem
      JOptionPane.showMessageDialog(null, msg);
   }
}