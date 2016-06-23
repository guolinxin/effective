package org.linxin.effective.ch4;

/**
 * Created by linxing on 21/06/2016.
 */

class Circle extends FigureNew {
    final double radius;
    Circle(double radius) { this.radius = radius; }
    double area() { return Math.PI * (radius * radius); }
}