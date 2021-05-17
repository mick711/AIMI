// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.skins;

import dagger.internal.Factory;
import info.nightscout.androidaps.Config;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SkinButtonsOn_Factory implements Factory<SkinButtonsOn> {
  private final Provider<Config> configProvider;

  public SkinButtonsOn_Factory(Provider<Config> configProvider) {
    this.configProvider = configProvider;
  }

  @Override
  public SkinButtonsOn get() {
    return newInstance(configProvider.get());
  }

  public static SkinButtonsOn_Factory create(Provider<Config> configProvider) {
    return new SkinButtonsOn_Factory(configProvider);
  }

  public static SkinButtonsOn newInstance(Config config) {
    return new SkinButtonsOn(config);
  }
}
