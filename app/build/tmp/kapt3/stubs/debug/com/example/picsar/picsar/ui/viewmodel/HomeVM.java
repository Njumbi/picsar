package com.example.picsar.picsar.ui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/example/picsar/picsar/ui/viewmodel/HomeVM;", "Landroidx/lifecycle/ViewModel;", "getPhotosRepo", "Lcom/example/picsar/picsar/data/repository/GetPhotosRepo;", "(Lcom/example/picsar/picsar/data/repository/GetPhotosRepo;)V", "_fetchPhotos", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/picsar/picsar/domain/PhotosItem;", "fetchPhotos", "Landroidx/lifecycle/LiveData;", "getFetchPhotos", "()Landroidx/lifecycle/LiveData;", "getGetPhotosRepo", "()Lcom/example/picsar/picsar/data/repository/GetPhotosRepo;", "getPhotos", "", "app_debug"})
public final class HomeVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.picsar.picsar.data.repository.GetPhotosRepo getPhotosRepo = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.picsar.picsar.domain.PhotosItem>> _fetchPhotos = null;
    
    @javax.inject.Inject()
    public HomeVM(@org.jetbrains.annotations.NotNull()
    com.example.picsar.picsar.data.repository.GetPhotosRepo getPhotosRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.picsar.picsar.data.repository.GetPhotosRepo getGetPhotosRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.picsar.picsar.domain.PhotosItem>> getFetchPhotos() {
        return null;
    }
    
    public final void getPhotos() {
    }
}