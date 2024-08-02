package com.misscupcake.miss_catalog.products;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class ProductModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(name = "name", nullable = false)
  private String name;
  
  @Column(name = "description", nullable = false)
  private String description;

  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<ProductImageModel> images = new HashSet<>();

  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
  private ProductSpecificationModel specification;

  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
  private ProductPriceModel price;

  public ProductPriceModel getPrice() {
    return price;
  }

  public void setPrice(ProductPriceModel price) {
    this.price = price;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Set<ProductImageModel> getImages() {
    return images;
  }

  public void setImages(Set<ProductImageModel> images) {
    this.images = images;
  }

  public ProductSpecificationModel getSpecification() {
    return specification;
  }

  public void setSpecification(ProductSpecificationModel specification) {
    this.specification = specification;
  }
}
