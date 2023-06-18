package dev.dulred.pmsbackend.entity;

public class Post {
    private  int id;
    private  String pname;
    private  String ptype;
    private  int organization;

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", ptype='" + ptype + '\'' +
                ", organization=" + organization +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public int getOrganization() {
        return organization;
    }

    public void setOrganization(int organization) {
        this.organization = organization;
    }
}
