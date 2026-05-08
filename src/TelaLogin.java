import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {

    private JTextField campoEmail;
    private JPasswordField campoSenha;
    private JButton btnLogin;
    private JButton btnCadastrar;

    public TelaLogin() {
        setTitle("Diário de Treino - Login");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela no meio da tela

        // Layout em grid (3 linhas, 2 colunas) com espaçamento de 10px
        setLayout(new GridLayout(3, 2, 10, 10));

        // Instanciando os componentes visuais
        JLabel labelEmail = new JLabel(" E-mail:");
        campoEmail = new JTextField();

        JLabel labelSenha = new JLabel(" Senha:");
        campoSenha = new JPasswordField();

        btnLogin = new JButton("Entrar");
        btnCadastrar = new JButton("Cadastrar");

        // Adicionando os componentes na tela
        add(labelEmail);
        add(campoEmail);
        add(labelSenha);
        add(campoSenha);
        add(btnLogin);
        add(btnCadastrar);

        // Ação de clique do botão "Entrar"
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarLogin();
            }
        });

        // Ação de clique do botão "Cadastrar"
        btnCadastrar.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Implementar tela de cadastro");
        });
    }

    private void realizarLogin() {
        String email = campoEmail.getText();

        String senha = new String(campoSenha.getPassword());

        if (email.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Ponte com o banco de dados.
        // A lógica de conexão ficará separada nas classes de Data Access Object (DAO).
        JOptionPane.showMessageDialog(this, "Adicionar validação de segurança" +
                "" +
                "" +
                "");
    }

    // Método para rodar a tela e testar visualmente
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }
}