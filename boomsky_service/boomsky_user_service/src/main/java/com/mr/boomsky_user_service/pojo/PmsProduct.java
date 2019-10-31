package com.mr.boomsky_user_service.pojo;


import com.mr.boomsky_user_service.util.PageUtils;

import java.io.Serializable;

public class PmsProduct extends PageUtils implements Serializable{

  private long id;
  private long brandId;
  private long productCategoryId;
  private long feightTemplateId;
  private long productAttributeCategoryId;
  private String name;
  private String pic;
  private String productSn;
  private long deleteStatus;
  private long publishStatus;
  private long newStatus;
  private long recommandStatus;
  private long verifyStatus;
  private long sort;
  private long sale;
  private double price;
  private double promotionPrice;
  private long giftGrowth;
  private long giftPoint;
  private long usePointLimit;
  private String subTitle;
  private String description;
  private double originalPrice;
  private long stock;
  private long lowStock;
  private String unit;
  private double weight;
  private long previewStatus;
  private String serviceIds;
  private String keywords;
  private String note;
  private String albumPics;
  private String detailTitle;
  private String detailDesc;
  private String detailHtml;
  private String detailMobileHtml;
  private java.sql.Timestamp promotionStartTime;
  private java.sql.Timestamp promotionEndTime;
  private long promotionPerLimit;
  private long promotionType;
  private String brandName;
  private String productCategoryName;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getBrandId() {
    return brandId;
  }

  public void setBrandId(long brandId) {
    this.brandId = brandId;
  }


  public long getProductCategoryId() {
    return productCategoryId;
  }

  public void setProductCategoryId(long productCategoryId) {
    this.productCategoryId = productCategoryId;
  }


  public long getFeightTemplateId() {
    return feightTemplateId;
  }

  public void setFeightTemplateId(long feightTemplateId) {
    this.feightTemplateId = feightTemplateId;
  }


  public long getProductAttributeCategoryId() {
    return productAttributeCategoryId;
  }

