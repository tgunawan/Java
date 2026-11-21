package UI;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Dimension;


public class manualSize {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            final int MAX_Width = 800;
            final int MIN_Width = 400;
            final int MAX_Height = 600;
            final int MIN_Height = 300;

            JFrame frame = new JFrame("Batas size");
            frame.setSize(600,400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            frame.addComponentListener(new ComponentAdapter(){
                @Override 
                public  void componentResized(ComponentEvent e){
                    int currentWidth=frame.getWidth();
                    int currentHeight = frame.getHeight();

                    int clampedHeight = Math.max(MIN_Height, Math.min(currentHeight, MAX_Height));
                    int clampedWidth = Math.max(MIN_Width, Math.min(currentWidth, MAX_Width));

                    if (currentWidth != clampedWidth || currentHeight != clampedHeight){
                        frame.setSize(new Dimension(clampedWidth,clampedHeight));
                    }
                }
            });
            frame.add(new JLabel("Maksimum 800x600",JLabel.CENTER));
            frame.setVisible(true);
        });
    }
}
