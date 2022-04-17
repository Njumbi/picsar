// Generated by Dagger (https://dagger.dev).
package com.example.picsar.picsar.di;

import com.example.picsar.picsar.data.ApiService;
import com.example.picsar.picsar.data.repository.SearchPhotosRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesSearchPhotosRepoFactory implements Factory<SearchPhotosRepo> {
  private final Provider<ApiService> apiServiceProvider;

  public AppModule_ProvidesSearchPhotosRepoFactory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public SearchPhotosRepo get() {
    return providesSearchPhotosRepo(apiServiceProvider.get());
  }

  public static AppModule_ProvidesSearchPhotosRepoFactory create(
      Provider<ApiService> apiServiceProvider) {
    return new AppModule_ProvidesSearchPhotosRepoFactory(apiServiceProvider);
  }

  public static SearchPhotosRepo providesSearchPhotosRepo(ApiService apiService) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesSearchPhotosRepo(apiService));
  }
}