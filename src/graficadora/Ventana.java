/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadora;

import com.frames.JFrameCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Oropeza
 */
public class Ventana extends JFrame implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JFrameCalculadora.plano.paintSQRFunc(JFrameCalculadora.plano.getGraphics(), Integer.parseInt(JFrameCalculadora.jTxtCuad.getText().trim()), Integer.parseInt(JFrameCalculadora.jTxtLin.getText().trim()), Integer.parseInt(JFrameCalculadora.jTxtCont.getText().trim()), -200, 200);
    }

    
}
