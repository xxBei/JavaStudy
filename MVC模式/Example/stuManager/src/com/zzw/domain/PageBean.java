package com.zzw.domain;


import java.util.List;

/**
 * 这是一个用于封装了分页的数据
 * 里面包含:
 *
 *      该页的学生集合数据
 *      总的数据数
 *      总的页数
 *      当前页数
 *      每页的数据数
 * */
public class PageBean<T> {

    //当前页数
    private int currentPage;
    //总的页数
    private int totalPage;
    //当前数据数
    private int pageSize;
    //总的数据数
    private int totalSize;
    //当前页学生的集合数据
    private List<T> list;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
