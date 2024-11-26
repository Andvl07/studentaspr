public class student {
    protected String name;
    protected String faculty;
    protected int yearadmission;
    protected int rating;

    public student(String name, String faculty, int yearadmission, int rating) {
        this.name = name;
        this.faculty = faculty;
        this.yearadmission = yearadmission;
        this.rating = rating;
    }

    public void Show() {

        System.out.println("имя: " + name +
                "факультет: " + faculty +
                "год поступления: " + yearadmission +
                "рейтинг: " + rating);
    }
}

