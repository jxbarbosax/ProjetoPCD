import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

public class GUI {
    //Atributos
    private JFrame frame;
    private JList<String> lista;
    private JTextField campoPesquisa;
    private Socket node;

    //Construtor
    public GUI(Socket no) {
        this.node = no;

        frame = new JFrame("Projeto PCD");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.setLocationRelativeTo(null);

        JPanel painelProcura = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel p = new JLabel("Texto a procurar:");
        painelProcura.add(p);

        campoPesquisa = new JTextField(20);
        painelProcura.add(campoPesquisa);

        JButton procurar = new JButton("Procurar");
        procurar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String palavraChave = campoPesquisa.getText();
                // Lógica de Pesquisa (2BK)
            }
        });
        painelProcura.add(procurar);
        frame.add(painelProcura, BorderLayout.NORTH);

        lista = new JList<>();
        JScrollPane painelLista = new JScrollPane(lista);
        frame.add(painelLista, BorderLayout.CENTER);

        JPanel painelButoes = new JPanel();
        painelButoes.setLayout(new BoxLayout(painelButoes,BoxLayout.Y_AXIS));
        painelButoes.add(Box.createVerticalStrut(10));

        JButton donwload = new JButton("Descarregar");
        painelButoes.add(donwload);
        JButton conectar = new JButton("Ligar a Nó");
        painelButoes.add(conectar);
        frame.add(painelButoes, BorderLayout.EAST);
    }

    public void ver(){
        frame.setVisible(true);
    }
}
