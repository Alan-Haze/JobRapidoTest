package com.example.demo.Class;

public class SegmentWithGradient extends Segment{
    Double gradient;
    Double intercept;

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
