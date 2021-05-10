package com.ahgz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author renlirong
 * @since 2021-05-10
 */
@ApiModel(value="NonConforming对象", description="")
public class NonConforming extends Model<NonConforming> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "物料号")
    private Integer matnr;

    @ApiModelProperty(value = "零部件名称")
    private String partName;

    @ApiModelProperty(value = "所属类别")
    private String category;

    @ApiModelProperty(value = "规格")
    private String partSpecification;

    @ApiModelProperty(value = "材料")
    private String material;

    @ApiModelProperty(value = "图号")
    private String figureNumber;

    @ApiModelProperty(value = "入库数量")
    private Long quantity;

    @ApiModelProperty(value = "库位")
    private String location;

    @ApiModelProperty(value = "创建人")
    private String createdName;

    @ApiModelProperty(value = "创建时间")
    private LocalDate createdTime;

    @ApiModelProperty(value = "更新人")
    private String updatedName;

    @ApiModelProperty(value = "更新时间")
    private LocalDate updatedTime;

    @ApiModelProperty(value = "备注")
    private String mark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMatnr() {
        return matnr;
    }

    public void setMatnr(Integer matnr) {
        this.matnr = matnr;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPartSpecification() {
        return partSpecification;
    }

    public void setPartSpecification(String partSpecification) {
        this.partSpecification = partSpecification;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFigureNumber() {
        return figureNumber;
    }

    public void setFigureNumber(String figureNumber) {
        this.figureNumber = figureNumber;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCreatedName() {
        return createdName;
    }

    public void setCreatedName(String createdName) {
        this.createdName = createdName;
    }

    public LocalDate getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDate createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedName() {
        return updatedName;
    }

    public void setUpdatedName(String updatedName) {
        this.updatedName = updatedName;
    }

    public LocalDate getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDate updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "NonConforming{" +
        "id=" + id +
        ", matnr=" + matnr +
        ", partName=" + partName +
        ", category=" + category +
        ", partSpecification=" + partSpecification +
        ", material=" + material +
        ", figureNumber=" + figureNumber +
        ", quantity=" + quantity +
        ", location=" + location +
        ", createdName=" + createdName +
        ", createdTime=" + createdTime +
        ", updatedName=" + updatedName +
        ", updatedTime=" + updatedTime +
        ", mark=" + mark +
        "}";
    }
}
