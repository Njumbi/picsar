// Generated by Dagger (https://dagger.dev).
package com.example.picsar.picsar.ui.viewmodel;

import com.example.picsar.picsar.data.repository.SearchPhotosRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchPicturesVM_Factory implements Factory<SearchPicturesVM> {
  private final Provider<SearchPhotosRepo> searchPhotosRepoProvider;

  public SearchPicturesVM_Factory(Provider<SearchPhotosRepo> searchPhotosRepoProvider) {
    this.searchPhotosRepoProvider = searchPhotosRepoProvider;
  }

  @Override
  public SearchPicturesVM get() {
    return newInstance(searchPhotosRepoProvider.get());
  }

  public static SearchPicturesVM_Factory create(
      Provider<SearchPhotosRepo> searchPhotosRepoProvider) {
    return new SearchPicturesVM_Factory(searchPhotosRepoProvider);
  }

  public static SearchPicturesVM newInstance(SearchPhotosRepo searchPhotosRepo) {
    return new SearchPicturesVM(searchPhotosRepo);
  }
}
