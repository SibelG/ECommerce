package com.example.ecommerceapp.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/example/ecommerceapp/data/model/CardModel;", "", "cardNumber", "", "cardHolderName", "", "cardExpiryDate", "cardType", "Lcom/example/ecommerceapp/data/model/CardTypeEnum;", "(JLjava/lang/String;Ljava/lang/String;Lcom/example/ecommerceapp/data/model/CardTypeEnum;)V", "getCardExpiryDate", "()Ljava/lang/String;", "getCardHolderName", "getCardNumber", "()J", "getCardType", "()Lcom/example/ecommerceapp/data/model/CardTypeEnum;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class CardModel {
    private final long cardNumber = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardHolderName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardExpiryDate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.ecommerceapp.data.model.CardTypeEnum cardType = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ecommerceapp.data.model.CardModel copy(long cardNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String cardHolderName, @org.jetbrains.annotations.NotNull()
    java.lang.String cardExpiryDate, @org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.data.model.CardTypeEnum cardType) {
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
    
    public CardModel(long cardNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String cardHolderName, @org.jetbrains.annotations.NotNull()
    java.lang.String cardExpiryDate, @org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.data.model.CardTypeEnum cardType) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getCardNumber() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardHolderName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardExpiryDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ecommerceapp.data.model.CardTypeEnum component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ecommerceapp.data.model.CardTypeEnum getCardType() {
        return null;
    }
}