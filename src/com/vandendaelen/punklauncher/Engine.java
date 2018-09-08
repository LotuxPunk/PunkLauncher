package com.vandendaelen.punklauncher;

import fr.shiranuit.engine2d.Engine2D;
import fr.shiranuit.engine2d.Interfaces.IDrawCall;
import fr.shiranuit.engine2d.Interfaces.IInput;

import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class Engine extends Engine2D implements IDrawCall, IInput {

    public Engine(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void Init() {
        frameRate(30);
        TPS(20);
    }

    @Override
    public void Update() {

    }

    @Override
    public void Draw() {

    }

    @Override
    public void MouseClick(MouseEvent e) {

    }

    @Override
    public void MouseMove(MouseEvent e) {

    }

    @Override
    public void MouseDrag(MouseEvent e) {

    }

    @Override
    public void MouseEnter(MouseEvent e) {

    }

    @Override
    public void MouseLeave(MouseEvent e) {

    }

    @Override
    public void MouseWheel(MouseWheelEvent e) {

    }

    @Override
    public void MousePress(MouseEvent e) {

    }

    @Override
    public void MouseRelease(MouseEvent e) {

    }

    @Override
    public void FocusGained(FocusEvent e) {

    }

    @Override
    public void FocusLost(FocusEvent e) {

    }

    @Override
    public void KeyPressed(KeyEvent e) {

    }

    @Override
    public void KeyReleased(KeyEvent e) {

    }

    @Override
    public void KeyTyped(KeyEvent e) {

    }
}
