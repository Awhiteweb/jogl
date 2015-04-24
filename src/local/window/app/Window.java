package local.window.app;

import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JPanel;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;
import com.jogamp.newt.event.WindowAdapter;
import com.jogamp.newt.event.WindowEvent;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;

/*
 * demo here:
 * https://github.com/sgothel/jogl/blob/master/src/test/com/jogamp/opengl/test/junit/jogl/demos/es2/av/MovieCube.java
 * 
 * https://www.youtube.com/watch?v=fQO1tOYlkTo
 * 
 */

public class Window implements GLEventListener
{
	
	private static GraphicsEnvironment graphicsEnvironment;
	private static boolean isFullScreen = false;
	public static DisplayMode dm, dm_old;
	private static Dimension xgraphic;
	private static Point point = new Point( 0, 0 );
	private static GLWindow window;

	public static void main( String[] args )
	{
		GLProfile glp = GLProfile.getDefault();
		GLCapabilities caps = new GLCapabilities( glp );
		
		window = GLWindow.create( caps );
		window.setSize( 1000, 600 );
		window.setVisible( true );
		window.setTitle( "JOGL window test" );
		
		window.addWindowListener( new WindowAdapter() {
			public void windowDestroyNotify( WindowEvent arg0 ) {
				System.exit( 0 );
			};
		} );
		
		/**
		 * Centre on screen
		 */
		
		graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice[] devices = graphicsEnvironment.getScreenDevices();
		
		dm_old = devices[0].getDisplayMode();
		dm = dm_old;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int windowX = Math.max( 0, (screenSize.width - window.getWidth() ) );
		int windowY = Math.max( 0, (screenSize.height - window.getHeight() ) );
		
		window.setPosition( windowX, windowY );
		
		/**
		 * add button control
		 */
		KeyListener fullScreenKey = new KeyListener() {
				
			@Override
			public void keyReleased( KeyEvent e )
			{
								
			}
			
			@Override
			public void keyPressed( KeyEvent e )
			{
				switch (e.getKeyCode())
				{
				case KeyEvent.VK_F:
					fullScreen();
					break;
				default:
					break;
				}
				
			}

			
		};
		
	}
	
	
	private static void fullScreen()
	{

		if( !isFullScreen )
		{
			window.setAlwaysOnTop( true );
			window.setFullscreen( true );
			isFullScreen = true;
		}
		else
		{
			window.setAlwaysOnTop( true );
			window.setFullscreen( false );
		}
	
	}
	

	@Override
	public void display( GLAutoDrawable arg0 )
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose( GLAutoDrawable arg0 )
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init( GLAutoDrawable arg0 )
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reshape( GLAutoDrawable arg0, int arg1, int arg2, int arg3,
			int arg4 )
	{
		// TODO Auto-generated method stub
		
	}

}
