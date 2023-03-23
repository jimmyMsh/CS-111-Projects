## Polygon Transformer: A Java Library for Geometric Transformations
This Java program is a comprehensive library of static methods that performs various geometric transformations on polygons, such as scaling, translation, and rotation. To successfully implement this program, a solid foundation in linear algebra, trigonometry, and working knowledge of Java's Math class for angle conversions is necessary.

The program represents a polygon using two parallel arrays x[] and y[], which store the x- and y-coordinates of the polygon's vertices. The library provides three key geometric transformations:

Scale: Scales the coordinates of each vertex (x_i, y_i) by a factor α, using the following formulas:
x'i = α * x_i
y'i = α * y_i

Translate: Translates each vertex (x_i, y_i) by a given offset (dx, dy), using the following formulas:
x'i = x_i + dx
y'i = y_i + dy

Rotate: Rotates each vertex (x_i, y_i) by θ degrees counterclockwise around the origin, using the following formulas:
x'i = x_i * cos(θ) - y_i * sin(θ)
y'i = y_i * cos(θ) + x_i * sin(θ)
(Note: The program uses radians for angle measurements and requires conversions using Math.toRadians and Math.toDegrees.)

This project showcases the ability to create a reusable library of complex mathematical operations and caters to those with intermediate Java experience. By incorporating this library, users can efficiently manipulate polygonal shapes for various applications in computer graphics, computational geometry, and other fields that require geometric transformations.

Code to test the various methods are located at the bottom of the file.
