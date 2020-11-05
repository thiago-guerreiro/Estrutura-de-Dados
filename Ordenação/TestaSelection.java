import javax.swing.JOptionPane;
public class TestaSelection {
   public static void main(String args[]) {
      TestaSelection obj = new TestaSelection();
      int tam = 100, i;
      int vetor[] = new int[tam];
      String msg = "";
      // gera um vetor aleat�rio de 100 posi��es
      for (i = 0; i < vetor.length; i++) {
         vetor[i] = (int)(Math.random() * tam);
      }
      msg += "Vetor sem ordenar:\n" + obj.showVetor(vetor);
      // chama o m�todo de ordena��o
      obj.selection(vetor);
      msg += "\nVetor ordenado:\n"    + obj.showVetor(vetor);
      JOptionPane.showMessageDialog(null, msg);
      System.exit(0);
   }
}