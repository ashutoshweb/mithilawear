package com.ashu.reactspringboot.product.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name="mithilawear_product")
@Data
public class Product implements Serializable {

    @Id
    @Column(name="product_id")
    private long productId;


    private String product_name;

    @Column(name="image_name")
    private String imageName;


    private String image_url;


    private String image_url_detail;


    private String image_dimension;


    private String product_type;


    private String product_category;
    private double product_price;
    private String product_description;
    private String product_created_by;
    private String product_status;
    private Timestamp product_load_time;

}
