// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.tidepool.comm;

import dagger.internal.Factory;
import info.nightscout.androidaps.MainApp;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TidepoolUploader_Factory implements Factory<TidepoolUploader> {
  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<MainApp> mainAppProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<SP> spProvider;

  private final Provider<UploadChunk> uploadChunkProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  private final Provider<DateUtil> dateUtilProvider;

  public TidepoolUploader_Factory(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<MainApp> mainAppProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<SP> spProvider,
      Provider<UploadChunk> uploadChunkProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<DateUtil> dateUtilProvider) {
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.rxBusProvider = rxBusProvider;
    this.mainAppProvider = mainAppProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.spProvider = spProvider;
    this.uploadChunkProvider = uploadChunkProvider;
    this.activePluginProvider = activePluginProvider;
    this.dateUtilProvider = dateUtilProvider;
  }

  @Override
  public TidepoolUploader get() {
    return newInstance(aapsLoggerProvider.get(), rxBusProvider.get(), mainAppProvider.get(), resourceHelperProvider.get(), spProvider.get(), uploadChunkProvider.get(), activePluginProvider.get(), dateUtilProvider.get());
  }

  public static TidepoolUploader_Factory create(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<MainApp> mainAppProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<SP> spProvider,
      Provider<UploadChunk> uploadChunkProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<DateUtil> dateUtilProvider) {
    return new TidepoolUploader_Factory(aapsLoggerProvider, rxBusProvider, mainAppProvider, resourceHelperProvider, spProvider, uploadChunkProvider, activePluginProvider, dateUtilProvider);
  }

  public static TidepoolUploader newInstance(AAPSLogger aapsLogger, RxBusWrapper rxBus,
      MainApp mainApp, ResourceHelper resourceHelper, SP sp, UploadChunk uploadChunk,
      ActivePluginProvider activePlugin, DateUtil dateUtil) {
    return new TidepoolUploader(aapsLogger, rxBus, mainApp, resourceHelper, sp, uploadChunk, activePlugin, dateUtil);
  }
}
