package com.example.picsar.picsar.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/example/picsar/picsar/ui/activities/SearchPhotosActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/picsar/picsar/ui/adapters/SearchPhotosAdapter;", "searchVm", "Lcom/example/picsar/picsar/ui/viewmodel/SearchPicturesVM;", "getSearchVm", "()Lcom/example/picsar/picsar/ui/viewmodel/SearchPicturesVM;", "searchVm$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "search", "query", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchPhotosActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.picsar.picsar.ui.adapters.SearchPhotosAdapter adapter;
    private final kotlin.Lazy searchVm$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public SearchPhotosActivity() {
        super();
    }
    
    private final com.example.picsar.picsar.ui.viewmodel.SearchPicturesVM getSearchVm() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void search(java.lang.String query) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}