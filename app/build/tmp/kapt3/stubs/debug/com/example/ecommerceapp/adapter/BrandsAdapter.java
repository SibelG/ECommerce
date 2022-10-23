package com.example.ecommerceapp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/ecommerceapp/adapter/BrandsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/ecommerceapp/adapter/BrandsAdapter$ViewHolder;", "()V", "_binding", "Lcom/example/ecommerceapp/databinding/ItemBrandBinding;", "get_binding", "()Lcom/example/ecommerceapp/databinding/ItemBrandBinding;", "set_binding", "(Lcom/example/ecommerceapp/databinding/ItemBrandBinding;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/example/ecommerceapp/data/model/BrandModel;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "differCallBack", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class BrandsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.ecommerceapp.adapter.BrandsAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.example.ecommerceapp.databinding.ItemBrandBinding _binding;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.ecommerceapp.data.model.BrandModel> differCallBack = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.example.ecommerceapp.data.model.BrandModel> differ = null;
    
    public BrandsAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.ecommerceapp.databinding.ItemBrandBinding get_binding() {
        return null;
    }
    
    public final void set_binding(@org.jetbrains.annotations.Nullable()
    com.example.ecommerceapp.databinding.ItemBrandBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.example.ecommerceapp.data.model.BrandModel> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.ecommerceapp.adapter.BrandsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.adapter.BrandsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ecommerceapp/adapter/BrandsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/ecommerceapp/databinding/ItemBrandBinding;", "(Lcom/example/ecommerceapp/adapter/BrandsAdapter;Lcom/example/ecommerceapp/databinding/ItemBrandBinding;)V", "getBinding", "()Lcom/example/ecommerceapp/databinding/ItemBrandBinding;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.ecommerceapp.databinding.ItemBrandBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.ecommerceapp.databinding.ItemBrandBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.ecommerceapp.databinding.ItemBrandBinding getBinding() {
            return null;
        }
    }
}