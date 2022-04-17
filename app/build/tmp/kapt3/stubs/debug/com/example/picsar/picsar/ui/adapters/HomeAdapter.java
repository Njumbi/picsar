package com.example.picsar.picsar.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0014\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/picsar/picsar/ui/adapters/HomeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/picsar/picsar/ui/adapters/HomeAdapter$HomeAdapterVH;", "()V", "data", "Ljava/util/ArrayList;", "Lcom/example/picsar/picsar/domain/PhotosItem;", "listener", "Lcom/example/picsar/picsar/AdapterListener;", "clear", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "", "setListener", "HomeAdapterVH", "app_debug"})
public final class HomeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.picsar.picsar.ui.adapters.HomeAdapter.HomeAdapterVH> {
    private final java.util.ArrayList<com.example.picsar.picsar.domain.PhotosItem> data = null;
    private com.example.picsar.picsar.AdapterListener listener;
    
    public HomeAdapter() {
        super();
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.picsar.picsar.domain.PhotosItem> list) {
    }
    
    public final void clear() {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.example.picsar.picsar.AdapterListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.picsar.picsar.ui.adapters.HomeAdapter.HomeAdapterVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.picsar.picsar.ui.adapters.HomeAdapter.HomeAdapterVH holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/picsar/picsar/ui/adapters/HomeAdapter$HomeAdapterVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class HomeAdapterVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public HomeAdapterVH(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}