package testing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EditTxtFieldPanelListener implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Main.checkTxtFieldValidity();
	}

}
