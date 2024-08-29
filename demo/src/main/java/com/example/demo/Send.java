package com.example.demo;

public class Send {
    private int id;
    private String text;
    private int rate;
    private boolean isCorrect;

    public Send(int id, String text, int r, boolean isCorrect) {
        this.id = id;
        this.text = text;
        this.rate = r;
        this.isCorrect = isCorrect;
    }
    public String getText() {
        return this.text;
    }
    public boolean isCorrect() {
        return this.isCorrect;
    }
    public int getRate() {
        return this.rate;
    }
    public int getId() {
        return this.id;
    }
}