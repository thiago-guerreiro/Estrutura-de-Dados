import javax.swing.JOptionPane;

public class Binaria {

   public static void main(String args[]) {
      Buscas obj = new Buscas();
      int i, nroDig, icone, result, vet[] = new int[10000];
      String msg = "O n�mero ";
      // gera n�meros aleat�rios
      for (i = 0; i < vet.length; i++) {
         vet[i] = (int)(Math.random() * 10000);
      }
      // solicita numero inteiro para usuario
      nroDig = Integer.parseInt( JOptionPane.showInputDialog("Digite o n�mero a ser procurado no vetor:") );
      // ordenar o vetor
      obj.insertSort(vet);
      // faz a busca
      result = obj.buscaBin(nroDig, vet);
      // cria e exibir a resposta
      msg += nroDig + " ";
      if (result == -1) {
         msg += "n�o foi encontrado no vetor";
         icone = JOptionPane.ERROR_MESSAGE;
      }
      else {
         msg += "foi encontrado no �ndice " + result;
         icone = JOptionPane.WARNING_MESSAGE;
      }
      JOptionPane.showMessageDialog(null, msg, "Busca Binaria", icone);
      System.exit(0);
   }
}