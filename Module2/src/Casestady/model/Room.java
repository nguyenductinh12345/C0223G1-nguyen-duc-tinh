package Casestady.model;

public class Room extends FuramaResort {
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public Room(int maDichVu, String tenDichVU, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String dichVuMienPhiDiKem) {
        super(maDichVu, tenDichVU, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuMienPhiDiKem='" + dichVuMienPhiDiKem + '\'' +super.toString()+
                '}';
    }
}
