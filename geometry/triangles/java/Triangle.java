public class Triangle {
    
    public static final double DEGREES = 180d;
    
    /**
     * 
     * Find area of triangle given base and height
     * 
     * @param base
     * @param height
     * @return area of triangle
     */
    public static double area(double base, double height){
        
        return (base*height)/2;
        
    }
    
    /**
     * 
     * Given the side angle side of triangle find area
     * 
     * @param side1
     * @param side2
     * @param degrees
     * @return area of triangle
     */
    public static double area(double side1, double side2, double degrees){
        
        return (side1*side2*Math.sin(degrees))/2;
        
    }
    
    /**
     * 
     * Given 3 sides of a triangle find area using Heron's Formula
     * 
     * @param side1
     * @param side2
     * @param side3
     * @return area of triangle
     */
    public static double herons(double side1, double side2, double side3){
        
        double s = (side1+side2+side3)/2;
        
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        
    }
    /**
    *given all the 3 coordinates of a Triangle find its Centroid in 2-d.
    *@param x1
    *@param x2
    *@param x3
    *@param y1
    *@param y2
    *@param y3
    *@return the Centroid of the Triangle.
    */
    public static double centroid(double x1,double x2,double x3,double x3,double y1,double y2,double y3){
        double x = (x1+x2+x3)/3 ;
        double y = (y1+y2+y3)/3 ;
        System.out.println("X coordinate of the centroid is : " + x); 
        System.out.println("Y coordinate of the centroid is : " + y);
    }
    
    
}
