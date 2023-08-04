package com.jtl.Homework;

/**
 * @author jtl
 * java学习用
 */
public class Report {
    private String title;
    private String context;

    public Report(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + "}";
    }
}
