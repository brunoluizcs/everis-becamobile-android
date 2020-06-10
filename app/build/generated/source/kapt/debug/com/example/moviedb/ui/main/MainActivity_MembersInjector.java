package com.example.moviedb.ui.main;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MainContract.Presenter> presenterProvider;

  public MainActivity_MembersInjector(Provider<MainContract.Presenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<MainContract.Presenter> presenterProvider) {
    return new MainActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectPresenter(MainActivity instance, MainContract.Presenter presenter) {
    instance.presenter = presenter;
  }
}
