public class Movie extends Film {
    private String thoiLuong;
    public Movie(int id, String tieuDe, String theLoai, String daoDien, String ngayCongChieu,String thoiLuong) {
        super(id, tieuDe, theLoai, daoDien, ngayCongChieu);
        this.thoiLuong = thoiLuong;
    }
    @Override
    public String toString() {
        return super.toString()+
                "thoiLuong  :  " + thoiLuong +
                ") ";
    }
}
