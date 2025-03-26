package Aplicativo;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class CampoFutebol {
    String nome[] = {"1 - Quadra Santo Inácio ", "2 - Quadra de Brotas ", "3 - Campo Beira Rio"};
    String endereco[] = {"|| Rua Oliveira || Bairro = Jardim Santo Inácio", "|| Rua Pedra Caída || Bairro = Brotas", "|| Rua Santo Limão || Bairro = Nordeste"};
    int user;

    public void mostrarCampos() {
        ImageIcon icon = new ImageIcon("D:\\Eclipse\\eclipse-workspace\\PlayMap\\src\\Aplicativo\\campo2.png");

        StringBuilder message = new StringBuilder("Digite qual desses campos você gostaria de verificar: \n");
        for (String indiceCampo : nome) {
            message.append(indiceCampo).append("\n");
        }
        String userInput = JOptionPane.showInputDialog(null, message.toString(), "Escolha um campo", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString();
        user = Integer.parseInt(userInput);
    }

    public void executar() {
        mostrarCampos();
        switch (user) {
            case 1:
                mostrarEndereco(nome[0], endereco[0]);
                break;
            case 2:
                mostrarEndereco(nome[1], endereco[1]);
                break;
            case 3:
                mostrarEndereco(nome[2], endereco[2]);
                break;
            case 6:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarEndereco(String nomeCampo, String enderecoCampo) {
        ImageIcon icon = new ImageIcon("D:\\Eclipse\\eclipse-workspace\\PlayMap\\src\\Aplicativo\\campo2.png");

        StringBuilder message = new StringBuilder("Endereço do campo:\n").append(nomeCampo).append(enderecoCampo).append("\n");
        message.append(" - Digite 5 para voltar ao menu\n");
        message.append(" - Digite 6 para verificar outra localização");
        String userInput = JOptionPane.showInputDialog(null, message.toString(), "Endereço do Campo", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString();
        user = Integer.parseInt(userInput);
        if (user == 6) {
            executar();
        }
    }
}
