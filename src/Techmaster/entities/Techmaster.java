package Techmaster.entities;

public class Techmaster {
    private String manager;
    private String teacher;
    private ClassRoom classRoom;

    public Techmaster(String manager, String teacher) {
        this.manager = manager;
        this.teacher = teacher;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Techmaster{" +
                "manager='" + manager + '\'' +
                ", teacher='" + teacher + '\'' +
                ", classRoom=" + classRoom +
                '}';
    }
}
