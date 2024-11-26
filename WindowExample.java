import java.awt.*; // import OS agnostic swing libraries
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.text.SimpleDateFormat;

// Driver
public class WindowExample extends JFrame{
	static Image img;
	JButton buttonHappy, buttonSad, buttonOK, buttonNOT;
	JPanel areaPanel, topPanel, leftPanel;
	JLayeredPane bottomPanel; 

	public static void main(String[] args){
		WindowExample w = new WindowExample();
		w.make();
	}

	public void make(){
        this.setTitle("CS376: Example Window ");
        this.setSize(800,800);

        areaPanel = new JPanel();
        areaPanel.setLayout(new BorderLayout());

        topPanel = new JPanel();
        JLabel labelTop = new JLabel("You are a CS376 rockstar! Today:");
        //JLabel labelTop = new JLabel("You are a CS376 rockstar! Today:" + addTime());

        //1. left panel creation here

leftPanel = new JPanel();
leftPanel.setLayout(new BoxLayout(leftPanel,0));

        //2. bottom pane creation

        //3. happy and sad image buttons

buttonHappy = new JButton(new HappyAction());
buttonSad = new JButton(new SadAction());

        //4. happy and sad button change image

        //5. happy sad images creation here

        //6. OK and NOT button listeners to chanage images

        //7. labels with image signature 
        JLabel labelBottom = new JLabel("Image Signature ");
        //JLabel labelBottom = new JLabel("Image Signature " + imgSignature(imgHappy));
        labelBottom.setBounds(10,0,300,50);

        //8. add top panels to frame
		topPanel.add(labelTop);
        areaPanel.add(BorderLayout.PAGE_START,topPanel);

        //9. add buttons Happy and Sad to left panel
leftPanel.add(buttonHappy);
leftPanel.add(buttonSad);


        //10. add buttons OK and NOT to left panel

        //11. add left panel to frame

areaPanel.add(BorderLayout.LINE_START,leftPanel);

        //12. add images to bottom panel

        //13. add bottom panel to frame
 
        this.add(areaPanel);
        this.pack();
        this.setVisible(true);
   	}

    // 14. addTime method imoplementation


    // 15. imgSignature method imoplementation


}

//16. Happy and Sad Action listeners implemetation 

class HappyAction extends AbstractAction{
  HappyAction(){ super("Good"); }
  @Override
  public void actionPerformed(ActionEvent arg0) {
    System.out.println("Good");
  }
}


