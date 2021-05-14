package homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe {
    static class MyWindow extends JFrame {
        private static final int SIZE = 3;
        private final String DOT_X = "X";
        private final String DOT_O = "O";
        private final JButton[][] cells = new JButton[SIZE][SIZE];

        public MyWindow() {
            setSize(500, 500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(new GridLayout(SIZE, SIZE));
            cells[0][0] = cell();
            add(cells[0][0]);

            cells[0][1] = cell();
            add(cells[0][1]);

            cells[0][2] = cell();
            add(cells[0][2]);

            cells[1][0] = cell();
            add(cells[1][0]);

            cells[1][1] = cell();
            add(cells[1][1]);

            cells[1][2] = cell();
            add(cells[1][2]);

            cells[2][0] = cell();
            add(cells[2][0]);

            cells[2][1] = cell();
            add(cells[2][1]);

            cells[2][2] = cell();
            add(cells[2][2]);

            setVisible(true);
        }

        private JButton cell() {
            JButton button = new JButton();

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (button.getText().length() == 0) {
                        button.setText(DOT_X);

                        if (!checkTurn(button)) {
                            compTurn();
                        }
                    }
                }
            });
            return button;
        }

        public boolean checkWin(char symb) {
            if (cells[0][0].getText().equals(Character.toString(symb)) && cells[0][1].getText().equals(Character.toString(symb)) && cells[0][2].getText().equals(Character.toString(symb)))
                return true;
            if (cells[1][0].getText().equals(Character.toString(symb)) && cells[1][1].getText().equals(Character.toString(symb)) && cells[1][2].getText().equals(Character.toString(symb)))
                return true;
            if (cells[2][0].getText().equals(Character.toString(symb)) && cells[2][1].getText().equals(Character.toString(symb)) && cells[2][2].getText().equals(Character.toString(symb)))
                return true;
            if (cells[0][0].getText().equals(Character.toString(symb)) && cells[1][0].getText().equals(Character.toString(symb)) && cells[2][0].getText().equals(Character.toString(symb)))
                return true;
            if (cells[0][1].getText().equals(Character.toString(symb)) && cells[1][1].getText().equals(Character.toString(symb)) && cells[2][1].getText().equals(Character.toString(symb)))
                return true;
            if (cells[0][2].getText().equals(Character.toString(symb)) && cells[1][2].getText().equals(Character.toString(symb)) && cells[2][2].getText().equals(Character.toString(symb)))
                return true;
            if (cells[0][0].getText().equals(Character.toString(symb)) && cells[1][1].getText().equals(Character.toString(symb)) && cells[2][2].getText().equals(Character.toString(symb)))
                return true;
            if (cells[2][0].getText().equals(Character.toString(symb)) && cells[1][1].getText().equals(Character.toString(symb)) && cells[0][2].getText().equals(Character.toString(symb)))
                return true;
            return false;
        }

        private void compTurn() {
            int x, y;
            Random random = new Random();
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!cells[x][y].getText().equals(""));
            cells[x][y].setText(DOT_O);

            checkTurn(cells[x][y]);
        }

        private boolean checkTurn(JButton button) {
            boolean isUserWin = checkWin(button.getText().charAt(0));

            if (button.getText().length() > 0 && isUserWin) {
                JOptionPane.showMessageDialog(this, "Победил: " + button.getText());
                return true;
            } else if (isCellsFull()) {
                JOptionPane.showMessageDialog(this, "Ничья");
                return true;
            }
            return false;
        }

        private boolean isCellsFull() {
            int maxValue = 9;
            int currentValue = 0;

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (cells[i][j].getText().length() > 0) currentValue++;
                }
            }
            return currentValue == maxValue;
        }

        public static void main(String[] args) {
            new MyWindow();
        }
    }
}
