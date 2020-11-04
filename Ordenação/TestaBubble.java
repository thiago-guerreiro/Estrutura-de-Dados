import javax.swing.JOptionPane;
public class TestaBubble {
   public static void main(String args[]) {
      Lista04 obj = new Lista04();
      int tam = 100, i;
      int vetor[] = new int[tam];
      String msg = "";
      // gera um vetor aleat�rio de 100 posi��es
      for (i = 0; i < vetor.length; i++) {
         vetor[i] = (int)(Math.random() * tam);
      }
      msg += "Vetor sem ordenar:\n" + obj.showVetor(vetor);
      // chama o m�todo de ordena��o
      obj.bubble(vetor);
      msg += "\nVetor ordenado:\n"    + obj.showVetor(vetor);
      JOptionPane.showMessageDialog(null, msg);
      System.exit(0);
   }
}