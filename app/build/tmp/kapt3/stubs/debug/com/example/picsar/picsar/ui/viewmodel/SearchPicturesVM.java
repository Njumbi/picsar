package com.example.picsar.picsar.ui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007R\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016\u00a8\u0006\u001f"}, d2 = {"Lcom/example/picsar/picsar/ui/viewmodel/SearchPicturesVM;", "Landroidx/lifecycle/ViewModel;", "searchPhotosRepo", "Lcom/example/picsar/picsar/data/repository/SearchPhotosRepo;", "(Lcom/example/picsar/picsar/data/repository/SearchPhotosRepo;)V", "_errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "get_errorMessage", "()Landroidx/lifecycle/MutableLiveData;", "set_errorMessage", "(Landroidx/lifecycle/MutableLiveData;)V", "_searchedPhotos", "", "Lcom/example/picsar/picsar/domain/PhotosItem;", "get_searchedPhotos", "set_searchedPhotos", "errorMessage", "Landroidx/lifecycle/LiveData;", "getErrorMessage", "()Landroidx/lifecycle/LiveData;", "setErrorMessage", "(Landroidx/lifecycle/LiveData;)V", "getSearchPhotosRepo", "()Lcom/example/picsar/picsar/data/repository/SearchPhotosRepo;", "searchedPhotos", "getSearchedPhotos", "setSearchedPhotos", "loadSearchedPhotos", "", "query", "app_debug"})
public final class SearchPicturesVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.picsar.picsar.data.repository.SearchPhotosRepo searchPhotosRepo = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.picsar.picsar.domain.PhotosItem>> _searchedPhotos;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.picsar.picsar.domain.PhotosItem>> searchedPhotos;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.String> errorMessage;
    
    @javax.inject.Inject()
    public SearchPicturesVM(@org.jetbrains.annotations.NotNull()
    com.example.picsar.picsar.data.repository.SearchPhotosRepo searchPhotosRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.picsar.picsar.data.repository.SearchPhotosRepo getSearchPhotosRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.picsar.picsar.domain.PhotosItem>> get_searchedPhotos() {
        return null;
    }
    
    public final void set_searchedPhotos(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.picsar.picsar.domain.PhotosItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.picsar.picsar.domain.PhotosItem>> getSearchedPhotos() {
        return null;
    }
    
    public final void setSearchedPhotos(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.picsar.picsar.domain.PhotosItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> get_errorMessage() {
        return null;
    }
    
    public final void set_errorMessage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.String> p0) {
    }
    
    public final void loadSearchedPhotos(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
}