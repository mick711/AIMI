// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.utils.stats;

import dagger.android.HasAndroidInjector;
import dagger.internal.Factory;
import info.nightscout.androidaps.MainApp;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.interfaces.ProfileFunction;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.plugins.general.nsclient.NSUpload;
import info.nightscout.androidaps.plugins.general.nsclient.UploadQueue;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.FabricPrivacy;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TddCalculator_Factory implements Factory<TddCalculator> {
  private final Provider<HasAndroidInjector> injectorProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<MainApp> mainAppProvider;

  private final Provider<SP> spProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  private final Provider<ProfileFunction> profileFunctionProvider;

  private final Provider<FabricPrivacy> fabricPrivacyProvider;

  private final Provider<NSUpload> nsUploadProvider;

  private final Provider<DateUtil> dateUtilProvider;

  private final Provider<UploadQueue> uploadQueueProvider;

  public TddCalculator_Factory(Provider<HasAndroidInjector> injectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<MainApp> mainAppProvider,
      Provider<SP> spProvider, Provider<ActivePluginProvider> activePluginProvider,
      Provider<ProfileFunction> profileFunctionProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider, Provider<NSUpload> nsUploadProvider,
      Provider<DateUtil> dateUtilProvider, Provider<UploadQueue> uploadQueueProvider) {
    this.injectorProvider = injectorProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.rxBusProvider = rxBusProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.mainAppProvider = mainAppProvider;
    this.spProvider = spProvider;
    this.activePluginProvider = activePluginProvider;
    this.profileFunctionProvider = profileFunctionProvider;
    this.fabricPrivacyProvider = fabricPrivacyProvider;
    this.nsUploadProvider = nsUploadProvider;
    this.dateUtilProvider = dateUtilProvider;
    this.uploadQueueProvider = uploadQueueProvider;
  }

  @Override
  public TddCalculator get() {
    return newInstance(injectorProvider.get(), aapsLoggerProvider.get(), rxBusProvider.get(), resourceHelperProvider.get(), mainAppProvider.get(), spProvider.get(), activePluginProvider.get(), profileFunctionProvider.get(), fabricPrivacyProvider.get(), nsUploadProvider.get(), dateUtilProvider.get(), uploadQueueProvider.get());
  }

  public static TddCalculator_Factory create(Provider<HasAndroidInjector> injectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<MainApp> mainAppProvider,
      Provider<SP> spProvider, Provider<ActivePluginProvider> activePluginProvider,
      Provider<ProfileFunction> profileFunctionProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider, Provider<NSUpload> nsUploadProvider,
      Provider<DateUtil> dateUtilProvider, Provider<UploadQueue> uploadQueueProvider) {
    return new TddCalculator_Factory(injectorProvider, aapsLoggerProvider, rxBusProvider, resourceHelperProvider, mainAppProvider, spProvider, activePluginProvider, profileFunctionProvider, fabricPrivacyProvider, nsUploadProvider, dateUtilProvider, uploadQueueProvider);
  }

  public static TddCalculator newInstance(HasAndroidInjector injector, AAPSLogger aapsLogger,
      RxBusWrapper rxBus, ResourceHelper resourceHelper, MainApp mainApp, SP sp,
      ActivePluginProvider activePlugin, ProfileFunction profileFunction,
      FabricPrivacy fabricPrivacy, NSUpload nsUpload, DateUtil dateUtil, UploadQueue uploadQueue) {
    return new TddCalculator(injector, aapsLogger, rxBus, resourceHelper, mainApp, sp, activePlugin, profileFunction, fabricPrivacy, nsUpload, dateUtil, uploadQueue);
  }
}
