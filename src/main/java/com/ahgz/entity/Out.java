package com.ahgz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@ApiModel(value="Out对象", description="")
public class Out extends Model<Out> {

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

    @ApiModelProperty(value = "图号")
    private String figureNumber;

    @ApiModelProperty(value = "材料")
    private String material;

    @ApiModelProperty(value = "领用数量")
    private Integer number;

    @ApiModelProperty(value = "领用人")
    private String receiveName;

    @ApiModelProperty(value = "领用时间")
    private LocalDateTime receiveTime;

    @ApiModelProperty(value = "创建人")
    private String createdName;

    @ApiModelProperty(value = "创建时间")
    private LocalDate createdTime;

    @ApiModelProperty(value = "更新人")
    private String updatedName;

    @ApiModelProperty(value = "更新时间")
    private LocalDate updatedTime;

    @ApiModelProperty(value = "供货商")
    private String supplier;

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

    public String getFigureNumber() {
        return figureNumber;
    }

    public void setFigureNumber(String figureNumber) {
        this.figureNumber = figureNumber;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public LocalDateTime getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(LocalDateTime receiveTime) {
        this.receiveTime = receiveTime;
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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
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
        return "Out{" +
        "id=" + id +
        ", matnr=" + matnr +
        ", partName=" + partName +
        ", category=" + category +
        ", partSpecification=" + partSpecification +
        ", figureNumber=" + figureNumber +
        ", material=" + material +
        ", number=" + number +
        ", receiveName=" + receiveName +
        ", receiveTime=" + receiveTime +
        ", createdName=" + createdName +
        ", createdTime=" + createdTime +
        ", updatedName=" + updatedName +
        ", updatedTime=" + updatedTime +
        ", supplier=" + supplier +
        ", mark=" + mark +
        "}";
    }
}
