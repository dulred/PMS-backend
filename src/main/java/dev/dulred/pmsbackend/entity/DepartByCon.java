package dev.dulred.pmsbackend.entity;
public class DepartByCon {
    private String dname;
    private String dtype;

    public String getDname() {
        return dname;
    }

    @Override
    public String toString() {
        return "DepartByCon{" +
                "dname='" + dname + '\'' +
                ", dtype='" + dtype + '\'' +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", startIndex=" + startIndex +
                ", act='" + act + '\'' +
                '}';
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    private int currentPage;
    private int pageSize;
    private int  startIndex;

    private String act;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public int getStartIndex() {
        this.startIndex = (this.currentPage-1)*this.getPageSize();
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }
}
