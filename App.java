package Aplicativo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Cliente instCliente = new Cliente();
        CampoFutebol instCampo = new CampoFutebol();
        Agendamento instAgenda = new Agendamento(); 
        int user;

        do {
            String userInput = (String) JOptionPane.showInputDialog(
                null,
                "-----BEM VINDO AO PLAYMAP-----\n" +
                "Digite a opção desejada:\n" +
                "1 - Registrar Usuário\n" +
                "2 - Verificar Endereço de Quadras e Campos\n" +
                "3 - Realizar Agendamento\n" +
                "4 - Remover Agendamento\n" +
                "5 - Sair",
                "Menu",
                JOptionPane.PLAIN_MESSAGE,
                new ImageIcon("D:\\Eclipse\\eclipse-workspace\\PlayMap\\src\\Aplicativo\\icone.png"),
                null,
                ""
            );

            user = Integer.parseInt(userInput);

            if(user == 1) {
                instCliente.registrarUsuario();
            }
            if(user == 2) {
                instCampo.executar();
            }
            if(user == 3) {
                instAgenda.verParaRealizar();
            }
            if(user == 4) {
                instAgenda.exibirHorariosRemovidos();
            }
        } while(user != 5);
    }
}
