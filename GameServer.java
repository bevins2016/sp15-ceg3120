/**
 * @author Hien Long
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GameServer extends JFrame
 {
	
	public GameServer(){
		buildGUI();
	}
	private void buildGUI(){
		
		//Main Frame 
		JFrame mainFrame = new JFrame("Game Server");
		mainFrame.setSize( 800, 500 );
		mainFrame.setBackground( Color.gray );
		

		// Create a panel to hold all other components
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout( new BorderLayout() );
		mainFrame.add(mainPanel);
		
		//Create Game History Panel 
		JPanel gameHistory = new JPanel();
		gameHistory.setPreferredSize(new Dimension(250,500));
		gameHistory.setBackground(Color.white);
		gameHistory.setLayout(new BorderLayout());
		JLabel dbStatus = new JLabel("            DB Status: [Green/Yellow/Red]");
		
		JLabel GameHistoryLabel = new JLabel("                              Game History");
		gameHistory.add(GameHistoryLabel, BorderLayout.NORTH);
		gameHistory.add(dbStatus, BorderLayout.SOUTH);
		
		
		//Create Game Details Panel
		JPanel gameDetails =  new JPanel();
		gameDetails.setPreferredSize(new Dimension(530,500));
		gameDetails.setBackground(Color.white);
		gameDetails.setLayout(new BorderLayout());		
		JLabel gameDetailLabel = new JLabel("                                                  Game Details");
		JLabel gameStatus = new JLabel("Game Status: [Waiting/In Progress/Complete]");
		
		// Create some items to add to the list
		String	details[] =
		{
			"Player 1(IP:10.229.154.203)|State:Wait \n Health:45/50|Position:(28,19)",
			"Player 2(IP:10.229.154.203)|State:Wait \n Health:45/50|Position:(28,19)",
			"Player 3(IP:10.229.154.203)|State:Wait \n Health:45/50|Position:(28,19)",
			"Player 4(IP:10.229.154.203)|State:Wait \n Health:45/50|Position:(28,19)",
			"Player 5(IP:10.229.154.203)|State:Wait \n Health:45/50|Position:(28,19)",
			"Player 6(IP:10.229.154.203)|State:Wait \n Health:45/50|Position:(28,19)",
			"Player 7(IP:10.229.154.203)|State:Wait \n Health:45/50|Position:(28,19)",
			"Player 8(IP:10.229.154.203)|State:Wait \n Health:45/50|Position:(28,19)",
		};

		JList listbox = new JList( details );
	
		
		gameDetails.add( listbox, BorderLayout.CENTER);
		gameDetails.add(gameDetailLabel, BorderLayout.NORTH);
		gameDetails.add(gameStatus, BorderLayout.SOUTH);
		
		//Adding panels to the main panel and frame
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(gameHistory, BorderLayout.WEST);
		mainPanel.add(gameDetails, BorderLayout.EAST);
		mainFrame.add(mainPanel);
		mainFrame.setVisible( true );
		
	}
	
	/*************************************************************************************************/
	public static void main(String[] args)
	{
		// Create an instance of the application
		
		GameServer gs = new GameServer();
	}
}