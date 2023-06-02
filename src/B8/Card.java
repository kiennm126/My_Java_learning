package B8;

public class Card {
    private String borrowCode;
    private String borrowDate;
    private String returnDate;
    private int bookID;
    private Student student;

    public Card(String borrowCode, String borrowDate, String returnDate, int bookID, Student student) {
        this.borrowCode = borrowCode;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.bookID = bookID;
        this.student = student;
    }

    public String getBorrowCode() {
        return borrowCode;
    }

    public void setBorrowCode(String borrowCode) {
        this.borrowCode = borrowCode;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Card{" +
                " Borrow code: " + borrowCode +
                ", Borrow date: " + borrowDate +
                ", Return date: " + returnDate +
                ", Book ID: " + bookID +
                ", " + student +
                '}';
    }
}