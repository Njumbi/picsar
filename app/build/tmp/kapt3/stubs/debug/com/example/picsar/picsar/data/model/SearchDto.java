package com.example.picsar.picsar.data.model;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\u0013\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ:\u0010\u0017\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R(\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/example/picsar/picsar/data/model/SearchDto;", "", "results", "", "Lcom/example/picsar/picsar/data/model/PhotosDtoItem;", "total", "", "totalPages", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "getTotal", "()Ljava/lang/Integer;", "setTotal", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTotalPages", "setTotalPages", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/example/picsar/picsar/data/model/SearchDto;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class SearchDto {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.example.picsar.picsar.data.model.PhotosDtoItem> results;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total")
    private java.lang.Integer total;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    private java.lang.Integer totalPages;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.picsar.picsar.data.model.SearchDto copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.picsar.picsar.data.model.PhotosDtoItem> results, @org.jetbrains.annotations.Nullable()
    java.lang.Integer total, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalPages) {
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
    
    public SearchDto(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.picsar.picsar.data.model.PhotosDtoItem> results, @org.jetbrains.annotations.Nullable()
    java.lang.Integer total, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalPages) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.picsar.picsar.data.model.PhotosDtoItem> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.picsar.picsar.data.model.PhotosDtoItem> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.picsar.picsar.data.model.PhotosDtoItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalPages() {
        return null;
    }
    
    public final void setTotalPages(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}