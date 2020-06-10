package com.example.moviedb.ui.list;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListMoviesFragment_MembersInjector
    implements MembersInjector<ListMoviesFragment> {
  private final Provider<ListMoviesContract.Presenter> presenterProvider;

  public ListMoviesFragment_MembersInjector(
      Provider<ListMoviesContract.Presenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<ListMoviesFragment> create(
      Provider<ListMoviesContract.Presenter> presenterProvider) {
    return new ListMoviesFragment_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(ListMoviesFragment instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectPresenter(
      ListMoviesFragment instance, ListMoviesContract.Presenter presenter) {
    instance.presenter = presenter;
  }
}
