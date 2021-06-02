// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.nsclient.data;

import dagger.internal.Factory;
import info.nightscout.androidaps.interfaces.ConfigInterface;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.configBuilder.RunningConfiguration;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NSDeviceStatus_Factory implements Factory<NSDeviceStatus> {
  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<SP> spProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<NSSettingsStatus> nsSettingsStatusProvider;

  private final Provider<ConfigInterface> configProvider;

  private final Provider<RunningConfiguration> runningConfigurationProvider;

  public NSDeviceStatus_Factory(Provider<AAPSLogger> aapsLoggerProvider, Provider<SP> spProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<NSSettingsStatus> nsSettingsStatusProvider, Provider<ConfigInterface> configProvider,
      Provider<RunningConfiguration> runningConfigurationProvider) {
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.spProvider = spProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.nsSettingsStatusProvider = nsSettingsStatusProvider;
    this.configProvider = configProvider;
    this.runningConfigurationProvider = runningConfigurationProvider;
  }

  @Override
  public NSDeviceStatus get() {
    return newInstance(aapsLoggerProvider.get(), spProvider.get(), resourceHelperProvider.get(), nsSettingsStatusProvider.get(), configProvider.get(), runningConfigurationProvider.get());
  }

  public static NSDeviceStatus_Factory create(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<SP> spProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<NSSettingsStatus> nsSettingsStatusProvider, Provider<ConfigInterface> configProvider,
      Provider<RunningConfiguration> runningConfigurationProvider) {
    return new NSDeviceStatus_Factory(aapsLoggerProvider, spProvider, resourceHelperProvider, nsSettingsStatusProvider, configProvider, runningConfigurationProvider);
  }

  public static NSDeviceStatus newInstance(AAPSLogger aapsLogger, SP sp,
      ResourceHelper resourceHelper, NSSettingsStatus nsSettingsStatus, ConfigInterface config,
      RunningConfiguration runningConfiguration) {
    return new NSDeviceStatus(aapsLogger, sp, resourceHelper, nsSettingsStatus, config, runningConfiguration);
  }
}
