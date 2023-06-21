package com.example.convertmoney.model;

public class Calculator {
    private double usd;
    private double rate;
    private double result;

    public Calculator() {
    }

    public Calculator(double usd, double vnd, double result) {
        this.usd = usd;
        this.rate = vnd;
        this.result = result;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
