package com.example.demo;

import com.example.demo.Class.Point;
import com.example.demo.Class.Segment;
import com.example.demo.Class.SegmentWithGradient;
import com.example.demo.Class.SegmentWithPoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Unit Test:");

		Segment segment1diagonal = new SegmentWithPoint(new Point(1.0, 0.0), new Point(2.0, 3.0));
		Segment segment2diagonal = new SegmentWithPoint(new Point(0.0, 0.0), new Point(1.0, 3.0));
		Segment segment3diagonal = new SegmentWithGradient(3.0,-3.0);
		Segment segment4diagonal = new SegmentWithGradient(3.0,0.0);
		Segment segment5diagonal = new SegmentWithPoint(new Point(0.0, 0.0), new Point(3.0, -1.0));
		Segment segment6diagonal = new SegmentWithGradient((double)-1/3,0.0);
		Segment segment1vertical = new SegmentWithPoint(new Point(0.0, 0.0), new Point(0.0, 3.0));
		Segment segment2vertical = new SegmentWithPoint(new Point(1.0, 0.0), new Point(1.0, 10.0));
		Segment segment3vertical = new SegmentWithGradient(null,-3.0);
		Segment segment4vertical = new SegmentWithGradient(null,-3.0);
		Segment segment1horizontal= new SegmentWithPoint(new Point(1.0, 0.0), new Point(10.0, 0.0));
		Segment segment2horizontal= new SegmentWithGradient(0.0,9.0);
		/*
		//point-point
		testParallel(segment1diagonal,segment2diagonal);
		testParallel(segment1diagonal,segment2vertical);
		testParallel(segment1diagonal,segment1vertical);
		//gradient-gradient
		testParallel(segment3diagonal,segment4diagonal);
		testParallel(segment3vertical,segment4vertical);
		testParallel(segment3diagonal,segment3vertical);
		//point-gradient
		testParallel(segment1diagonal,segment4diagonal);
		testParallel(segment1vertical,segment3vertical);
		testParallel(segment1diagonal,segment3vertical);*/

		//point-point
		testPerpendicolar(segment1diagonal,segment5diagonal);
		testPerpendicolar(segment1vertical,segment1horizontal);
		testPerpendicolar(segment1diagonal,segment1horizontal);
		//point-gradient
		testPerpendicolar(segment1diagonal,segment6diagonal);
		testPerpendicolar(segment3vertical,segment1horizontal);
		testPerpendicolar(segment1diagonal,segment1horizontal);
		//gradient-gradient
		testPerpendicolar(segment1diagonal,segment5diagonal);
		testPerpendicolar(segment1vertical,segment1horizontal);
		testPerpendicolar(segment1diagonal,segment2vertical);


	}
	static void testParallel(Segment segment1,Segment segment2){

		if(Segment.isParallel(segment1,segment2))
			System.out.println("Sono paralleli\n");
		else
			System.out.println("Sono incidenti\n");
	}

	static void testPerpendicolar(Segment segment1,Segment segment2){
		System.out.println("gradient1: "+segment1.getGradient());
		System.out.println("gradient2: "+segment2.getGradient());

		if(Segment.isPerpendicolar(segment1,segment2))
			System.out.println("sono perpendicolari");
		else
			System.out.println("Non sono perpendicolari");

	}
}
