package com.example.demo.Class;

import javax.swing.*;

public abstract class Segment {


    public abstract Double getGradient() ;

    public abstract Double getIntercept() ;

    public static boolean isParallel(Segment segment1,Segment segment2){
        if(segment1.getGradient()!=null)
            return segment1.getGradient().equals( segment2.getGradient() );
        else //segment1 is vertical
            if(segment2.getGradient()==null)
                return true;//the segments are vertical
            else
                return false;

    }

    public static boolean isPerpendicolar(Segment segment1,Segment segment2){
        if(segment1.getGradient()==null || segment2.getGradient()==null)
            if(segment1.getGradient()==0 || segment2.getGradient()==0)
                return true;
            else
                return false;
        else
            return (segment1.getGradient() * segment2.getGradient()==-1);
    }

    public static boolean isIncidence(Segment segment1,Segment segment2){
        return !(isParallel(segment1,segment2));
    }

    public static Point intersection(Segment segment1,Segment segment2){
        if (isIncidence(segment1,segment2)) {
            Double x = (segment2.getIntercept()- segment1.getIntercept()) / (segment1.getGradient()- segment2.getGradient());
            Double y = segment1.getGradient()*x + segment1.getIntercept();
            return new Point(x,y);
        }
        else {
            System.out.println("there isn't intersection point");
            return null;//there isn't intersection point
        }
    }
}
