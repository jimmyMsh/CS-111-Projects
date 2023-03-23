
public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
    double[] newArr = new double[array.length];

    for(int i =0; i < array.length; i++)
    {
    newArr[i]= array[i];
    }
    
    return newArr;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
    
    for(int i=0; i < x.length; i++)
    {
    x[i] *= alpha;
    y[i] *= alpha;
    }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

	for(int i=0; i < x.length; i++)
    {
    x[i]+=dx;
    y[i]+=dy;
    }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

        double degInRad = Math.toRadians(theta);
        double cosTheta = Math.cos(degInRad);
        double sinTheta = Math.sin(degInRad);
        
        for(int i=0; i < x.length; i++)
        {
            double newX = x[i] * cosTheta - y[i] * sinTheta;
            double newY = y[i] * cosTheta + x[i] * sinTheta;
            x[i] = newX;
            y[i] = newY;
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
	    // Scales polygon by the factor 2.
    StdDraw.setScale(-5.0, +5.0); 
    double[] x = { 0, 1, 1, 0 }; 
    double[] y = { 0, 0, 2, 1 }; 
    double alpha = 2.0; 
    StdDraw.setPenColor(StdDraw.RED); 
    StdDraw.polygon(x, y); 
    scale(x, y, alpha); 
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.polygon(x, y);
    }
}
