package local.window.app;

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
 */

public class Window implements GLEventListener
{

	public Window()
	{
	}

	public static void main( String[] args )
	{
		GLProfile glp = GLProfile.getDefault();
		GLCapabilities caps = new GLCapabilities( glp );
		
		GLWindow window = GLWindow.create( caps );
		window.setSize( 300, 300 );
		window.setVisible( true );
		window.setTitle( "JOGL window test" );
		
		window.addWindowListener( new WindowAdapter() {
			public void windowDestroyNotify( WindowEvent arg0 ) {
				System.exit( 0 );
			};
		} );
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
