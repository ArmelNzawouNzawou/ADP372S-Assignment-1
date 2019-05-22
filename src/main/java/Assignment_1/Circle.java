package Assignment_1;


import javax.swing.JOptionPane;


public class Circle {


    double radius;


    public Circle()
    {
        radius =0.0;
    }


    public Circle (double inRadius)
    {
        if (radius > 0)
        {
            radius = inRadius;
        }
        else {radius = 0.0;}

    }

    public void setRadius (double inRadius)
    {
        radius = inRadius;
    }

    public double getRadius() {return  radius ;}

    public double getDiameter (){ return (radius*2); }

    public double getCircumference (){ return (2* Math.PI *radius); }

    public double getArea (){ return (Math.PI *radius*radius ); }



        public static void main (String[]args){

        String userInput;
        double userRadius1, userRadius2;

        Circle circleOne = new Circle();
        Circle circleTwo = new Circle();


        userInput = JOptionPane.showInputDialog("Please Esnter Circle 1 Radius");
        userRadius1 = Double.parseDouble(userInput);

        userInput = JOptionPane.showInputDialog("Please Enter Circle 2 Radius");
        userRadius2 = Double.parseDouble(userInput);


        circleOne.setRadius(userRadius1);
        circleTwo.setRadius(userRadius2);
        JOptionPane.showMessageDialog(null, "Your circle 1  radius is: " + userRadius1
                + "\n The circle 1 Diameter is: " + circleOne.getDiameter()
                + "\n The circle 1 Circumference is: " + circleOne.getCircumference()
                + "\n The Circle 1 Area is: " + circleOne.getArea());

        JOptionPane.showMessageDialog(null, "Your circle 2  radius is: " + userRadius2
                + "\n The circle 2 Diameter is: " + circleTwo.getDiameter()
                + "\n The circle 2 Circumference is: " + circleTwo.getCircumference()
                + "\n The Circle 2 Area is: " + circleTwo.getArea());


    }

}




