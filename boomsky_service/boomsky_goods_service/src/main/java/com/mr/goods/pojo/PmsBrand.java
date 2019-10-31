package com.mr.goods.pojo;


import com.mr.goods.util.PageUtils;

public class PmsBrand extends PageUtils {

  private long id;
  private String name;
  private String firstLetter;
  private long sort;
  private long factoryStatus;
  private long showStatus;
  private long productCount;
  private long productCommentCount;
  private String logo;
  private String bigPic;
  private String brandStory;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getFirstLetter() {
    return firstLetter;
  }

  public void setFirstLetter(String firstLetter) {
    this.firstLetter = firstLetter;
  }


  public long getSort() {
    return sort;
  }

  public void setSort(long sort) {
    this.sort = sort;
  }


  public long getFactoryStatus() {
    return factoryStatus;
  }

  public void setFactoryStatus(long factoryStatus) {
    this.factoryStatus = factoryStatus;
  }


  public long getShowStatus() {
    return showStatus;
  }

  public void setShowStatus(long showStatus) {
    this.showStatus = showStatus;
  }


  public long getProductCount() {
    return productCount;
  }

  public void setProductCount(long productCount) {
    this.productCount = productCount;
  }


  public long getProductCommentCount() {
    return productCommentCount;
  }

  public void setProductCommentCount(long productCommentCount) {
    this.productCommentCount = productCommentCount;
  }


  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }


  public String getBigPic() {
    return bigPic;
  }

  public void setBigPic(String bigPic) {
    this.bigPic = bigPic;
  }


  public String getBrandStory() {
    return brandStory;
  }

  public void setBrandStory(String brandStory) {
    this.brandStory = brandStory;
  }

  @Override
  public String toString() {
    return "PmsBrand{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", firstLetter='" + firstLetter + '\'' +
            ", sort=" + sort +
            ", factoryStatus=" + factoryStatus +
            ", showStatus=" + showStatus +
            ", productCount=" + productCount +
            ", productCommentCount=" + productCommentCount +
            ", logo='" + logo + '\'' +
            ", bigPic='" + bigPic + '\'' +
            ", brandStory='" + brandStory + '\'' +
            '}';
  }
}
