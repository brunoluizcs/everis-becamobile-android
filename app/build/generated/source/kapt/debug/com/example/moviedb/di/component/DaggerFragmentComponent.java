package com.example.moviedb.di.component;

import com.example.moviedb.di.module.FragmentModule;
import com.example.moviedb.di.module.FragmentModule_ProvideListMoviesPresenterFactory;
import com.example.moviedb.ui.list.ListMoviesFragment;
import com.example.moviedb.ui.list.ListMoviesFragment_MembersInjector;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerFragmentComponent implements FragmentComponent {
  private FragmentModule fragmentModule;

  private DaggerFragmentComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static FragmentComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.fragmentModule = builder.fragmentModule;
  }

  @Override
  public void inject(ListMoviesFragment listMoviesFragment) {
    injectListMoviesFragment(listMoviesFragment);
  }

  private ListMoviesFragment injectListMoviesFragment(ListMoviesFragment instance) {
    ListMoviesFragment_MembersInjector.injectPresenter(
        instance,
        FragmentModule_ProvideListMoviesPresenterFactory.proxyProvideListMoviesPresenter(
            fragmentModule));
    return instance;
  }

  public static final class Builder {
    private FragmentModule fragmentModule;

    private Builder() {}

    public FragmentComponent build() {
      if (fragmentModule == null) {
        this.fragmentModule = new FragmentModule();
      }
      return new DaggerFragmentComponent(this);
    }

    public Builder fragmentModule(FragmentModule fragmentModule) {
      this.fragmentModule = Preconditions.checkNotNull(fragmentModule);
      return this;
    }
  }
}
