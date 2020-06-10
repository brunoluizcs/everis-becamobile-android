package com.example.moviedb.di.module;

import com.example.moviedb.ui.main.MainContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvidePresenterFactory
    implements Factory<MainContract.Presenter> {
  private final ActivityModule module;

  public ActivityModule_ProvidePresenterFactory(ActivityModule module) {
    this.module = module;
  }

  @Override
  public MainContract.Presenter get() {
    return Preconditions.checkNotNull(
        module.providePresenter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvidePresenterFactory create(ActivityModule module) {
    return new ActivityModule_ProvidePresenterFactory(module);
  }

  public static MainContract.Presenter proxyProvidePresenter(ActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.providePresenter(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
