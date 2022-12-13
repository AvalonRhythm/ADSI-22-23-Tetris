package com.zetcode;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Login.Login;

/*
Java Tetris game clone

Author: Jan Bodnar
Website: https://zetcode.com
 */
public class Tetris extends JFrame {
	private int height;
    private int width;
    private String dificultad;
	private static final Logger logger = LogManager.getLogger(Tetris.class);
    private JLabel statusbar;

    public Tetris(String pDificultad, int pHeight, int pWidth) {
        this.dificultad = pDificultad;
        this.height = pHeight;
        this.width = pWidth;
        initUI();
    }

    private void initUI() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);

        var board = new Board(this);
        add(board);
        board.start();

        setTitle("Tetris Dificultad: " + dificultad);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    JLabel getStatusBar() {

        return statusbar;
    }

    public static void main(String[] args) {
        Login inicioSesion = new Login();
        inicioSesion.setVisible(true);
    }
}