import useful.useme;

class TestUseful {
    public static void main(String[] args) {
        useme obj = new useme();

        obj.area(10, 5);            // area of rectangle
        obj.salary(30000, 5000);    // basic + allowance
        obj.percentage(450, 500);   // obtained/total marks
    }
}