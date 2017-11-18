import java.util.Date;

/**
 * 公告类
 */
public class Notice {
    private int id;
    private String title;
    private String creator;
    private Date creatTime;

    public Notice(){

    }

    public Notice(int id,String title,String creator,Date creatTime){
        this.id = id;
        this.creator = creator;
        this.title = title;
        this.creatTime = creatTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "[公告编号："+id+",标题："+title+"，作者："+creator+"，创建时间"+creatTime+"]";
    }
}
