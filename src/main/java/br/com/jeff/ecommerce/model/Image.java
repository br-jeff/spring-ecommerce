package br.com.jeff.ecommerce.model;

import java.sql.Blob;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Image
 */
public class Image {
  private Long id;
  private String fileName;
  private String filePath;


  private Blob image;

  private String downloadUrl;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;
}
