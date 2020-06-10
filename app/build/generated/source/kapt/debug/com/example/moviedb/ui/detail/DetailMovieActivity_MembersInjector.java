package com.example.moviedb.ui.detail;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailMovieActivity_MembersInjector
    implements MembersInjector<DetailMovieActivity> {
  private final Provider<DetailMovieContract.Presenter> presenterProvider;

  public DetailMovieActivity_MembersInjector(
      Provider<DetailMovieContract.Presenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<DetailMovieActivity> create(
      Provider<DetailMovieContract.Presenter> presenterProvider) {
    return new DetailMovieActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(DetailMovieActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectPresenter(
      DetailMovieActivity instance, DetailMovieContract.Presenter presenter) {
    instance.presenter = presenter;
  }
}
