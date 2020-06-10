package com.example.moviedb.di.component;

import com.example.moviedb.di.module.ActivityModule;
import com.example.moviedb.di.module.ActivityModule_ProvidePresenterFactory;
import com.example.moviedb.di.module.ActivityModule_ProvidePresenterMovieDetailFactory;
import com.example.moviedb.ui.detail.DetailMovieActivity;
import com.example.moviedb.ui.detail.DetailMovieActivity_MembersInjector;
import com.example.moviedb.ui.main.MainActivity;
import com.example.moviedb.ui.main.MainActivity_MembersInjector;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerActivityComponent implements ActivityComponent {
  private ActivityModule activityModule;

  private DaggerActivityComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.activityModule = builder.activityModule;
  }

  @Override
  public void inject(MainActivity mainActivity) {
    injectMainActivity(mainActivity);
  }

  @Override
  public void injectDetailMovieActivity(DetailMovieActivity detailMovieActivity) {
    injectDetailMovieActivity2(detailMovieActivity);
  }

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectPresenter(
        instance, ActivityModule_ProvidePresenterFactory.proxyProvidePresenter(activityModule));
    return instance;
  }

  private DetailMovieActivity injectDetailMovieActivity2(DetailMovieActivity instance) {
    DetailMovieActivity_MembersInjector.injectPresenter(
        instance,
        ActivityModule_ProvidePresenterMovieDetailFactory.proxyProvidePresenterMovieDetail(
            activityModule));
    return instance;
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private Builder() {}

    public ActivityComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }
  }
}
