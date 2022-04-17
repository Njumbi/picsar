package com.example.picsar.picsar.data.model;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\bQ\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u00c3\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0010\u0010V\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0010\u0010W\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u000b\u0010X\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010^\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00f2\u0001\u0010c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010dJ\u0013\u0010e\u001a\u00020\u00032\b\u0010f\u001a\u0004\u0018\u00010gH\u00d6\u0003J\t\u0010h\u001a\u00020\u0015H\u00d6\u0001J\t\u0010i\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\'\u0010\u001d\"\u0004\b(\u0010\u001fR \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R \u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010E\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010E\u001a\u0004\bH\u0010B\"\u0004\bI\u0010DR \u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010$R \u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\"\"\u0004\bM\u0010$R \u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010$\u00a8\u0006j"}, d2 = {"Lcom/example/picsar/picsar/data/model/User;", "Ljava/io/Serializable;", "acceptedTos", "", "bio", "", "firstName", "forHire", "id", "instagramUsername", "lastName", "links", "Lcom/example/picsar/picsar/data/model/Links;", "location", "name", "portfolioUrl", "profileImage", "Lcom/example/picsar/picsar/data/model/ProfileDtoImage;", "social", "Lcom/example/picsar/picsar/data/model/Social;", "totalCollections", "", "totalLikes", "totalPhotos", "twitterUsername", "updatedAt", "username", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/picsar/picsar/data/model/Links;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/picsar/picsar/data/model/ProfileDtoImage;Lcom/example/picsar/picsar/data/model/Social;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcceptedTos", "()Ljava/lang/Boolean;", "setAcceptedTos", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getBio", "()Ljava/lang/String;", "setBio", "(Ljava/lang/String;)V", "getFirstName", "setFirstName", "getForHire", "setForHire", "getId", "setId", "getInstagramUsername", "setInstagramUsername", "getLastName", "setLastName", "getLinks", "()Lcom/example/picsar/picsar/data/model/Links;", "setLinks", "(Lcom/example/picsar/picsar/data/model/Links;)V", "getLocation", "setLocation", "getName", "setName", "getPortfolioUrl", "setPortfolioUrl", "getProfileImage", "()Lcom/example/picsar/picsar/data/model/ProfileDtoImage;", "setProfileImage", "(Lcom/example/picsar/picsar/data/model/ProfileDtoImage;)V", "getSocial", "()Lcom/example/picsar/picsar/data/model/Social;", "setSocial", "(Lcom/example/picsar/picsar/data/model/Social;)V", "getTotalCollections", "()Ljava/lang/Integer;", "setTotalCollections", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTotalLikes", "setTotalLikes", "getTotalPhotos", "setTotalPhotos", "getTwitterUsername", "setTwitterUsername", "getUpdatedAt", "setUpdatedAt", "getUsername", "setUsername", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/picsar/picsar/data/model/Links;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/picsar/picsar/data/model/ProfileDtoImage;Lcom/example/picsar/picsar/data/model/Social;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/picsar/picsar/data/model/User;", "equals", "other", "", "hashCode", "toString", "app_debug"})
public final class User implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "accepted_tos")
    private java.lang.Boolean acceptedTos;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "bio")
    private java.lang.String bio;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "first_name")
    private java.lang.String firstName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "for_hire")
    private java.lang.Boolean forHire;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "instagram_username")
    private java.lang.String instagramUsername;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "last_name")
    private java.lang.String lastName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "links")
    private com.example.picsar.picsar.data.model.Links links;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "location")
    private java.lang.String location;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "portfolio_url")
    private java.lang.String portfolioUrl;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "profile_image")
    private com.example.picsar.picsar.data.model.ProfileDtoImage profileImage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "social")
    private com.example.picsar.picsar.data.model.Social social;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_collections")
    private java.lang.Integer totalCollections;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_likes")
    private java.lang.Integer totalLikes;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_photos")
    private java.lang.Integer totalPhotos;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "twitter_username")
    private java.lang.String twitterUsername;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    private java.lang.String updatedAt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "username")
    private java.lang.String username;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.picsar.picsar.data.model.User copy(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean acceptedTos, @org.jetbrains.annotations.Nullable()
    java.lang.String bio, @org.jetbrains.annotations.Nullable()
    java.lang.String firstName, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean forHire, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String instagramUsername, @org.jetbrains.annotations.Nullable()
    java.lang.String lastName, @org.jetbrains.annotations.Nullable()
    com.example.picsar.picsar.data.model.Links links, @org.jetbrains.annotations.Nullable()
    java.lang.String location, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String portfolioUrl, @org.jetbrains.annotations.Nullable()
    com.example.picsar.picsar.data.model.ProfileDtoImage profileImage, @org.jetbrains.annotations.Nullable()
    com.example.picsar.picsar.data.model.Social social, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalCollections, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalLikes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalPhotos, @org.jetbrains.annotations.Nullable()
    java.lang.String twitterUsername, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String username) {
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
    
    public User(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean acceptedTos, @org.jetbrains.annotations.Nullable()
    java.lang.String bio, @org.jetbrains.annotations.Nullable()
    java.lang.String firstName, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean forHire, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String instagramUsername, @org.jetbrains.annotations.Nullable()
    java.lang.String lastName, @org.jetbrains.annotations.Nullable()
    com.example.picsar.picsar.data.model.Links links, @org.jetbrains.annotations.Nullable()
    java.lang.String location, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String portfolioUrl, @org.jetbrains.annotations.Nullable()
    com.example.picsar.picsar.data.model.ProfileDtoImage profileImage, @org.jetbrains.annotations.Nullable()
    com.example.picsar.picsar.data.model.Social social, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalCollections, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalLikes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalPhotos, @org.jetbrains.annotations.Nullable()
    java.lang.String twitterUsername, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAcceptedTos() {
        return null;
    }
    
    public final void setAcceptedTos(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBio() {
        return null;
    }
    
    public final void setBio(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getForHire() {
        return null;
    }
    
    public final void setForHire(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInstagramUsername() {
        return null;
    }
    
    public final void setInstagramUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.picsar.picsar.data.model.Links component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.picsar.picsar.data.model.Links getLinks() {
        return null;
    }
    
    public final void setLinks(@org.jetbrains.annotations.Nullable()
    com.example.picsar.picsar.data.model.Links p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPortfolioUrl() {
        return null;
    }
    
    public final void setPortfolioUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.picsar.picsar.data.model.ProfileDtoImage component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.picsar.picsar.data.model.ProfileDtoImage getProfileImage() {
        return null;
    }
    
    public final void setProfileImage(@org.jetbrains.annotations.Nullable()
    com.example.picsar.picsar.data.model.ProfileDtoImage p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.picsar.picsar.data.model.Social component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.picsar.picsar.data.model.Social getSocial() {
        return null;
    }
    
    public final void setSocial(@org.jetbrains.annotations.Nullable()
    com.example.picsar.picsar.data.model.Social p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalCollections() {
        return null;
    }
    
    public final void setTotalCollections(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalLikes() {
        return null;
    }
    
    public final void setTotalLikes(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalPhotos() {
        return null;
    }
    
    public final void setTotalPhotos(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTwitterUsername() {
        return null;
    }
    
    public final void setTwitterUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    public final void setUpdatedAt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}