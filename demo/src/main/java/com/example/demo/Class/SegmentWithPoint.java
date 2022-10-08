package com.example.demo.Class;

public class SegmentWithPoint extends Segment {
    public Point point1;
    public Point point2;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public Double getGradient() {
        if (point1.getX()!=point2.getX())
            return (point1.getY() - point2.getY()) / (point1.getX() - point2.getX());
        else{//The segment is vertical
            System.out.println("The gradient is infinite");
            return null;
        }
    }



    @Override
    public Double getIntercept() {
        if (point1.getX()!=point2.getX())
            return -getGradient()*point1.getX() + point1.getY();
        else{//The segment is vertical
            System.out.println("There isn't intercept");
            return null;
        }
    }
}
