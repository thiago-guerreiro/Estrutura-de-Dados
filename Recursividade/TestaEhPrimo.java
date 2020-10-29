import javax.swing.JOptionPane;
public class TestaEhPrimo {
   public static void main(String args[]) {
      EhPrimo  obj = new EhPrimo();
      int      nroDig;
      boolean  resultado;
      String   msg = "";
      nroDig    = Integer.parseInt( JOptionPane.showInputDialog("Informe um número inteiro:") );
      resultado = obj.ehPrimoR(nroDig);
      msg = "O número " + nroDig;
      if (resultado) msg += " é primo";
      else        msg += " não é primo";     
      JOptionPane.showMessageDialog(null, msg);
      System.exit(0);   
   }
}