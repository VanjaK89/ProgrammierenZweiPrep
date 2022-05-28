import java.util.Objects;

public class PlayerBJ {
    private String name;
    private int age;

    public PlayerBJ(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PlayerBJ{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;

        if(obj == null)
            return false;

        if(getClass() != obj.getClass())
            return false;

        PlayerBJ other = (PlayerBJ) obj;
        if(age != other.age)
            return false;
        if(name == null){
            if(other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + (((name == null)) ? 0 : name.hashCode());
        return result;
    }
}
