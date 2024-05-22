package Aplicativo;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Agendamento {
    private ArrayList<String> horariosQuadraSantoInacio = new ArrayList<>();
    private ArrayList<String> horariosQuadraDeBrotas = new ArrayList<>();
    private ArrayList<String> horariosCampoBeira = new ArrayList<>();
    private ArrayList<String> horariosRemovidos1 = new ArrayList<>();
    private ArrayList<String> horariosRemovidos2 = new ArrayList<>();
    private ArrayList<String> horariosRemovidos3 = new ArrayList<>();
    private String[] nome = {"1 - Quadra Santo Inácio ", "2 - Quadra de Brotas ", "3 - Campo Beira Rio "};
    private String StringUser;
    private int userAgend;

    public Agendamento() {
        armazenaHoras();
    }

    public void armazenaHoras(){
        horariosQuadraSantoInacio.add("12:00");
        horariosQuadraSantoInacio.add("13:30");
        horariosQuadraSantoInacio.add("16:20");
        horariosQuadraDeBrotas.add("19:30");
        horariosQuadraDeBrotas.add("11:30");
        horariosQuadraDeBrotas.add("6:20");
        horariosCampoBeira.add("22:00");
        horariosCampoBeira.add("10:00");
        horariosCampoBeira.add("15:00");
    }

    public void verParaRealizar(){
        ImageIcon icon = new ImageIcon("D:\\Eclipse\\eclipse-workspace\\PlayMap\\src\\Aplicativo\\agenda2.png");

        String message = "Digite qual desses campos você gostaria de realizar a Agenda:\n";
        for(String indiceCampo : nome){
            message += indiceCampo + "\n";
        }
        String input = JOptionPane.showInputDialog(null, message, "Escolha um campo", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString();
        userAgend = Integer.parseInt(input);
        realizarAgendamento();
    }

    public void realizarAgendamento(){
        switch (userAgend) {
            case 1:
                ImageIcon icon1 = new ImageIcon("D:\\\\Eclipse\\\\eclipse-workspace\\\\PlayMap\\\\src\\\\Aplicativo\\\\agenda2.png");

                String message1 = "Digite qual horário gostaria de agendar:\n";
                for(String indiceHora : horariosQuadraSantoInacio){
                    message1 += indiceHora + "\n";
                }
                StringUser = JOptionPane.showInputDialog(null, message1, "Agendar Horário", JOptionPane.PLAIN_MESSAGE, icon1, null, "").toString();
                if (horariosQuadraSantoInacio.contains(StringUser)){
                    horariosQuadraSantoInacio.remove(StringUser);
                    horariosRemovidos1.add(StringUser);
                }
                JOptionPane.showMessageDialog(null, "Horário Agendado: " + StringUser + "\nHorários Disponíveis:" + horariosQuadraSantoInacio, "Agendamento realizado", JOptionPane.INFORMATION_MESSAGE, icon1);
                break;
            case 2:
                ImageIcon icon2 = new ImageIcon("D:\\\\Eclipse\\\\eclipse-workspace\\\\PlayMap\\\\src\\\\Aplicativo\\\\agenda2.png");

                String message2 = "Digite qual horário gostaria de agendar:\n";
                for(String indiceHora : horariosQuadraDeBrotas){
                    message2 += indiceHora + "\n";
                }
                StringUser = JOptionPane.showInputDialog(null, message2, "Agendar Horário", JOptionPane.PLAIN_MESSAGE, icon2, null, "").toString();
                if (horariosQuadraDeBrotas.contains(StringUser)){
                    horariosQuadraDeBrotas.remove(StringUser);
                    horariosRemovidos2.add(StringUser);
                }
                JOptionPane.showMessageDialog(null, "Horário Agendado: " + StringUser + "\nHorários Disponíveis:" + horariosQuadraDeBrotas, "Agendamento realizado", JOptionPane.INFORMATION_MESSAGE, icon2);
                break;
            case 3:
                ImageIcon icon3 = new ImageIcon("D:\\\\Eclipse\\\\eclipse-workspace\\\\PlayMap\\\\src\\\\Aplicativo\\\\agenda2.png");

                String message3 = "Digite qual horário gostaria de agendar:\n";
                for(String indiceHora : horariosCampoBeira){
                    message3 += indiceHora + "\n";
                }
                StringUser = JOptionPane.showInputDialog(null, message3, "Agendar Horário", JOptionPane.PLAIN_MESSAGE, icon3, null, "").toString();
                if (horariosCampoBeira.contains(StringUser)){
                    horariosCampoBeira.remove(StringUser);
                    horariosRemovidos3.add(StringUser);
                }
                JOptionPane.showMessageDialog(null, "Horário Agendado: " + StringUser + "\nHorários Disponíveis:" + horariosCampoBeira, "Agendamento realizado", JOptionPane.INFORMATION_MESSAGE, icon3);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                break;
        } 
    }
    
    public void exibirHorariosRemovidos() {
        ImageIcon icon = new ImageIcon("D:\\\\Eclipse\\\\eclipse-workspace\\\\PlayMap\\\\src\\\\Aplicativo\\\\agenda2.png");

        String message = "Qual local gostaria de remover seu agendamento?\n";
        for(String indiceCampo : nome){
            message += indiceCampo + "\n";
        }
        String input = JOptionPane.showInputDialog(null, message, "Remover Agendamento", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString();
        userAgend = Integer.parseInt(input);
        switch (userAgend) {
            case 1:
                ImageIcon icon1 = new ImageIcon("D:\\\\Eclipse\\\\eclipse-workspace\\\\PlayMap\\\\src\\\\Aplicativo\\\\agenda2.png");

                String message1 = "Digite qual horário gostaria de remover:\n";
                for(String indiceHora : horariosRemovidos1){
                    message1 += indiceHora + " - Agendado = Quadra Santo Inácio\n";
                }
                StringUser = JOptionPane.showInputDialog(null, message1, "Remover Horário", JOptionPane.PLAIN_MESSAGE, icon1, null, "").toString();
                if(horariosRemovidos1.contains(StringUser)){
                    horariosRemovidos1.remove(StringUser);
                    horariosQuadraSantoInacio.add(StringUser);
                }
                break;
            case 2:
                ImageIcon icon2 = new ImageIcon("D:\\\\Eclipse\\\\eclipse-workspace\\\\PlayMap\\\\src\\\\Aplicativo\\\\agenda2.png");

                String message2 = "Digite qual horário gostaria de remover:\n";
                for(String indiceHora : horariosRemovidos2){
                    message2 += indiceHora + " - Agendado = Quadra de Brotas\n";
                }
                StringUser = JOptionPane.showInputDialog(null, message2, "Remover Horário", JOptionPane.PLAIN_MESSAGE, icon2, null, "").toString();
                if(horariosRemovidos2.contains(StringUser)){
                    horariosRemovidos2.remove(StringUser);
                    horariosQuadraDeBrotas.add(StringUser);
                }
                break;
            case 3:
                ImageIcon icon3 = new ImageIcon("D:\\\\Eclipse\\\\eclipse-workspace\\\\PlayMap\\\\src\\\\Aplicativo\\\\agenda2.png");

                String message3 = "Digite qual horário gostaria de remover:\n";
                for(String indiceHora : horariosRemovidos3){
                    message3 += indiceHora + " - Agendado = Campo do Beira\n";
                }
                StringUser = JOptionPane.showInputDialog(null, message3, "Remover Horário", JOptionPane.PLAIN_MESSAGE, icon3, null, "").toString();
                if(horariosRemovidos3.contains(StringUser)){
                    horariosRemovidos3.remove(StringUser);
                    horariosCampoBeira.add(StringUser);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
