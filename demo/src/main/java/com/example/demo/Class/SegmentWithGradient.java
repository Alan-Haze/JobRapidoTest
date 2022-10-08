package com.example.demo.Class;

public class SegmentWithGradient extends Segment{
    //In this class verticals segments aren't allowed !!
    Double gradient;
    Double intercept;

    public SegmentWithGradient(Double gradient, Double intercept) {
        this.gradient = gradient;
        this.intercept = intercept;
    }

    @Override
    public Double getGradient() {
        return gradient;
    }

    public void setGradient(Double gradient) {
        this.gradient = gradient;
    }

    @Override
    public Double getIntercept() {
        return intercept;
    }

    public void setIntercept(Double intercept) {
        this.intercept = intercept;
    }
}
