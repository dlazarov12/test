class Course {
    private String name;
    private int courseId;

    public Course(String name, int courseId) {
        this.name = name;
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public int getCourseId() {
        return courseId;
    }
}
