import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Creacion de una calculadora IMC en base al ejemplo "ventana conversor" visto en clase

public class CalculadoraIMC extends JFrame {
    private JTextField pesoField;
    private JTextField estaturaField;
    private JLabel resultadoLabel;

    public CalculadoraIMC() {
        setTitle("Calculadora de IMC");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel pesoLabel = new JLabel("Peso (kg): ");
        pesoField = new JTextField();

        JLabel estaturaLabel = new JLabel("Estatura (m): ");
        estaturaField = new JTextField();

        JButton calcularButton = new JButton("Calcular IMC");
        resultadoLabel = new JLabel("IMC: ");

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });

        add(pesoLabel);
        add(pesoField);
        add(estaturaLabel);
        add(estaturaField);
        add(calcularButton);
        add(resultadoLabel);
    }

    private void calcularIMC() {
        try {
            double peso = Double.parseDouble(pesoField.getText());
            double estatura = Double.parseDouble(estaturaField.getText());
            double imc = peso / Math.pow(estatura, 2);
            resultadoLabel.setText(String.format("IMC: %.2f", imc));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
