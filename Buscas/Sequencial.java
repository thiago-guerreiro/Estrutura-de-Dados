import javax.swing.JOptionPane;

public class Sequencial {

   public static void main(String args[]) {
      Buscas obj = new Buscas();
      int i, nroDig, icone, result, vet[] = new int[10000];
      String msg = "O número ";
      // gera números aleatorios
      for (i = 0; i < vet.length; i++) {
         vet[i] = (int)(Math.random() * 10000);
      }
      // solicita numero inteiro para usuario
      nroDig = Integer.parseInt( JOptionPane.showInputDialog("Digite o número a ser procurado no vetor:") );
      // faz a busca
      result = obj.buscaSeq(nroDig, vet);
      // exibi a resposta
      msg += nroDig + " ";
      if (result == -1) {
         msg += "não foi encontrado no vetor";
         icone = JOptionPane.ERROR_MESSAGE;
      }
      else {
         msg += "foi encontrado no índice " + result;
         icone = JOptionPane.WARNING_MESSAGE;
      }
      JOptionPane.showMessageDialog(null, msg, "Busca Linear", icone);
      System.exit(0);
   }
}