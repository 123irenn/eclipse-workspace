package events;
import java.awt.*; 

	public class form extends Frame {
		form() { 
		 Frame f = new Frame();  
		  
	     // creating a Label  
	     Label l = new Label("Employee id:");   
	     Label a = new Label("Employee name:"); 
	     Label b = new Label("Employee contact:");
	     
	     TextField t = new TextField();
	     TextField q = new TextField();
	     TextField p = new TextField();  
	     
	     a.setBounds(60, 100, 100, 30);
	     t.setBounds(200, 100, 170, 20); 
	    
	     l.setBounds(60, 120, 100, 30);
	     q.setBounds(200, 120, 170, 20);
	      
	     b.setBounds(60, 140, 100, 30);
	     p.setBounds(200, 140, 170, 20);
	   
	     
	     
	        
	      
	     // creating a Button  
	     
	     Button c = new Button("submit");  
	     c.setBounds(150, 160, 80, 30);  

	     // adding components into frame    
	     f.add(c);  
	     f.add(l);  
	     f.add(t);  
	     f.add(a);  
	     f.add(b);  
	     f.add(p); 
	     f.add(q); 
	     // frame size 300 width and 300 height    
	     f.setSize(900,900);  
	 
	     // setting the title of frame  
	     f.setTitle("Employee info");   
	         
	     // no layout  
	     f.setLayout(null);   
	 
	     // setting visibility of frame  
	     f.setVisible(true);  
	}    

		  
		// main method  
		public static void main(String args[]) {   
		  
		// creating instance of Frame class   
			form f = new form();    
			form awt_obj = new form(); 
		  
		}  
		  
		}    
	


