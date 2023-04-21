package ss16.bai_tap.bai_tap2;

public class QuocGia {
    private int id;
    private String code;
    private  String name;

    public QuocGia(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public QuocGia() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "QuocGia{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
