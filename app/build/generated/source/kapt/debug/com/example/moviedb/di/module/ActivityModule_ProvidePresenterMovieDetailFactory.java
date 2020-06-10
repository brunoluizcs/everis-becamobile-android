package com.example.moviedb.di.module;

import com.example.moviedb.ui.detail.DetailMovieContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvidePresenterMovieDetailFactory
    implements Factory<DetailMovieContract.Presenter> {
  private final ActivityModule module;

  public ActivityModule_ProvidePresenterMovieDetailFactory(ActivityModule module) {
    this.module = module;
  }

  @Override
  public DetailMovieContract.Presenter get() {
    return Preconditions.checkNotNull(
        module.providePresenterMovieDetail(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvidePresenterMovieDetailFactory create(ActivityModule module) {
    return new ActivityModule_ProvidePresenterMovieDetailFactory(module);
  }

  public static DetailMovieContract.Presenter proxyProvidePresenterMovieDetail(
      ActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.providePresenterMovieDetail(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
