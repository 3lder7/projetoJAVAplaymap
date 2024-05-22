package Aplicativo;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Cliente {
    String nome;
    String[] email = new String[2];
    String[] senha = new String[2];
    
    public void registrarUsuario() {
        ImageIcon icon = new ImageIcon("D:\\Eclipse\\eclipse-workspace\\PlayMap\\src\\Aplicativo\\registro.png");

        nome = JOptionPane.showInputDialog(null, "Digite o nome do usuário:", "Registro", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString();
        email[0] = JOptionPane.showInputDialog(null, "Registre seu e-mail:", "Registro", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString();
        senha[0] = JOptionPane.showInputDialog(null, "Registre sua senha:", "Registro", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString();

        do {
            email[1] = JOptionPane.showInputDialog(null, "Email:", "Login", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString();
            senha[1] = JOptionPane.showInputDialog(null, "Senha:", "Login", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString();

            if (email[0].equals(email[1]) && senha[0].equals(senha[1])) {
                JOptionPane.showMessageDialog(null, "Olá! " + nome + ", Bem-vindo ao Sistema", "Login bem-sucedido", JOptionPane.INFORMATION_MESSAGE, icon);
            } else {
                JOptionPane.showMessageDialog(null, "Erro, login ou senha incorretos, tente novamente", "Erro de Login", JOptionPane.ERROR_MESSAGE, icon);
            }
        } while (!email[0].equals(email[1]) || !senha[0].equals(senha[1]));
    }
}
