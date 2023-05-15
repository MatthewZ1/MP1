public class Points
{
    private int currentPoint;
    
    public Points(int p)
    {
        currentPoint = p; 
    }

    // Uses at least one non-static method with the dot operator.
    // Uses at least one void method (excluding the main method).
    public void getPoints()
    {
        System.out.println("\nCurrent Points: " + currentPoint);
    }

    // Uses at least one non-void method.
    public int returnPoints()
    {
        return currentPoint;
    }
  
    public int addPoints(int ap)
    {
        currentPoint += ap; 
        return currentPoint; 
    }
    
    public int subtractPoints(int sp)
    {
        currentPoint -= sp; 
        return currentPoint; 
    }
} 