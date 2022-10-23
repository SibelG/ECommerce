package com.example.ecommerceapp.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010)\u001a\u00020\u000eH\u00c6\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0003Jo\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0001J\u0013\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010.H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018\u00a8\u00061"}, d2 = {"Lcom/example/ecommerceapp/data/model/ProductModel;", "Ljava/io/Serializable;", "productId", "", "productImage", "productTitle", "", "productDescription", "productPrice", "productCategory", "Lcom/example/ecommerceapp/data/model/CategoriesModel;", "productBrand", "Lcom/example/ecommerceapp/data/model/BrandModel;", "productStateNew", "", "productReviews", "", "Lcom/example/ecommerceapp/data/model/ReviewModel;", "(IILjava/lang/String;Ljava/lang/String;ILcom/example/ecommerceapp/data/model/CategoriesModel;Lcom/example/ecommerceapp/data/model/BrandModel;ZLjava/util/List;)V", "getProductBrand", "()Lcom/example/ecommerceapp/data/model/BrandModel;", "getProductCategory", "()Lcom/example/ecommerceapp/data/model/CategoriesModel;", "getProductDescription", "()Ljava/lang/String;", "getProductId", "()I", "getProductImage", "getProductPrice", "getProductReviews", "()Ljava/util/List;", "getProductStateNew", "()Z", "getProductTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_debug"})
public final class ProductModel implements java.io.Serializable {
    private final int productId = 0;
    private final int productImage = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String productTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String productDescription = null;
    private final int productPrice = 0;
    @org.jetbrains.annotations.Nullable()
    private final com.example.ecommerceapp.data.model.CategoriesModel productCategory = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.ecommerceapp.data.model.BrandModel productBrand = null;
    private final boolean productStateNew = false;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.ecommerceapp.data.model.ReviewModel> productReviews = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ecommerceapp.data.model.ProductModel copy(int productId, int productImage, @org.jetbrains.annotations.NotNull()
    java.lang.String productTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String productDescription, int productPrice, @org.jetbrains.annotations.Nullable()
    com.example.ecommerceapp.data.model.CategoriesModel productCategory, @org.jetbrains.annotations.Nullable()
    com.example.ecommerceapp.data.model.BrandModel productBrand, boolean productStateNew, @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {com.example.ecommerceapp.data.model.Converters.ReviewTypeConverters.class})
    java.util.List<com.example.ecommerceapp.data.model.ReviewModel> productReviews) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ProductModel(int productId, int productImage, @org.jetbrains.annotations.NotNull()
    java.lang.String productTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String productDescription, int productPrice, @org.jetbrains.annotations.Nullable()
    com.example.ecommerceapp.data.model.CategoriesModel productCategory, @org.jetbrains.annotations.Nullable()
    com.example.ecommerceapp.data.model.BrandModel productBrand, boolean productStateNew, @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {com.example.ecommerceapp.data.model.Converters.ReviewTypeConverters.class})
    java.util.List<com.example.ecommerceapp.data.model.ReviewModel> productReviews) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getProductId() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getProductImage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductDescription() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getProductPrice() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.ecommerceapp.data.model.CategoriesModel component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.ecommerceapp.data.model.CategoriesModel getProductCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.ecommerceapp.data.model.BrandModel component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.ecommerceapp.data.model.BrandModel getProductBrand() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getProductStateNew() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.ecommerceapp.data.model.ReviewModel> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.ecommerceapp.data.model.ReviewModel> getProductReviews() {
        return null;
    }
}