  public void setProductAttributeCategoryId(long productAttributeCategoryId) {
    this.productAttributeCategoryId = productAttributeCategoryId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPic() {
    return pic;
  }

  public void setPic(String pic) {
    this.pic = pic;
  }


  public String getProductSn() {
    return productSn;
  }

  public void setProductSn(String productSn) {
    this.productSn = productSn;
  }


  public long getDeleteStatus() {
    return deleteStatus;
  }

  public void setDeleteStatus(long deleteStatus) {
    this.deleteStatus = deleteStatus;
  }


  public long getPublishStatus() {
    return publishStatus;
  }

  public void setPublishStatus(long publishStatus) {
    this.publishStatus = publishStatus;
  }


  public long getNewStatus() {
    return newStatus;
  }

  public void setNewStatus(long newStatus) {
    this.newStatus = newStatus;
  }


  public long getRecommandStatus() {
    return recommandStatus;
  }

  public void setRecommandStatus(long recommandStatus) {
    this.recommandStatus = recommandStatus;
  }


  public long getVerifyStatus() {
    return verifyStatus;
  }

  public void setVerifyStatus(long verifyStatus) {
    this.verifyStatus = verifyStatus;
  }


  public long getSort() {
    return sort;
  }

  public void setSort(long sort) {
    this.sort = sort;
  }


  public long getSale() {
    return sale;
  }

  public void setSale(long sale) {
    this.sale = sale;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public double getPromotionPrice() {
    return promotionPrice;
  }

  public void setPromotionPrice(double promotionPrice) {
    this.promotionPrice = promotionPrice;
  }


  public long getGiftGrowth() {
    return giftGrowth;
  }

  public void setGiftGrowth(long giftGrowth) {
    this.giftGrowth = giftGrowth;
  }


  public long getGiftPoint() {
    return giftPoint;
  }

  public void setGiftPoint(long giftPoint) {
    this.giftPoint = giftPoint;
  }


  public long getUsePointLimit() {
    return usePointLimit;
  }

  public void setUsePointLimit(long usePointLimit) {
    this.usePointLimit = usePointLimit;
  }


  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public double getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(double originalPrice) {
    this.originalPrice = originalPrice;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }


  public long getLowStock() {
    return lowStock;
  }

  public void setLowStock(long lowStock) {
    this.lowStock = lowStock;
  }


  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  public long getPreviewStatus() {
    return previewStatus;
  }

  public void setPreviewStatus(long previewStatus) {
    this.previewStatus = previewStatus;
  }


  public String getServiceIds() {
    return serviceIds;
  }

  public void setServiceIds(String serviceIds) {
    this.serviceIds = serviceIds;
  }


  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public String getAlbumPics() {
    return albumPics;
  }

  public void setAlbumPics(String albumPics) {
    this.albumPics = albumPics;
  }


  public String getDetailTitle() {
    return detailTitle;
  }

  public void setDetailTitle(String detailTitle) {
    this.detailTitle = detailTitle;
  }


  public String getDetailDesc() {
    return detailDesc;
  }

  public void setDetailDesc(String detailDesc) {
    this.detailDesc = detailDesc;
  }


  public String getDetailHtml() {
    return detailHtml;
  }

  public void setDetailHtml(String detailHtml) {
    this.detailHtml = detailHtml;
  }


  public String getDetailMobileHtml() {
    return detailMobileHtml;
  }

  public void setDetailMobileHtml(String detailMobileHtml) {
    this.detailMobileHtml = detailMobileHtml;
  }


  public java.sql.Timestamp getPromotionStartTime() {
    return promotionStartTime;
  }

  public void setPromotionStartTime(java.sql.Timestamp promotionStartTime) {
    this.promotionStartTime = promotionStartTime;
  }


  public java.sql.Timestamp getPromotionEndTime() {
    return promotionEndTime;
  }

  public void setPromotionEndTime(java.sql.Timestamp promotionEndTime) {
    this.promotionEndTime = promotionEndTime;
  }


  public long getPromotionPerLimit() {
    return promotionPerLimit;
  }

  public void setPromotionPerLimit(long promotionPerLimit) {
    this.promotionPerLimit = promotionPerLimit;
  }


  public long getPromotionType() {
    return promotionType;
  }

  public void setPromotionType(long promotionType) {
    this.promotionType = promotionType;
  }


  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public String getProductCategoryName() {
    return productCategoryName;
  }

  public void setProductCategoryName(String productCategoryName) {
    this.productCategoryName = productCategoryName;
  }

  @Override
  public String toString() {
    return "PmsProduct{" +
            "id=" + id +
            ", brandId=" + brandId +
            ", productCategoryId=" + productCategoryId +
            ", feightTemplateId=" + feightTemplateId +
            ", productAttributeCategoryId=" + productAttributeCategoryId +
            ", name='" + name + '\'' +
            ", pic='" + pic + '\'' +
            ", productSn='" + productSn + '\'' +
            ", deleteStatus=" + deleteStatus +
            ", publishStatus=" + publishStatus +
            ", newStatus=" + newStatus +
            ", recommandStatus=" + recommandStatus +
            ", verifyStatus=" + verifyStatus +
            ", sort=" + sort +
            ", sale=" + sale +
            ", price=" + price +
            ", promotionPrice=" + promotionPrice +
            ", giftGrowth=" + giftGrowth +
            ", giftPoint=" + giftPoint +
            ", usePointLimit=" + usePointLimit +
            ", subTitle='" + subTitle + '\'' +
            ", description='" + description + '\'' +
            ", originalPrice=" + originalPrice +
            ", stock=" + stock +
            ", lowStock=" + lowStock +
            ", unit='" + unit + '\'' +
            ", weight=" + weight +
            ", previewStatus=" + previewStatus +
            ", serviceIds='" + serviceIds + '\'' +
            ", keywords='" + keywords + '\'' +
            ", note='" + note + '\'' +
            ", albumPics='" + albumPics + '\'' +
            ", detailTitle='" + detailTitle + '\'' +
            ", detailDesc='" + detailDesc + '\'' +
            ", detailHtml='" + detailHtml + '\'' +
            ", detailMobileHtml='" + detailMobileHtml + '\'' +
            ", promotionStartTime=" + promotionStartTime +
            ", promotionEndTime=" + promotionEndTime +
            ", promotionPerLimit=" + promotionPerLimit +
            ", promotionType=" + promotionType +
            ", brandName='" + brandName + '\'' +
            ", productCategoryName='" + productCategoryName + '\'' +
            '}';
  }
}
