package by.jrr.learn.lecture8and9;

public class Crocodile extends Animal{
    private String chechya;

    public Crocodile() {
    }

    @Override
    public void superRoar() {

    }

    public Crocodile(String chechya) {
        this.chechya = chechya;
    }

    public Crocodile(String head, String name, String weight, Integer age, String body, boolean isEating, String chechya) {
        super(head, name, weight, age, body, isEating);
        this.chechya = chechya;
    }


    public String getChechya() {
        return chechya;
    }

    public void setChechya(String chechya) {
        this.chechya = chechya;
    }
}
