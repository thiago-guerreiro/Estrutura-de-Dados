import javax.swing.JOptionPane;
public class TestePilhaInt {
   public static void main(String args[]) {
      PilhaInt p = new PilhaInt(5);
      int    opcao;
      String msg      = "";
      String opcoes[] = {"Insere", "Retira", "Sair"};
      
      do {
         // informa se a pilha est� vazia
         msg = "Pilha vazia: ";
         if (p.isEmpty()) msg += "Sim";
         else             msg += "N�o  --> Topo: " + p.top();
      
         // informa se pilha est� cheia
         msg += "\nPilha cheia: ";
         if (p.isFull()) msg += "Sim";
         else            msg += "N�o";
         
         // quantidade de elementos na pilha
         msg += "\nQuantidade de elementos na Pilha: " + p.size();

         msg += "\n\n\nQual a sua op��o?";
      
         opcao = JOptionPane.showOptionDialog(
                        null,
                        msg,
                        "Menu...",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcoes,
                        opcoes[opcoes.length-1]);
          // insere elemento
          if (opcao == 0) {
            if (!p.isFull())  {
               int nroNovo = Integer.parseInt( JOptionPane.showInputDialog("Inserir qual elemento?") );
               p.push(nroNovo);
               msg = "O elemento " + nroNovo + " foi inserido no pilha";
            }
            else msg = "Pilha cheia. N�o � poss�vel inserir elemento novo";
            JOptionPane.showMessageDialog(null,msg);
          }
          // retira elemento
          else if (opcao == 1) {
            if (p.isEmpty()) msg = "Pilha vazia. Imposs�vel retirar elementos";
            else             msg = "Elemento retirado da pilha: " + p.pop();
            JOptionPane.showMessageDialog(null,msg);
          }
          // exibe elemento
          else if (opcao == 2) {
          }
      } while(opcao != opcoes.length-1);

      System.exit(0);
   }   
}