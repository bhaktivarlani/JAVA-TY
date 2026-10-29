class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

class UserDefinedException {
    public static void main(String[] args) {
        int marks = 120;

        try {
            if (marks < 0 || marks > 100)
                throw new InvalidMarksException("Invalid marks");
            System.out.println("Valid marks");
        }
        catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}