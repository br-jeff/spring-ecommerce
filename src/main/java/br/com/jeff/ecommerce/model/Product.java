package br.com.jeff.ecommerce.model;

import java.math.BigDecimal;
import java.util.List;

public class Product {
  private Long id;
  private String name;
  private String description;
  private BigDecimal pirce;
  private String brand;
  private int inventory;

  private Category category;

  private List<Image> images;
}
