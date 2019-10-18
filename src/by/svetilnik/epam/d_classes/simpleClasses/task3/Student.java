package by.svetilnik.epam.d_classes.simpleClasses.task3;

public class Student {

    public String fullName;
    public String groupNumber;
    public int[] progress;

    public Student(String fullName, String groupNumber, int[] progress) {
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getProgress() {
        return progress;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }
}
