package com.example.picsar.picsar.ui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/example/picsar/picsar/ui/viewmodel/SearchVM;", "Landroidx/lifecycle/ViewModel;", "getTopicPhotosRepo", "Lcom/example/picsar/picsar/data/repository/GetTopicPhotosRepo;", "(Lcom/example/picsar/picsar/data/repository/GetTopicPhotosRepo;)V", "_loadRandomPhotos", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/picsar/picsar/domain/TopicItem;", "getGetTopicPhotosRepo", "()Lcom/example/picsar/picsar/data/repository/GetTopicPhotosRepo;", "loadRandomPhotos", "Landroidx/lifecycle/LiveData;", "getLoadRandomPhotos", "()Landroidx/lifecycle/LiveData;", "setLoadRandomPhotos", "(Landroidx/lifecycle/LiveData;)V", "loadPhotos", "", "app_debug"})
public final class SearchVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.picsar.picsar.data.repository.GetTopicPhotosRepo getTopicPhotosRepo = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.picsar.picsar.domain.TopicItem>> _loadRandomPhotos;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.picsar.picsar.domain.TopicItem>> loadRandomPhotos;
    
    @javax.inject.Inject()
    public SearchVM(@org.jetbrains.annotations.NotNull()
    com.example.picsar.picsar.data.repository.GetTopicPhotosRepo getTopicPhotosRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.picsar.picsar.data.repository.GetTopicPhotosRepo getGetTopicPhotosRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.picsar.picsar.domain.TopicItem>> getLoadRandomPhotos() {
        return null;
    }
    
    public final void setLoadRandomPhotos(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.picsar.picsar.domain.TopicItem>> p0) {
    }
    
    public final void loadPhotos() {
    }
}