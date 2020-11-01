import javax.swing.JOptionPane;
public class TestaBuscaLinear {
   public static void main(String args[]) {
      BuscaLinear obj = new BuscaLinear();
      int tam     = 100, i;
      int vetor[] = new int[tam];
      int resultado, numBusca;
      String  msg = "";
      // gera um vetor aleat�rio de 100 posi��es
      for (i = 0; i < vetor.length; i++) {
         vetor[i] = (int)(Math.random() * tam);
      }
      numBusca = Integer.parseInt( JOptionPane.showInputDialog("Procurar por qual n�mero?") );
      resultado = obj.linearR(numBusca, vetor);
      msg = "O n�mero " + numBusca;
      if (resultado == -1) msg += " n�o foi encontrado no vetor";
      else              msg += " est� na posi��o n�mero " + resultado;
      JOptionPane.showMessageDialog(null, msg);
      System.exit(0);   
   }
}