package br.com.jeff.ecommerce.model;

import java.sql.Blob;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Image
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String fileName;
  private String filePath;


  @Lob
  private Blob image;

  private String downloadUrl;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;
}
