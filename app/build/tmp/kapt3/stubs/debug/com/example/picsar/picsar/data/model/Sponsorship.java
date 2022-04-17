package com.example.picsar.picsar.data.model;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u00c6\u0003JA\u0010\u001d\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\bH\u00d6\u0001R(\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016\u00a8\u0006$"}, d2 = {"Lcom/example/picsar/picsar/data/model/Sponsorship;", "Ljava/io/Serializable;", "impressionUrls", "", "", "sponsor", "Lcom/example/picsar/picsar/data/model/Sponsor;", "tagline", "", "taglineUrl", "(Ljava/util/List;Lcom/example/picsar/picsar/data/model/Sponsor;Ljava/lang/String;Ljava/lang/String;)V", "getImpressionUrls", "()Ljava/util/List;", "setImpressionUrls", "(Ljava/util/List;)V", "getSponsor", "()Lcom/example/picsar/picsar/data/model/Sponsor;", "setSponsor", "(Lcom/example/picsar/picsar/data/model/Sponsor;)V", "getTagline", "()Ljava/lang/String;", "setTagline", "(Ljava/lang/String;)V", "getTaglineUrl", "setTaglineUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Sponsorship implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "impression_urls")
    private java.util.List<? extends java.lang.Object> impressionUrls;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "sponsor")
    private com.example.picsar.picsar.data.model.Sponsor sponsor;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "tagline")
    private java.lang.String tagline;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "tagline_url")
    private java.lang.String taglineUrl;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.picsar.picsar.data.model.Sponsorship copy(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> impressionUrls, @org.jetbrains.annotations.Nullable()
    com.example.picsar.picsar.data.model.Sponsor sponsor, @org.jetbrains.annotations.Nullable()
    java.lang.String tagline, @org.jetbrains.annotations.Nullable()
    java.lang.String taglineUrl) {
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
    
    public Sponsorship(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> impressionUrls, @org.jetbrains.annotations.Nullable()
    com.example.picsar.picsar.data.model.Sponsor sponsor, @org.jetbrains.annotations.Nullable()
    java.lang.String tagline, @org.jetbrains.annotations.Nullable()
    java.lang.String taglineUrl) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getImpressionUrls() {
        return null;
    }
    
    public final void setImpressionUrls(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.picsar.picsar.data.model.Sponsor component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.picsar.picsar.data.model.Sponsor getSponsor() {
        return null;
    }
    
    public final void setSponsor(@org.jetbrains.annotations.Nullable()
    com.example.picsar.picsar.data.model.Sponsor p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTagline() {
        return null;
    }
    
    public final void setTagline(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTaglineUrl() {
        return null;
    }
    
    public final void setTaglineUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}