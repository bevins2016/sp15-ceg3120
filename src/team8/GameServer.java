/**
 * @author Hien Long
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GameServer extends JFrame
 {
	private JFrame 		mainFrame;//The main frame for Game Server
	private	JPanel		mainPanel; //The parent panel contains other panels and components
	private JPanel		gameHisPanel;//Panel that contains game history
	private JPanel		gameDetailsPanel;//Panel that contains game details
	private JList		gameHistory; //History JList
	private	JList		gameDetails; //Game details JList
	private JList		listbox;

	// Constructor of main frame
	public GameServer()
	{
		// Set the frame characteristics
		setTitle( "Game Information" );
		setSize( 1000, 600 );
		setBackground( Color.gray );

		// Create a panel to hold all other components
		mainPanel = new JPanel();
		mainPanel.setLayout( new BorderLayout() );
		getContentPane().add( mainPanel );

		// Create some items to add to the list
		String	listData[] =
		{
			"Player 1",
			"Player 2",
			"Player 3",
			"Player 4",
			"Player 5",
			"Player 6",
			"Player 7",
			"Player 8",
		};

		// Create a new listbox control
		listbox = new JList( listData );
		
		mainPanel.add( listbox, BorderLayout.CENTER );
		//mainFrame.add(mainPanel);
	}

	// Main entry point for this example
	public static void main( String args[] )
	{
		// Create an instance of the test application
		GameServer mainFrame	= new GameServer();
		mainFrame.setVisible( true );
		
	}
}
