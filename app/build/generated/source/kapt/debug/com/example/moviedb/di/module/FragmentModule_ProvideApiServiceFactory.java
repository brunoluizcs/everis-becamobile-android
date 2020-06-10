package com.example.moviedb.di.module;

import com.example.moviedb.api.ApiServiceInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FragmentModule_ProvideApiServiceFactory implements Factory<ApiServiceInterface> {
  private final FragmentModule module;

  public FragmentModule_ProvideApiServiceFactory(FragmentModule module) {
    this.module = module;
  }

  @Override
  public ApiServiceInterface get() {
    return Preconditions.checkNotNull(
        module.provideApiService(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static FragmentModule_ProvideApiServiceFactory create(FragmentModule module) {
    return new FragmentModule_ProvideApiServiceFactory(module);
  }

  public static ApiServiceInterface proxyProvideApiService(FragmentModule instance) {
    return Preconditions.checkNotNull(
        instance.provideApiService(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
