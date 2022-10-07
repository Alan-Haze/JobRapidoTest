package com.example.demo.Class;

import java.awt.*;

public class Segment {
    Point point1;
    Point point2;

    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

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

    //COEFFICIENTE ANGOLARE
    public Integer getGradient(Segment segment1){
        Integer gradient = (segment1.point2.y - segment1.point1.y) / (segment1.point2.x - segment1.point1.x);

        return  gradient;
    }

    //PARALLELO only works if the length of the two lines are equal. But i wanted to keep simple
    public boolean IsParallel(Segment segment1,Segment segment2){

        if(segment1.point1.x - segment2.point1.x == segment1.point2.x - segment2.point2.x)
        return true ;

        else return false;

    }
    //PERPENDICOLARE
    public boolean IsPerpendicular(Segment segment1, Segment segment2){

        return false;
    }

}
