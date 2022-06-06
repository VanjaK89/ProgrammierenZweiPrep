package KindergartenUB06;

public class Kind {
    private String vname;
    private String zuname;
    private int age;

    public Kind(String vname, String zuname, int age) {
        this.vname = vname;
        this.zuname = zuname;
        this.age = age;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getZuname() {
        return zuname;
    }

    public void setZuname(String zuname) {
        this.zuname = zuname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Kind{" +
                "vname='" + vname + '\'' +
                ", zuname='" + zuname + '\'' +
                ", age=" + age +
                '}';
    }

}
