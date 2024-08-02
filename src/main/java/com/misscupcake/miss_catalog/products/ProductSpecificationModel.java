package com.misscupcake.miss_catalog.products;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_specification")
public class ProductSpecificationModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(name = "product_id", nullable = false)
  @OneToOne
  private ProductModel product;

  @Column(name = "size")
  private String size;

  @Column(name = "flavor")
  private String flavor;

  @Column(name = "weight")
  private BigDecimal weight;

  @Column(name = "combo_quantity")
  private Short comboQuantity;

  @Column(name = "frosting")
  private String frosting;

  @Column(name = "ingredients")
  private String ingredients;

  @Column(name = "shelf_life")
  private Short shelfLife;
  
  @Column(name = "packaging")
  private String packaging;

  @Column(name = "availability")
  private String availability;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ProductModel getProduct() {
    return product;
  }

  public void setProduct(ProductModel product) {
    this.product = product;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getFlavor() {
    return flavor;
  }

  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public Short getComboQuantity() {
    return comboQuantity;
  }

  public void setComboQuantity(Short comboQuantity) {
    this.comboQuantity = comboQuantity;
  }

  public String getFrosting() {
    return frosting;
  }

  public void setFrosting(String frosting) {
    this.frosting = frosting;
  }

  public String getIngredients() {
    return ingredients;
  }

  public void setIngredients(String ingredients) {
    this.ingredients = ingredients;
  }

  public Short getShelfLife() {
    return shelfLife;
  }

  public void setShelfLife(Short shelfLife) {
    this.shelfLife = shelfLife;
  }

  public String getPackaging() {
    return packaging;
  }

  public void setPackaging(String packaging) {
    this.packaging = packaging;
  }

  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }
}
