package homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe {
    static class MyWindow extends JFrame {

        private static final String DOT_X = "X";
        private static final String DOT_O = "O";
        private static final JButton[][] cells = new JButton[3][3];

        public MyWindow() {
            setSize(500, 500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(new GridLayout(3, 3));
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

        private static boolean checkWin(char symb) {
            if (checkRowColumn(symb)) {
                return true;
            } else return chekDiag(symb);
        }

        private JButton cell() {
            JButton button = new JButton();

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if(button.getActionCommand().length() == 0) {

                        button.setActionCommand("X");
                        String temp = button.getActionCommand();
                        if (checkWin(button.getActionCommand().charAt(0))) {
                            System.out.println(button.getActionCommand() + "Победил");
                        }
                        compTurn();
                    }

                }

            });
            return button;
        }

        private static void compTurn() {
            int x, y;
            Random random = new Random();
            do {
                x = random.nextInt(3);
                y = random.nextInt(3);
            } while (!cells[x][y].getActionCommand().equals(""));
            cells[x][y].setActionCommand(DOT_O);
        }

        private static boolean chekDiag(char symb) {
            int leftDiag = 0;
            int rightDiag = 0;
            for (int i = 0; i < 3; i++) {
                leftDiag = (cells[i][i].getActionCommand().equals(symb)) ? leftDiag + 1 : 0;
                rightDiag = (cells[i][cells.length - 1 - i].getActionCommand().charAt(0) == symb) ? rightDiag + 1 : 0;
                if (leftDiag == 3 || rightDiag == 3) {
                    return true;
                }
            }
            return false;
        }

        private static boolean checkRowColumn(char symb) {
            int line = 0;
            int column = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    line = (!cells[i][j].getActionCommand().equals("") && cells[i][j].getActionCommand().equals(symb)) ? line + 1 : 0;

                    column = (!cells[j][i].getActionCommand().equals("") && cells[j][i].getActionCommand().equals(symb)) ? column + 1 : 0;
                    if (line == 3 || column == 3) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static void main(String[] args) {
            new MyWindow();
        }


    }
}
