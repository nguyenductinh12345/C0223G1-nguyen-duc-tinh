package DemoTraiCay.model;

public class Product {
    private String id;
    private String ten;
    private int gia;
    private String ngayNhapKho;
    private String chatLuong;

    public Product() {
    }

    public Product(String id, String ten, int gia, String ngayNhapKho, String chatLuong) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.ngayNhapKho = ngayNhapKho;
        this.chatLuong = chatLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(String ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    public String getChatLuong() {
        return chatLuong;
    }

    public void setChatLuong(String chatLuong) {
        this.chatLuong = chatLuong;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +" đồng "+
                ", ngayNhapKho='" + ngayNhapKho + '\'' +
                ", chatLuong='" + chatLuong + '\'' +
                '}';
    }
    public String getToCsv(){
        return id+","+ten+","+gia+","+ngayNhapKho+","+chatLuong;
    }
}
