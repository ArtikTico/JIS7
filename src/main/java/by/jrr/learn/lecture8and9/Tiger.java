package by.jrr.learn.lecture8and9;


public class Tiger extends Animal{
    private String tail;
    private Integer poloskiCount;

    public Tiger() {
    }

    @Override
    public void superRoar() {

    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public Integer getPoloskiCount() {
        return poloskiCount;
    }

    public void setPoloskiCount(Integer poloskiCount) {
        this.poloskiCount = poloskiCount;
    }

    public Tiger(String tail, Integer poloskiCount) {
        this.tail = tail;
        this.poloskiCount = poloskiCount;
    }

    public Tiger(String head, String name, String weight, Integer age, String body, boolean isEating, String tail, Integer poloskiCount) {
        super(head, name, weight, age, body, isEating);
        this.tail = tail;
        this.poloskiCount = poloskiCount;
    }

}
