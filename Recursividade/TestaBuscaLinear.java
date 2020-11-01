import javax.swing.JOptionPane;
public class TestaBuscaLinear {
   public static void main(String args[]) {
      BuscaLinear obj = new BuscaLinear();
      int tam     = 100, i;
      int vetor[] = new int[tam];
      int resultado, numBusca;
      String  msg = "";
      // gera um vetor aleatório de 100 posições
      for (i = 0; i < vetor.length; i++) {
         vetor[i] = (int)(Math.random() * tam);
      }
      numBusca = Integer.parseInt( JOptionPane.showInputDialog("Procurar por qual número?") );
      resultado = obj.linearR(numBusca, vetor);
      msg = "O número " + numBusca;
      if (resultado == -1) msg += " não foi encontrado no vetor";
      else              msg += " está na posição número " + resultado;
      JOptionPane.showMessageDialog(null, msg);
      System.exit(0);   
   }
}