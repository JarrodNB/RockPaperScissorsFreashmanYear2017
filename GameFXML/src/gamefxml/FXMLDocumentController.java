package gamefxml;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**Class: Game
 * @author Jarrod Bailey
 * Version 1.0
 * Course: ITEC 2140 Spring 2017 Section 6
 * Written: April 6, 2017
 * This class is the controller for fxml document
 *
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button rock;
    @FXML
    private Button paper;
    @FXML
    private Button scissors;
    @FXML
    private TextArea textArea;
    @FXML
    private Label wins;
    @FXML
    private Label losses;
    @FXML
    private Label ties;
    
    
    public void appendText(String str) {
        Platform.runLater(() -> textArea.appendText(str));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                appendText(String.valueOf((char) b));
            }
        };
        System.setOut(new PrintStream(out, true));

        textArea.setEditable(false);
    }

     /**
	 * Method: handleRock
	 * @param ActionEvent
	 * @return void
	 * Plays rps with choice of rock
	 *
	 */
    @FXML
    private void handleRock(ActionEvent event) 
    {
        RPS choice = new Rock();
        Game game = new Game();
        adjustScore(choice.battle(game.randomComputerChoice()));
    }
    
     /**
	 * Method: handlePaper
	 * @param ActionEvent
	 * @return void
	 * Plays rps with choice of paper
	 *
	 */
    @FXML
    private void handlePaper(ActionEvent event) 
    {
        RPS choice = new Paper();
        Game game = new Game();
        adjustScore(choice.battle(game.randomComputerChoice()));
    }

     /**
	 * Method: handleScissors
	 * @param ActionEvent
	 * @return void
	 * Plays rps with choice of scissors
	 *
	 */
    @FXML
    private void handleScissors(ActionEvent event) 
    {
        RPS choice = new Scissors();
        Game game = new Game();
        adjustScore(choice.battle(game.randomComputerChoice()));
    }
    
     /**
	 * Method: reset
	 * @param ActionEvent
	 * @return void
	 * Sets scores to 0 and clears textarea
	 *
	 */
    @FXML
    private void reset(ActionEvent event) 
    {
        losses.setText("0");
        ties.setText("0");
        wins.setText("0");
        textArea.clear();
    }
    
    /**
	 * Method: adjustScore
	 * @param int score
	 * @return void
	 * Updates the displayed scores
	 *
	 */
    public void adjustScore(int score)
    {
        switch (score)
        {
            case -1: losses.setText(Integer.parseInt(losses.getText())+ 1 + ""); break;
            case 0: ties.setText(Integer.parseInt(ties.getText())+ 1 + ""); break;
            case 1: wins.setText(Integer.parseInt(wins.getText())+ 1 + ""); break;
        }
    }
}
