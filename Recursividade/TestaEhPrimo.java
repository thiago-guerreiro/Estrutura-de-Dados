import javax.swing.JOptionPane;
public class TestaEhPrimo {
   public static void main(String args[]) {
      EhPrimo  obj = new EhPrimo();
      int      nroDig;
      boolean  resultado;
      String   msg = "";
      nroDig    = Integer.parseInt( JOptionPane.showInputDialog("Informe um n�mero inteiro:") );
      resultado = obj.ehPrimoR(nroDig);
      msg = "O n�mero " + nroDig;
      if (resultado) msg += " � primo";
      else        msg += " n�o � primo";     
      JOptionPane.showMessageDialog(null, msg);
      System.exit(0);   
   }
}