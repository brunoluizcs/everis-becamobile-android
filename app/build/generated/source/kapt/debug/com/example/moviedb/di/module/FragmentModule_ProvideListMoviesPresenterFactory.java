package com.example.moviedb.di.module;

import com.example.moviedb.ui.list.ListMoviesContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FragmentModule_ProvideListMoviesPresenterFactory
    implements Factory<ListMoviesContract.Presenter> {
  private final FragmentModule module;

  public FragmentModule_ProvideListMoviesPresenterFactory(FragmentModule module) {
    this.module = module;
  }

  @Override
  public ListMoviesContract.Presenter get() {
    return Preconditions.checkNotNull(
        module.provideListMoviesPresenter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static FragmentModule_ProvideListMoviesPresenterFactory create(FragmentModule module) {
    return new FragmentModule_ProvideListMoviesPresenterFactory(module);
  }

  public static ListMoviesContract.Presenter proxyProvideListMoviesPresenter(
      FragmentModule instance) {
    return Preconditions.checkNotNull(
        instance.provideListMoviesPresenter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
