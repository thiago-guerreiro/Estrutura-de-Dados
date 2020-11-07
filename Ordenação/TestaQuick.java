import javax.swing.JOptionPane;
public class TestaQuick {
   public static void main(String args[]) {
      QuickSort obj = new QuickSort();
      int tam = 100, i;
      int vetor[] = new int[tam];
      String msg = "";
      // gera um vetor aleatório de 100 posições
      for (i = 0; i < vetor.length; i++) {
         vetor[i] = (int)(Math.random() * tam);
      }
      msg += "Vetor sem ordenar:\n" + obj.showVetor(vetor);
      // chama o método de ordenação
      obj.quick(vetor);
      msg += "\nVetor ordenado:\n"    + obj.showVetor(vetor);
      JOptionPane.showMessageDialog(null, msg);
      System.exit(0);
   }
}