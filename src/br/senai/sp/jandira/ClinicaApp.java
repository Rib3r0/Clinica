package br.senai.sp.jandira;

import br.senai.sp.jandira.ui.MainFrame;
import java.awt.Image;
import java.awt.Toolkit;

public class ClinicaApp {

    public static void main(String[] args) {

        MainFrame main = new MainFrame();
        main.setResizable(false);
        main.setVisible(true);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\22282115\\eclipse-workspace\\Clinica\\src\\br\\senai\\sp\\jandira\\img\\agendar.png");    
        main.setIconImage(icon); 
    }


}
