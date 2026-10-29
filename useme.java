package useful;

public class useme {

    // i) Method to calculate area of a shape (taking rectangle as example)
    public void area(double length, double breadth) {
        double result = length * breadth;
        System.out.println("Area = " + result);
    }

    // ii) Method to calculate salary
    public void salary(double basic, double allowances) {
        double result = basic + allowances;
        System.out.println("Salary = " + result);
    }

    // iii) Method to calculate percentage
    public void percentage(double obtainedMarks, double totalMarks) {
        double result = (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage = " + result + "%");
    }
}