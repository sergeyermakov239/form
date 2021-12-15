package sergey.ermakov.form;

public class form {
private String name;
private String email;
private String phone;
private String questions;

public form(){

}
public form(String name,String email,String phone,String questions){
    this.name=name;
    this.email=email;
    this.phone=phone;
    this.questions=questions;
}

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getQuestions() {
        return questions;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }
}
