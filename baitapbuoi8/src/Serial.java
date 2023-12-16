public class Serial extends Film {
    private int soTap;
    private String avegeTime;

    public Serial(int id, String tieuDe, String theLoai, String daoDien, String ngayCongChieu,int soTap,String avegeTime) {
        super(id, tieuDe, theLoai, daoDien, ngayCongChieu);
        this.avegeTime = avegeTime;
        this.soTap = soTap;
    }
    @Override
    public String toString() {
        return super.toString()+"Số tập  " + soTap+
                " Thời lượng trung bình  :  " + avegeTime +
                ") ";
    }
}
