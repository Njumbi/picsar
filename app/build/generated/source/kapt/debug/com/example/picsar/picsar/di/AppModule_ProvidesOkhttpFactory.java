// Generated by Dagger (https://dagger.dev).
package com.example.picsar.picsar.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesOkhttpFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return providesOkhttp();
  }

  public static AppModule_ProvidesOkhttpFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient providesOkhttp() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesOkhttp());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvidesOkhttpFactory INSTANCE = new AppModule_ProvidesOkhttpFactory();
  }
}