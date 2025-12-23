import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Game extends JFrame {
    private String player1 = "O";
    private String move;
    final private int[][] winningCombination = {
            {0,1,2},
            {3,4,5},
            {6,7,8},
            {0,3,6},
            {1,4,7},
            {2,5,8},
            {0,4,8},
            {6,4,2}
    };

    private ArrayList<JButton> buttons = new ArrayList<>();

    public Game() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(512, 512);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3,3));

        for (int i = 0; i < 9; i++) {
            JButton newButton = new JButton();
            newButton.setBackground(Color.white);
            newButton.setFocusable(false);
            newButton.setFont(new Font("Comic Sans", Font.BOLD, 72));
            newButton.addActionListener(_ -> {
                if (!newButton.getText().isBlank()) return;
                newButton.setText(move);
                String currentMove = move;
                if (move.equals("O")) {
                    newButton.setForeground(Color.BLUE);
                    move = "X";
                } else {
                    newButton.setForeground(Color.RED);
                    move = "O";
                }
                checkCombination(currentMove);
            });
            buttons.add(newButton);
            add(newButton);
        }
        setVisible(true);
        start();
    }

    public void start() {
        move = (new Random().nextBoolean()) ? "O" : "X";
        String message = String.format("%s will be playing first!", ((move.equals(player1)) ? "Player 1" : "Player 2"));
        JOptionPane.showMessageDialog(null, message, "Player", JOptionPane.INFORMATION_MESSAGE);
        for (JButton button : buttons) {
            button.setText("");
        }
    }

    private void checkCombination(String move) {
        for (int[] combination : winningCombination) {
            boolean position1match = buttons.get(combination[0]).getText().equals(move);
            boolean position2match = buttons.get(combination[1]).getText().equals(move);
            boolean position3match = buttons.get(combination[2]).getText().equals(move);
            if (position1match && position2match && position3match) {
                String message = String.format("Congratulations! %s won the game!", ((move.equals(player1)) ? "Player 1" : "Player 2"));
                JOptionPane.showMessageDialog(null, message, "Winner", JOptionPane.INFORMATION_MESSAGE);
                start();
            }
        }
        for (JButton button : buttons) {
            if (button.getText().isBlank()) {
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "It's a draw!", "Tie", JOptionPane.INFORMATION_MESSAGE);
        start();
    }
}
