package com.jdbmodel.core;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class Canvas extends JPanel {
    
    final static Color TOP_HEADER = new Color(221, 231, 248);
    final int HEADER_HEIGHT = 20;
    final int CORNER_SIZE = 20;

    private void drawTable(Graphics2D g2, String title, int x, int y, int w, int h) {
        
        // header
        GradientPaint grad = new GradientPaint(x, y, TOP_HEADER, x, y+HEADER_HEIGHT/2, Color.WHITE, true);
        g2.setPaint(grad);
        g2.fill(new RoundRectangle2D.Float(x, y, w, h, CORNER_SIZE, CORNER_SIZE));
        
        // title
        g2.setColor(Color.BLACK);
        g2.drawString(title, x+w/2, y+HEADER_HEIGHT/2);
        
        // frame/border
        g2.setColor(Color.GRAY);
        g2.drawRoundRect(x, y, w, h, CORNER_SIZE, CORNER_SIZE);
        g2.drawLine(x, y, x, y);
        
        // fields
        g2.setColor(Color.BLACK);
        g2.drawString("ADDRESS varchar(10)", x+10, y+50);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        drawTable(g2, "RUNTIME_INFO", 10, 10, 200, 300);
    }
}
