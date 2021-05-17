// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.overview;

import dagger.internal.Factory;
import info.nightscout.androidaps.Config;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.aps.loop.LoopPlugin;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.utils.buildHelper.BuildHelper;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OverviewMenus_Factory implements Factory<OverviewMenus> {
  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<SP> spProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<BuildHelper> buildHelperProvider;

  private final Provider<LoopPlugin> loopPluginProvider;

  private final Provider<Config> configProvider;

  public OverviewMenus_Factory(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<SP> spProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<BuildHelper> buildHelperProvider,
      Provider<LoopPlugin> loopPluginProvider, Provider<Config> configProvider) {
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.spProvider = spProvider;
    this.rxBusProvider = rxBusProvider;
    this.buildHelperProvider = buildHelperProvider;
    this.loopPluginProvider = loopPluginProvider;
    this.configProvider = configProvider;
  }

  @Override
  public OverviewMenus get() {
    return newInstance(aapsLoggerProvider.get(), resourceHelperProvider.get(), spProvider.get(), rxBusProvider.get(), buildHelperProvider.get(), loopPluginProvider.get(), configProvider.get());
  }

  public static OverviewMenus_Factory create(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<SP> spProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<BuildHelper> buildHelperProvider,
      Provider<LoopPlugin> loopPluginProvider, Provider<Config> configProvider) {
    return new OverviewMenus_Factory(aapsLoggerProvider, resourceHelperProvider, spProvider, rxBusProvider, buildHelperProvider, loopPluginProvider, configProvider);
  }

  public static OverviewMenus newInstance(AAPSLogger aapsLogger, ResourceHelper resourceHelper,
      SP sp, RxBusWrapper rxBus, BuildHelper buildHelper, LoopPlugin loopPlugin, Config config) {
    return new OverviewMenus(aapsLogger, resourceHelper, sp, rxBus, buildHelper, loopPlugin, config);
  }
}
