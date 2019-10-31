package com.mr.boomsky_user_service.pojoVO;

public class PmsProductItem {

    private Long id;

    private  String name;

    private Long childId;

    private String childName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getChildId() {
        return childId;
    }

    public void setChildId(Long childId) {
        this.childId = childId;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    @Override
    public String toString() {
        return "PmsProductItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", childId=" + childId +
                ", childName='" + childName + '\'' +
                '}';
    }

}
