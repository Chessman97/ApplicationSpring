package entity;

public class Mail {

    private Long id = 0L;

    private String subject = "subject";

    private String text = "text";

    public Mail(Long id, String subject, String text) {
        this.id = id;
        this.subject = subject;
        this.text = text;
    }

    public Mail() {

    }

    public Mail(String subject, String text) {
        this.subject = subject;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
