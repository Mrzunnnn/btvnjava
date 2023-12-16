public class Film {

        private int id;
        private String tieuDe;
        private String theLoai;
        private String daoDien;
        private String ngayCongChieu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getDaoDien() {
        return daoDien;
    }

    public void setDaoDien(String daoDien) {
        this.daoDien = daoDien;
    }

    public String getNgayCongChieu() {
        return ngayCongChieu;
    }

    public void setNgayCongChieu(String ngayCongChieu) {
        this.ngayCongChieu = ngayCongChieu;
    }

    public Film(int id, String tieuDe, String theLoai, String daoDien, String ngayCongChieu){
        this.id = id;
        this.tieuDe = tieuDe;
        this.theLoai = theLoai;
        this.daoDien = daoDien;
        this.ngayCongChieu = ngayCongChieu;
    }
    @Override
    public String toString() {
        return "Film: (" +
                "id: " + id +
                ", tieuDe: " + tieuDe +
                ", theLoai: " + theLoai +
                ", daoDien: " + daoDien +
                ", ngayCongChieu: " + ngayCongChieu +"  "
                ;
    }

}

