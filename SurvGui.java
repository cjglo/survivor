import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.Socket;


public class SurvGui {

    JFrame voteF; //  frame for voting screen
    boolean voteOn = false;

    JFrame challengeF; // frame for challenges
    boolean challengeOn = false;

    

    public static void main(String[] args) {
        // System.out.println("test");
        new SurvGui();
    }

    SurvGui() {

        voteF = new JFrame();
        voteF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        challengeF = new JFrame();
        challengeF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        challengeF.setLayout( new BorderLayout() );
        // Game gamePanel = new Game();
        JPanel challengeButtonPanel = new JPanel();
        challengeButtonPanel.setLayout( new GridLayout(1,2) );
        

        challengeButtonPanel.add( new JButton("Succeed") );
        challengeButtonPanel.add( new JButton("Fail") );

        // challengeF.add ( new JPanel(), BorderLayout.CENTER );
        challengeF.add ( challengeButtonPanel, BorderLayout.SOUTH );

        // gamePanel.setPreferredSize( new Dimension(2000, 1200));
		// challengeButtonPanel.setPreferredSize( new Dimension(2000, 400 ));
        
        




        // setting the frames visible
        challengeF.setSize( new Dimension(200, 100) );
        challengeF.setVisible(true);


    }


    public class Game extends JPanel {

        // will eventually contain the code to run an challenge

    }


}