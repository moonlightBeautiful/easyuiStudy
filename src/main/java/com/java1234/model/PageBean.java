package com.java1234.model;

public class PageBean {


    private int page; // 页码
    private int pageSize; // 页面尺寸
    private int start; // 起始页

    public PageBean(int page, int pageSize) {
        super();
        this.page = page;
        this.pageSize = pageSize;
    }

    public int getPage() {

        return page;
    }

    public void setPage(int page) {

        this.page = page;
    }

    public int getPageSize() {

        return pageSize;
    }

    public void setPageSize(int pageSize) {

        this.pageSize = pageSize;
    }

    public void setStart(int start) {

        this.start = start;
    }

    public int getStart() {

        return (page - 1) * pageSize;
    }


}
