import javax.swing.JOptionPane;

public class FilaBanco {
    public static void main (String arg []) {
    FilaInt filaPref = new FilaInt(10);
    FilaInt filaCom  = new FilaInt(10);
    int senha        = 1, opcao;
    String msg       = "";
    String opcoes [] = {"Idosos e Gestante", "Demais Clientes", "Próximo", "Sair"};
    //Menu
    do{
        msg = "\nFila Preferencial " + filaPref.show() + 
                "\nFila Comum "      + filaCom.show() +
                "\n\nQual sua escolha?";
                         
        opcao = JOptionPane.showOptionDialog(null,
                                             msg,
                                             "Banco",
                                             JOptionPane.DEFAULT_OPTION,
                                             JOptionPane.QUESTION_MESSAGE,
                                             null,
                                             opcoes,
                                             opcoes[opcoes.length-1]);
        
        switch (opcao) {
            case 0:
                filaPref.insert(senha++); //insere na fila preferencia
                break;
            case 1:
                filaCom.insert(senha++); //insere na fila comum
                break;
            case 2:
                if      (!filaPref.isEmpty())  msg = "Senha " + filaPref.remove() + " dirigir-se ao Caixa";
                else if (!filaCom.isEmpty())   msg = "Senha " + filaCom.remove()  + " dirigir-se ao Caixa";
                else                        msg = "Agencia vazia";
                JOptionPane.showMessageDialog(null, msg);
                break;
            default:
                break;
        }
    
      } while (opcao != opcoes.length-1);
    System.exit(0);
   }
}
